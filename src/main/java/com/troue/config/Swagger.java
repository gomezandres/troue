package com.troue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {

	private static final String DOC_EXPANSION = "list";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.troue")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Documentation").description("API Rest")
				.termsOfServiceUrl("http://en.wikipedia.org/wiki/Terms_of_service").contact("andres.e.gomez@gmail.com")
				.license("Apache License Version 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("2.0").build();
	}

	@Bean
	public UiConfiguration uiConfig() {
		return new UiConfiguration(null, DOC_EXPANSION, "alpha", "schema",
				UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true);
	}

}