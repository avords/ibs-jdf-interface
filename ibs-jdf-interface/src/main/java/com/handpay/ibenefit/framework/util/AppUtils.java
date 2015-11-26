package com.handpay.ibenefit.framework.util;

import org.apache.commons.lang3.StringUtils;

public final class AppUtils {

	/**
	 * 获取企业HR端个性化域名
	 * @param shortName
	 * @return
	 */
	public static String getHrDynamicDomain(String shortName){
		String dynamicDomain = StringUtils.isBlank(shortName)?"":shortName;
		dynamicDomain = "http://" + dynamicDomain + "hr.ibenefit.com.cn/hr";
		return dynamicDomain;
	}
	
	/**
	 * 获取企业员工端个性化域名
	 * @param shortName
	 * @return
	 */
	public static String getEmpDynamicDomain(String shortName){
		String dynamicDomain = StringUtils.isBlank(shortName)?"e":shortName;
		dynamicDomain = "http://" + dynamicDomain + ".ibenefit.com.cn/emp";
		return dynamicDomain;
	}
	
	/**
	 * 获取企业员工端个性化域名,不含上下文路径
	 * @param shortName
	 * @return
	 */
	public static String getEmpDynamicDomainWithoutContext(String shortName){
		String dynamicDomain = StringUtils.isBlank(shortName)?"e":shortName;
		dynamicDomain = "http://" + dynamicDomain + ".ibenefit.com.cn";
		return dynamicDomain;
	}
	
}
