package com.handpay.ibenefit.framework.entity;

/**
 * 不能删除实体
 * @author bob.pu
 *
 */
public class ForeverEntity extends AuditEntity {
	
	public static final int DELETED_YES = 1;
	public static final int DELETED_NO = 0;

	private Integer deleted;

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
}
