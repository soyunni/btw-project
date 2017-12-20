package com.btw.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 기본 JSP 전용 webconfig 설정
 * @author psy_world
 *
 */
//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	
    @Autowired
    private Environment env;

    @Value("${spring.profiles.active:local}")
    private String profile;
	    
/*	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/

}
