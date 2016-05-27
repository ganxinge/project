package com.tmall.core.utils;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 
 * <p>title:freemarker工具类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 上午9:48:59
 */
public class FreeMarkersUtils {
	public static String renderString(String templateString, Map<String, ?> model) {
		try {
			StringWriter result = new StringWriter();
			Template t = new Template("name", new StringReader(templateString), new Configuration());
			t.process(model, result);
			return result.toString();
		} catch (Exception e) {
			//throw Exceptions.unchecked(e);
			throw new RuntimeException("read freemarker error");
		}
	}

	public static String renderTemplate(Template template, Object model) {
		try {
			StringWriter result = new StringWriter();
			template.process(model, result);
			return result.toString();
		} catch (Exception e) {
			//throw Exception.unchecked(e);
			throw new RuntimeException("read freemarker error");
		}
	}

	public static Configuration buildConfiguration(String directory) throws IOException {
		Configuration cfg = new Configuration();
		Resource path = new DefaultResourceLoader().getResource(directory);
		cfg.setDirectoryForTemplateLoading(path.getFile());
		return cfg;
	}
	
	public static void main(String[] args) throws IOException {
		// renderString
		Map<String, String> model = com.google.common.collect.Maps.newHashMap();
		model.put("userName", "calvin");
		String result = FreeMarkersUtils.renderString("hello ${userName}", model);
		System.out.println(result);
		// renderTemplate
		Configuration cfg = FreeMarkersUtils.buildConfiguration("classpath:/");
		Template template = cfg.getTemplate("testTemplate.ftl");
		String result2 = FreeMarkersUtils.renderTemplate(template, model);
		System.out.println(result2);
		
//		Map<String, String> model = com.google.common.collect.Maps.newHashMap();
//		model.put("userName", "calvin");
//		String result = FreeMarkers.renderString("hello ${userName} ${r'${userName}'}", model);
//		System.out.println(result);
	}
}
