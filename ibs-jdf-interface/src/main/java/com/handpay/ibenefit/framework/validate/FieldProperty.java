package com.handpay.ibenefit.framework.validate;

import java.lang.reflect.Field;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

public class FieldProperty {
	private String fieldName;
	private String columnName;
	private Field field;
	public Field getField() {
    	return field;
    }

	public FieldProperty(Field field){
		this.field = field;
    	this.fieldName = field.getName();
    	this.columnName = propertyToField(this.fieldName);
	}
	
	public static String propertyToField(String property) {
		if (null == property) {
			return "";
		}
		char[] chars = property.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			if (CharUtils.isAsciiAlphaUpper(c)) {
				sb.append("_" + StringUtils.lowerCase(CharUtils.toString(c)));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	} 
	
	

	public String getFieldName() {
    	return fieldName;
    }
	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((fieldName == null) ? 0 : fieldName.hashCode());
	    return result;
    }

	@Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    FieldProperty other = (FieldProperty) obj;
	    if (fieldName == null) {
		    if (other.fieldName != null)
			    return false;
	    } else if (!fieldName.equals(other.fieldName))
		    return false;
	    return true;
    }

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
