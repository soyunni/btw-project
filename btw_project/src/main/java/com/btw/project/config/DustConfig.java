package com.btw.project.config;

import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;

@Configuration
public class DustConfig extends WebMvcConfigurerAdapter {

	private String dustPrefix = "/WEB-INF/dust/";
	
	private String dustSuffix = ".html";
	/**
     * html 노출 설정
     */
	@Bean
	public ViewResolver viewResolver() {
		ScriptTemplateViewResolver viewResolver = new ScriptTemplateViewResolver();
		viewResolver.setPrefix(dustPrefix);
		viewResolver.setSuffix(dustSuffix);
		return viewResolver;
	}
	
	@Bean
	public ScriptTemplateConfigurer configurer() {
	    ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
	    configurer.setEngine(scriptEngine());
	    configurer.setRenderFunction("render");
	    configurer.setSharedEngine(true);
	    return configurer;
	}
	
	
	
	@Bean
	public ScriptEngine scriptEngine() {
		ScriptEngine nashornScriptEngine = (ScriptEngine) new ScriptEngineManager().getEngineByName("nashorn");
	    try {
	    	nashornScriptEngine.eval(new InputStreamReader(new ClassPathResource("/static/dust-full.js").getInputStream()));
	    	nashornScriptEngine.eval(new InputStreamReader(new ClassPathResource("/static/dust-helpers.js").getInputStream()));
	    	nashornScriptEngine.eval(new InputStreamReader(new ClassPathResource("/static/render.js").getInputStream()));
	    	nashornScriptEngine.eval(new InputStreamReader(new ClassPathResource("/static/polyfill.js").getInputStream()));
	    	nashornScriptEngine.eval(new InputStreamReader(new ClassPathResource("/static/dust-bundle.js").getInputStream()));
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	    return nashornScriptEngine;
	}

}
