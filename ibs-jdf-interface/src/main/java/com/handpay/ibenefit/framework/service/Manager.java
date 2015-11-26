package com.handpay.ibenefit.framework.service;

import java.util.List;

import com.handpay.ibenefit.framework.entity.ForeverEntity;
import com.handpay.ibenefit.framework.util.PageSearch;

/**
 * CRUD interfase
 *
 * @param <T> entity
 * @param <PK> primary key
 * @author pubx 2010-3-29 09:38:26
 */
public interface Manager<T>{

	/**
	 * Query object by objectId
	 * @param objectId
	 * @return
	 */
	T getByObjectId(Long objectId);
	
	/**
	 * Delete Object by objectId
	 * @param entity
	 */
	public void delete(Long objectId);
	
	/**
	 * Logic delete entity
	 * @param entity
	 */
	void delete(ForeverEntity entity);
	
	/**
	 * Save Object with not null field
	 * @param entity
	 * @return the saved object
	 */
	T save(T entity);
	
	/**
	 * 更新实体中所有属性
	 * @param entity
	 * @return
	 */
	T updateById(T entity);
	
	/**
	 * Default for update cache of getByObjectId
	 * If update partly property, can call this to flush the cache
	 * @param objectId
	 */
	void update(Long objectId);
	
	/**
	 * Check the field is unique or else
	 * @param fieldName the field name
	 * @param value the field value, type can be String,Integer,Long,Date
	 * @param objectId optional
	 * @return
	 */
	boolean isUnique(T t);
	
	/**
	 * Query all object
	 * Only suitable for small size data
	 * @return
	 */
	public List<T> getAll();
	
	/**
	 * Query objects by sample's properties
	 * @param sample
	 * @return
	 */
	public List<T> getBySample(T sample);
	
	/**
	 * Delete objects by sample's properties
	 * @param sample
	 */
	public void deleteBySample(T sample);
	
	/**
	 * Page search objects
	 * @param page
	 * @return
	 */
	public PageSearch find(PageSearch page);
	
	/**
	 * 根据对象中不为空的属性查询记录数
	 * @param sample
	 * @return
	 */
	Long getObjectCount(T sample);
}
