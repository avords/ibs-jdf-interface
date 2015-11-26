package com.handpay.ibenefit.framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;

import com.handpay.ibenefit.framework.validate.ClassPathScanningEntityProvider;

/**
 * Project Config
 * 
 * @author pubx
 * 
 */
public final class ProjectConfig {
	private static final Logger LOGGER = Logger.getLogger(ProjectConfig.class);
	private static final String DEFAULT_BASE_PACKAGE = "com.handpay.ibenefit";
	public static final String HISTORY_TABLE_SUFFIX = "_H";
	private static final String DEFAULT_VALIDATE_CODE = "478";
	private static String[] modelBasePackage;
	private static List<Object> allModel = new ArrayList<Object>();
	private static Locale detaultLocale;
	private static String defaultLocaleName;
	private static boolean enableRefreshPermission = false;
	private static String defaultSkin;
	private static int	  passwordExpired;
	private static String formGroup = ".control-group";
	private static String portalServerName;
	private static String validateCode = DEFAULT_VALIDATE_CODE;
	
	private static final int PARANT_LAYER = 3;
	/**
	 * ROOT
	 */
	public static final String ROOT_PROJECT = "";

	/**
	 * Project Name
	 */
	public static final String PROJECT_NAME;

	static {
		String url = Thread.currentThread().getContextClassLoader().getResource("").toString();
		String[] path = url.split("/");
		String context = path[path.length - PARANT_LAYER];
		if("ROOT".equalsIgnoreCase(context)){
			PROJECT_NAME = ROOT_PROJECT;
		}else{
			PROJECT_NAME = context;
		}
		//Weblogic bug
		System.getProperties().setProperty("file.encoding", "UTF-8");
	}

	public static String[] getModelBasePackage() {
		return modelBasePackage;
	}

	public void setModelBasePackage(String modelBasePackage) {
		if (StringUtils.isBlank(modelBasePackage)) {
			modelBasePackage = DEFAULT_BASE_PACKAGE;
		}
		ProjectConfig.modelBasePackage = modelBasePackage.replace(" ", "").split(",");
		Set<BeanDefinition> classes = new LinkedHashSet<BeanDefinition>();
		ClassPathScanningEntityProvider classPathScanningEntityProvider = new ClassPathScanningEntityProvider(true);
		for (String pack : ProjectConfig.modelBasePackage) {
			classes.addAll(classPathScanningEntityProvider.findCandidateComponents(pack));
		}
		for (BeanDefinition class1 : classes) {
			try {
				Object entity = Class.forName(class1.getBeanClassName()).newInstance();
				allModel.add(entity);
			} catch (Exception e) {
				LOGGER.error("setModelBasePackage", e);
			}
		}
	}

	public static List<Object> getAllModel() {
		return allModel;
	}

	public static String getIdGenerator() {
		return "";
	}

	public void setDefaultLocaleName(String defaultLocaleName) {
		ProjectConfig.defaultLocaleName = defaultLocaleName;
		if (StringUtils.isNotBlank(defaultLocaleName)) {
			Locale result = null;
			String parts[] = StringUtils.split(defaultLocaleName, "_");
			String language = parts[0];
			if (parts.length == 2) {
				String country = parts[1];
				result = new Locale(language, country);
			} else {
				result = new Locale(language, "");
			}
			ProjectConfig.detaultLocale = result;
		}
	}

	public static Locale getDetaultLocale() {
		return detaultLocale;
	}

	public static String getDefaultLocaleName() {
		return defaultLocaleName;
	}

	public static boolean isEnableRefreshPermission() {
		return enableRefreshPermission;
	}

	public void setEnableRefreshPermission(boolean enableRefreshPermission) {
		ProjectConfig.enableRefreshPermission = enableRefreshPermission;
	}
	
	public static String getDefaultSkin() {
		return defaultSkin;
	}

	public void setDefaultSkin(String defaultSkin) {
		ProjectConfig.defaultSkin=(defaultSkin==null?FrameworkConstants.DEFAULT_SKIN:defaultSkin);
	}
	public static int getPasswordExpired() {
		return passwordExpired;
	}

	public void setPasswordExpired(int passwordExpired) {
		ProjectConfig.passwordExpired = passwordExpired;
	}

	public static String getFormGroup() {
		return formGroup;
	}

	public void setFormGroup(String formGroup) {
		ProjectConfig.formGroup = formGroup;
	}
	public static String getPortalServerName() {
    	return portalServerName;
    }
	public void setPortalServerName(String portalServerName) {
		ProjectConfig.portalServerName = portalServerName;
    }
	
	public static String getValidateCode() {
    	return validateCode;
    }
	public void setValidateCode(String validateCode) {
		ProjectConfig.validateCode = validateCode;
    }
}
