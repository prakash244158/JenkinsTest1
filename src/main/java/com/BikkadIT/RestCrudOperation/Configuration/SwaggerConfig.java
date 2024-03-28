package com.BikkadIT.RestCrudOperation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//This Configuration for Swagger
	//http://localhost:9090/swagger-ui.html -- this is url for swagger
	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.BikkadIT.RestCrudOperation.Controller")).paths(PathSelectors.any()).build();

	}
	
}
