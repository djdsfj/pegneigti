package com.igti.pa.PeqNegIGTI.config;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SwaggerConfig.class, args);
	}
@Bean
public springfox.documentation.spring.web.plugins.Docket docket() {
			Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
			return docket.apiInfo(apiInfo());
		}

    

    private ApiInfo apiInfo() {

        @SuppressWarnings("rawtypes")
		ApiInfo apiInfo = new ApiInfo(
                "Produtos API REST projeto PeqNeg para IGTI - MBA em Arquitetura de Software",
                "API REST de cadastro de produtos para pequenos negócios.",
                "1.0",
                "Terms of Service",
                new Contact("David Ferreira Jr", "https://www.linkedin.com/in/david-junior-6750b6a9/",
                        "djdsfj@yahoo.com.br"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

   

	
        
    
    
}
