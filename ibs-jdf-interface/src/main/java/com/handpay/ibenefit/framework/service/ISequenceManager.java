package com.handpay.ibenefit.framework.service;

/**
 * 序列调用类
 * @author bob.pu
 *
 */
public interface ISequenceManager {
	/**
	 * 根据主键名称获取自增ID
	 * @param sequenceName
	 * @return
	 */
	public Long getNextId(String sequenceName);
	
	/**
	 * 根据主键名称获取自增编号
	 * @param sequenceName
	 * @param prefix 前缀，可为空
	 * @param digit 位数，不足的用0填充高位
	 * @return
	 */
	public String getNextNo(String sequenceName,String prefix, int digit);
}
