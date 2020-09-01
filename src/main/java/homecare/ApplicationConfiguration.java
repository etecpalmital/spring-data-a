package homecare;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
	@Configuration
	public class ApplicationConfiguration implements WebMvcConfigurer {
			@Bean
			public ViewResolver jspViewResolver() {
				InternalResourceViewResolver bean = new InternalResourceViewResolver();
				bean.setSuffix(".jsp");
				return bean;
			}
	}