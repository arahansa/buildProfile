package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.example.service.TestClass;

@Configuration
@Import({SpringMVCContext.class})
//@PropertySource({"classpath:socialinfo.properties", "classpath:application.properties"})
@ImportResource("classpath:/socialplaceholder.xml")
public class ApplicationContext {

	/*@Bean
	public PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public TestClass testClass(){
		return new TestClass();
	}*/
}
