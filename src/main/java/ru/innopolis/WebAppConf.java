package ru.innopolis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by admin on 15.05.2017. 123
 */

@Configuration
@EnableWebMvc
@ComponentScan("ru.innopolis")
public class WebAppConf extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    public UrlBasedViewResolver setupViewResolver(){
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }
}
