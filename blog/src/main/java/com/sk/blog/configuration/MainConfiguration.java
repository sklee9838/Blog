package com.sk.blog.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sk.blog.interceptor.MainInterceptor;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter{
	@Autowired
	MainInterceptor mainInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mainInterceptor)
                .addPathPatterns("/");
    }
}
