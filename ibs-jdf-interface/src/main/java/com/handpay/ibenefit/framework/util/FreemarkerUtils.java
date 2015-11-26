package com.handpay.ibenefit.framework.util;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * Freemarker 模板解析工具类
 * @author bob.pu
 *
 */
public final class FreemarkerUtils {
	private static final Logger LOGGER = Logger.getLogger(FreemarkerUtils.class);

	private FreemarkerUtils(){
	}
	
	public static String parseTemplate(String content, Map<String, Object> model) throws Exception {
		if (StringUtils.isNotBlank(content)) {
			if (model == null || model.size() == 0) {
				return content;
			}
			StringTemplateLoader stringLoader = new StringTemplateLoader();
			stringLoader.putTemplate("template", content);
			Configuration freemarkerConfiguration = new Configuration();
			freemarkerConfiguration.setTemplateLoader(stringLoader);
			freemarkerConfiguration.setDefaultEncoding("UTF-8");
			Template template = null;
			Writer writer = new StringWriter();
			String htmlText = null;
			try {
				template = freemarkerConfiguration.getTemplate("template");
				template.process(model, writer);
				htmlText = writer.toString();
				writer.close();
			} catch (Exception e) {
				LOGGER.error("parseTemplate", e);
				return "";
			}
			return htmlText;
		} else {
			return content;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "pubx");
		map.put("cnName", "游客");
		map.put("date","2015-07-06");
		map.put("cnDate","2015年07月06日");
		System.out.println(FreemarkerUtils.parseTemplate("Hello ${name!},<br> Today is ${date!},福利平台欢迎你", map));
		System.out.println(FreemarkerUtils.parseTemplate("欢迎你 ${cnName!},<br> Today is ${cnDate!},福利平台欢迎你", map));
	}
}
