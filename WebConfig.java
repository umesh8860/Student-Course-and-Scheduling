package com.klef.jfsd.springboot.controller;


	@Configuration
	public class WebConfig implements WebMvcConfigurer {

	    @Bean
	    public InternalResourceViewResolver viewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/jsp/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	}

}
