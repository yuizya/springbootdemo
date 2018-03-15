package com.susanna.smoneybag.configuration;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.susanna.smoneybag.converter.StringToLong;
@Configuration
@EnableWebMvc
public class SpringMvcConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	//配置 ViewResolver
/*	@Bean("beetlConfig")
	public BeetlGroupUtilConfiguration BeetlConfig() {
		BeetlGroupUtilConfiguration conf = new BeetlGroupUtilConfiguration();
		conf.setConfigFileResource(new DefaultResourceLoader().getResource("beetl.properties"));
		return conf;
	}*/
	/*@Bean
	public BeetlSpringViewResolver beetleViewResolver() {
		BeetlSpringViewResolver viewResolver=new BeetlSpringViewResolver();
		viewResolver.setConfig(BeetlConfig());
		viewResolver.setContentType("text/html;charset=UTF-8");
		viewResolver.setPrefix("/templates");
		viewResolver.setSuffix(".html");
		viewResolver.setOrder(1);
		return viewResolver;
	}*/
	
/*	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/templates");
		resolver.setSuffix(".jsp");
		resolver.setOrder(0);
		return resolver;
	}*/
	@Bean("conversionService")
	public ConversionServiceFactoryBean conversionService() {
		Set<Object> set = new HashSet<>();
		set.add(new StringToLong());
		ConversionServiceFactoryBean bean =new ConversionServiceFactoryBean();
		bean.setConverters(set);
		return bean;
	}
	
	//配置静态资源路径
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
		super.addResourceHandlers(registry);
	}
	
}
