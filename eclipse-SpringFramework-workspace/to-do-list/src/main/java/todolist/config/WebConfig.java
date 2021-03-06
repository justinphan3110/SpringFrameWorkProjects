package todolist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "todolist")
public class WebConfig  {
	
	//== constants
	public static final String PREFIX = "/WEB-INF/view/";
	public static final String SUFFIX = ".jsp";
	
	// == View Resolver Set Up ==
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(PREFIX);
		viewResolver.setSuffix(SUFFIX);
		return viewResolver;
	}
	
	
	
}
