package com.library.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@SpringBootApplication
public class BooksApplication  implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry corsRegistry) {
		corsRegistry.addMapping("/**")
				.allowedOrigins("http://localhost:4200")
				.allowedMethods("*")
				.maxAge(3600L)
				.allowedHeaders("*")
				.exposedHeaders("Authorization")
				.allowCredentials(true);
	}
}
