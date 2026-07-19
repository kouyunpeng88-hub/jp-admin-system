package com.japan.admin.common.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;

@Configuration
public class CorsConfig {


    @Bean
    public CorsConfigurationSource corsConfigurationSource(){


        CorsConfiguration configuration =
                new CorsConfiguration();


        // 允许前端地址
        configuration.setAllowedOrigins(
                List.of(
                        "http://localhost:5173"
                )
        );


        // 允许请求方法
        configuration.setAllowedMethods(
                List.of(
                        "GET",
                        "POST",
                        "PUT",
                        "DELETE",
                        "OPTIONS"
                )
        );


        // 允许请求头
        configuration.setAllowedHeaders(
                List.of("*")
        );


        // 允许携带cookie/token
        configuration.setAllowCredentials(true);



        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();


        source.registerCorsConfiguration(
                "/**",
                configuration
        );
        return source;

    }

}