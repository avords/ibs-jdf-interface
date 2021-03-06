package com.handpay.ibenefit.framework.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Basic entity
 * The primary key is generated automatically
 * @author Bob.Pu
 *
 */
@MappedSuperclass
public class BaseEntity extends AbstractEntity implements Identifiable {

	private static final long serialVersionUID = -348284149697647226L;

	/**
	 * Primary key
	 * Generated by table <code>id_sequences</code>
	 */
	@Id
	private Long objectId;

	@Override
	public Long getObjectId() {
		return objectId;
	}

	@Override
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
}