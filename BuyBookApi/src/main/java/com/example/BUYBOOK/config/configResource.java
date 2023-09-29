package com.example.BUYBOOK.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
@EnableWebMvc
public class configResource implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry register) {
		register.addResourceHandler("/resources/static/**");
	}
}
