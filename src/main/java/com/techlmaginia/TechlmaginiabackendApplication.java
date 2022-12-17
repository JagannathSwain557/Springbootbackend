package com.techlmaginia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.google.cloud.spring.data.datastore.repository.config.EnableDatastoreRepositories;

@SpringBootApplication
//@ShellComponent
@RestController
@EnableDatastoreRepositories
//@CrossOrigin("*")
public class TechlmaginiabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechlmaginiabackendApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
	

}
