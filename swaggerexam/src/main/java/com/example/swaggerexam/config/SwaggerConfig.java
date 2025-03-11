package com.example.swaggerexam.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "모임 및 일정 관리 API",
        version = "1.0",
        description = "모임 및 일정을 관리하기 위한 API 문서"
        )
)

public class SwaggerConfig {
}
