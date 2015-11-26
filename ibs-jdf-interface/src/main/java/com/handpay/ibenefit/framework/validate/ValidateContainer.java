package com.handpay.ibenefit.framework.validate;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.ProjectConfig;

public final class ValidateContainer {

	private ValidateContainer() {
	}

	private static final Map<String, List<FieldProperty>> VALIDATE_CONTAINER = new HashMap<String, List<FieldProperty>>();

	public static FieldProperty getFieldProperty(String domainName, String fieldName) {
		List<FieldProperty> fieldProperties = getAllFieldsOfTheDomain(domainName);
		for (FieldProperty fieldProperty : fieldProperties) {
			if (fieldProperty.getFieldName().equals(fieldName)) {
				return fieldProperty;
			}
		}
		return null;
	}

	public static List<FieldProperty> getAllFieldsOfTheDomain(String domainName) {
		List<FieldProperty> result = VALIDATE_CONTAINER.get(domainName);
		if (null != result) {
			return result;
		} else {
			String subClass = "." + domainName;
			for (Map.Entry<String, List<FieldProperty>> entry : VALIDATE_CONTAINER.entrySet()) {
				if (entry.getKey().endsWith(subClass) || entry.getKey().equals(domainName)) {
					return entry.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * Initialize set all fields of all domain and cache it
	 */
	static {
		for (Object entity : ProjectConfig.getAllModel()) {
			List<FieldProperty> fields = new ArrayList<FieldProperty>();
			addSuperFields(entity.getClass().getSuperclass(), fields);
			addSelfFields(entity, fields);
			VALIDATE_CONTAINER.put(entity.getClass().getName(), fields);
		}
	}

	private static void addSuperFields(Class clazz, List<FieldProperty> fields) {
		Class cSuper = clazz.getSuperclass();
		if (null != cSuper && Object.class != cSuper) {
			addSuperFields(cSuper, fields);
			Field[] fieldArr = clazz.getDeclaredFields();
			for (Field field : fieldArr) {
				int modifier = field.getModifiers();
				if (!Modifier.isStatic(modifier) && !Modifier.isFinal(modifier)) {
					FieldProperty fieldProperty = new FieldProperty(field);
					if (!fields.contains(fieldProperty)) {
						fields.add(fieldProperty);
					}
				}
			}
		}
	}

	private static void addSelfFields(Object entity, List<FieldProperty> fields) {
		Field[] fieldArr = entity.getClass().getDeclaredFields();
		for (Field field : fieldArr) {
			int modifier = field.getModifiers();
			if (!Modifier.isStatic(modifier) && !Modifier.isFinal(modifier)) {
				FieldProperty fieldProperty = new FieldProperty(field);
				if (!fields.contains(fieldProperty)) {
					fields.add(fieldProperty);
				}
			}
		}
	}

	public static Map<String, List<FieldProperty>> getAllFiledProperty() {
		return VALIDATE_CONTAINER;
	}
}
