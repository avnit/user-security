package com.asbsolutionsusers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
    private static final String VERSION = "v1";
    private static final String TITLE = "Spring microservices for ASB Solutions  API";
    private static final String TERMS = "NO terms of service";
    private static final String LICENSE = "MIT";
    private static final String LICENSE_URL = "https://github.com/avnit/user-security";
    private static final String NAME = "Avnit Bambah";
    private static final String URL = "https://www.asbsolutionsgroup.com";
    private static final String EMAIL = "abambah@gmail.com";
    private static final String OPEN = "open";
    private static final String APP = "app";
    private static final String MANAGEMENT = "management";
    private static final String DESCRIPTION_APP = "User Security Applications API";
    private static final String DESCRIPTION_OPEN = "Open API";
    private static final String DESCRIPTION_MANAGEMENT = "Management API";

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.asbsolutionsusers"))
                .paths(PathSelectors.regex("/"))
                .build()
                .apiInfo(appApiInfo());
    }
    private ApiInfo appApiInfo() {
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION_APP)
                .termsOfServiceUrl(TERMS)
                .contact(new Contact(NAME, URL, EMAIL))
                .license(LICENSE)
                .licenseUrl(LICENSE_URL)
                .version(VERSION)
                .build();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
