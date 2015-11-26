package com.handpay.ibenefit.framework.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.handpay.ibenefit.framework.util.PropertyFilter.MatchType;
import com.handpay.ibenefit.framework.validate.FieldProperty;

public class PageSearch implements Serializable {
    private static final long serialVersionUID = -1419154159597545749L;
	private static final Integer SEARCH_ID_FACTOR = 10000;
	public static final Integer DEFAULT_PAGE_SIZE = 15;
	public static final String ASC = "asc";
	public static final String DESC = "desc";
	private Integer pageSize = DEFAULT_PAGE_SIZE;
	private Integer totalCount;
	private Integer currentPage;
	private List data;
	private String[] sortProperties = null;
	private String[] sortOrders = null;
	private Class entityClass;
	//Format as relation_user.objectId_userRole.userId
	//          relation_userRole.roleId_role.objectId
	private Set<String> relationships = new LinkedHashSet<String>();
	//Property name format as user.name, role.name(Root entity's name can be ignore:(user.)name)
	private List<PropertyFilter> filters = new ArrayList<PropertyFilter>();

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getTotalPage(){
		if(totalCount>0){
			return (totalCount-1)/pageSize + 1;
		}else {
			return 0;
		}
	}
	
	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	/**
	 * 返回实际的当前页，对页码进行了校验
	 * @return
	 */
	public Integer getPage(){
		if(currentPage<0){
			return 1;
		}else if(currentPage > getTotalPage()) {
			return getTotalPage();
		}else{
			return currentPage;
		}
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getBegin() {
		if (currentPage==null || currentPage < 1) {
			currentPage = 1;
		}
		return (currentPage - 1) * pageSize;
	}
	
	/**
	 * 当前页最后一条，页面显示用
	 * @return
	 */
	public Integer getLast(){
		Integer end = getEnd();
		if(end>totalCount){
			return totalCount;
		}else{
			return end;
		}
	}

	public Integer getEnd() {
		return currentPage * pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List getList() {
		return data;
	}

	public void setList(List list) {
		this.data = list;
	}

	public String getSearchId() {
		return Integer.toHexString(pageSize * SEARCH_ID_FACTOR + currentPage);
	}

	public List<PropertyFilter> getFilters() {
    	return filters;
    }

	public void setFilters(List<PropertyFilter> filters) {
    	this.filters = filters;
    }

	public Class getEntityClass() {
    	return entityClass;
    }

	public void setEntityClass(Class entityClass) {
    	this.entityClass = entityClass;
    }

	public String[] getSortProperties() {
    	return sortProperties;
    }

	public void setSortProperties(String[] sortProperties) {
    	this.sortProperties = sortProperties;
    }

	public String[] getSortOrders() {
    	return sortOrders;
    }

	public void setSortOrders(String[] sortOrders) {
    	this.sortOrders = sortOrders;
    }

	public void setSortProperty(String sortProperty) {
    	this.sortProperties = new String[]{sortProperty};
    }

	public void setSortOrder(String sortOrder) {
    	this.sortOrders = new String[]{sortOrder};
    }
	public String getSortProperty() {
		if(sortProperties!=null){
			return sortProperties[0];
		}
    	return null;
    }
	
	public String getSortOrder() {
		if(sortOrders!=null){
			return sortOrders[0];
		}
    	return null;
    }

	public Set<String> getRelationships() {
		return relationships;
	}

	public void setRelationships(Set<String> relationships) {
		this.relationships = relationships;
	}
	
	public Object getFilterValue(String filterName){
		if(filterName!=null){
			for(PropertyFilter filter : filters){
				if(filter.getFilterName().equals(filterName)){
					return filter.getPropertyValue();
				}
			}
		}
		return null;
	}

	public Map<String, Object> getParamMap() {
		Map<String, Object> param = new HashMap<String, Object>(filters.size() + 1);
		for(PropertyFilter propertyFilter :  filters){
			//带范围的，分别添加After,Before用来代表范围的开始和结束两个值。其它的属性名称不变
			if(propertyFilter.getMatchType() == MatchType.GE || propertyFilter.getMatchType() == MatchType.GT){
				param.put(propertyFilter.getPropertyName() + "After", getQueryValues(propertyFilter));
			}else if(propertyFilter.getMatchType() == MatchType.LE || propertyFilter.getMatchType() == MatchType.LT){
				param.put(propertyFilter.getPropertyName() + "Before", getQueryValues(propertyFilter));
			} else{
				param.put(propertyFilter.getPropertyName(), getQueryValues(propertyFilter));
			}
		}
		//添加排序字段，支持多列的排序
		param.put("orderBy", getOrderBy());
		return param;
	}
	
	private String getOrderBy(){
		if(sortProperties!=null && sortProperties.length>0){
			StringBuilder orderBy = new StringBuilder();
			for(int i=0;i<sortProperties.length;i++){
				if(i>0){
					orderBy.append(",");
				}
				orderBy.append(FieldProperty.propertyToField(sortProperties[i])).append(" ").append(sortOrders[i]);
			}
			return orderBy.toString();
		}
		return null;
	}
	
	public static Object getQueryValues(PropertyFilter propertyFilter) {
		MatchType matchType = propertyFilter.getMatchType();
		Object result = propertyFilter.getPropertyValue();
		if (result instanceof String) {
			switch (matchType) {
			case LIKE:
			case NLIKE:
				result = "%" + result + "%";
				break;
			case START:
				result = result + "%";
				break;
			case END:
				result = "%" + result;
			case IC:
			case NC:
				result = propertyFilter.getPropertyValues();
			default:
				break;
			}
		}
		return result;
	}
}
