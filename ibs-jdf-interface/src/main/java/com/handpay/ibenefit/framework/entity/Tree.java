package com.handpay.ibenefit.framework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.handpay.ibenefit.framework.FrameworkConstants;


/**
 * Base Tree
 */
@Entity(name="F_TREE")
public class Tree extends BaseEntity implements BaseTree{
	public static final int IS_LEAF = 1;
	public static final int IS_NOT_LEAF = 2;
	public static final int DEFAULT_DEEP_LEVEL = 0;
	public static final int DEFAULT_DEEP_LEVEL_STEP = 1;
	public static final int DEFAULT_ORDER_ID = 1;
	public static final Tree ROOT= new Tree();
	static {
		ROOT.setParentId(BaseTree.ROOT);
		ROOT.setObjectId(0L);
		ROOT.setName("ROOT");
		ROOT.setParent(true);
	}
	private Long parentId;
	@NotNull
	@Column(length = FrameworkConstants.ModelDefine.MEDIUM_LENGTH)
	private String name;
	@NotNull
	@Column(length = FrameworkConstants.ModelDefine.MEDIUM_LENGTH)
	private String layer;
	@NotNull
	private Integer levelDeep;
	@NotNull
	private Boolean isParent;
	@NotNull
	private Integer orderId;
	@NotNull
	private Integer status;
	@Column(length = FrameworkConstants.ModelDefine.SMALL_LENGTH,unique=true)
	private String code;
	private Integer property;
	@Column(length = FrameworkConstants.ModelDefine.SMALL_LENGTH)
	private String extendStr1;
	@Column(length = FrameworkConstants.ModelDefine.MEDIUM_LENGTH)
	private String icon;
	@Column(length = FrameworkConstants.ModelDefine.LARGE_LENGTH)
	private String description;
	
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getProperty() {
		return property;
	}
	public void setProperty(Integer property) {
		this.property = property;
	}
	public Integer getLevelDeep() {
		return levelDeep;
	}
	public void setLevelDeep(Integer levelDeep) {
		this.levelDeep = levelDeep;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Boolean isParent() {
		return isParent;
	}
	public void setParent(Boolean isParent) {
		this.isParent = isParent;
	}
	public String getExtendStr1() {
		return extendStr1;
	}
	public void setExtendStr1(String extendStr1) {
		this.extendStr1 = extendStr1;
	}
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
