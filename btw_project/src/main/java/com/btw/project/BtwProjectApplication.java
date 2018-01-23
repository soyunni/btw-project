package com.btw.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
	"classpath:/config/${spring.profiles.active:jsp}/application-${spring.profiles.active:jsp}.properties"})
public class BtwProjectApplication extends SpringBootServletInitializer {
	
	private static final String DEFAULT_PROFILE = "jsp";
	private static final String SPRING_PROFILES = "spring.profiles.active";

	public static void main(String[] args) {
		initDefaultProfile(DEFAULT_PROFILE);
		SpringApplication.run(BtwProjectApplication.class, args);
	}
	
	private static void initDefaultProfile(String defaultProfile) {
		String currentProfile = System.getProperty(SPRING_PROFILES);
		
		if(currentProfile == null || currentProfile.isEmpty()) {
			System.setProperty(SPRING_PROFILES, defaultProfile);
		}
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BtwProjectApplication.class);
    }
}
