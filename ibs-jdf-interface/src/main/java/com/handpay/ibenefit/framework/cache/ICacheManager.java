package com.handpay.ibenefit.framework.cache;

import java.util.Map;



/**
 * 
 * 缓存接口
 * 需要保证key的唯一性，key的生成机制采用如下方法：
 * 类的全限定名.方法名。参数值
 * 如:com.handpay.ibenefit.framework.service.getChildrenByParentId.1000
 * @author bob.pu
 *
 */
public interface ICacheManager {
	
	boolean test();

	/**
	 * 缓存字符串，如JSON字符串等
	 * @param key
	 * @param value
	 */
	void set(String key, String value);

	/**
	 * 缓存字符串,包含过期时间
	 * @param key
	 * @param value
	 * @param seconds 缓存时间 ，单位秒
	 */
	void set(String key, String value, int seconds);

	/**
	 * 删除缓存
	 * @param key
	 */
	void delete(String key);
	
	/**
	 * 缓存对象，如一般的POJO等
	 * @param key
	 * @param value 须实现序列化
	 */
	void set(String key, Object value);
	
	/**
	 * 设置或更新KEY的生存周期
	 * @param key
	 * @param seconds
	 */
	void expire(String key, int seconds);
	
	/**
	 * 缓存对象，如一般的POJO等
	 * @param key
	 * @param value 须实现序列化
	 * @param seconds 缓存时间 ，单位秒
	 */
	void set(String key, Object value, int seconds);
	
	/**
	 * 从缓存中根据key获得缓存的字符串
	 * @param key
	 * @return
	 */
	String getString(String key);
	
	/**
	 * 从缓存中根据key获得缓存的对象
	 * 可以是普通的POJO类，Map
	 * @param key
	 * @return
	 */
	public Object getObject(String key);
	
	/**
	 * 往Map中存值
	 * @param key 
	 * @param field map中的key
	 * @param value map中的值
	 */
	void hset(String key,String field, String value);
	
	/**
	 * 从Map中取值
	 * @param key 
	 * @param field map中的key
	 */
	Object hget(String key,String field);
	
	/**
	 * 获得整个Map
	 * @param key
	 * @return
	 */
	Map<String,String> hgetAll(String key);
	
	/**
	 * 从Map中删除一个值
	 * @param key
	 * @param field
	 */
	void hdel(String key,String field);
		
}
