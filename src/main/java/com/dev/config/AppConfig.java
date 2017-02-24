package com.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Oops on 2/20/2017.
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.dev.web.*"})
@Import({SecurityConfig.class})
public class AppConfig {


    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setViewClass(JstlView.class);
        view.setPrefix("/WEB-INF/pages/");
        view.setSuffix(".jsp");
        return view;
    }
}
