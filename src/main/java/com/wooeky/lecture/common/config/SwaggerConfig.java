package com.wooeky.lecture.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot JPA Lecture API")
                        .description("Spring Boot JPA 강의 프로젝트 API 문서")
                        .version("1.0.0"));
    }
}
