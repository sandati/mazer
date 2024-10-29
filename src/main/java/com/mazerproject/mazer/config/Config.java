/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mazerproject.mazer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 *
 * @author yahaya
 */
@Configuration
@ComponentScan("com.mazerproject")
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter {
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    //@Bean(name = "multipartResolver")
    //public CommonsMultipartResolver multipartResolver() {
    //    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
    //    multipartResolver.setMaxUploadSize(Constants.MAX_FILE_SIZE * 2);
    //    multipartResolver.setMaxUploadSizePerFile(Constants.MAX_FILE_SIZE);
    //    return multipartResolver;
    //}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/");
        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/resources/images/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/resources/fonts/");
        registry.addResourceHandler("/assets/**").addResourceLocations("/WEB-INF/resources/assets/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Bean
    public RequestMappingHandlerMapping useTrailingSlash() {
        return new RequestMappingHandlerMapping() {
            {
                setUseTrailingSlashMatch(true);
            }
        };
    }
}
