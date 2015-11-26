package com.handpay.ibenefit.framework.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
/**
 * 需审计实体，记录新增、修改的信息
 * @author bob.pu
 *
 */
public class AuditEntity extends BaseEntity {
	@NotNull
	private Long createdBy;
	@NotNull
	private Date createdOn;
	
	private Date updatedOn;
	
	private Long updatedBy;

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
}
