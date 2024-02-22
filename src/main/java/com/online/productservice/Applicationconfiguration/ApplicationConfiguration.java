package com.online.productservice.Applicationconfiguration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration
{
    @Bean
    public RestTemplate CreateRestTemplate()
    {
        return new RestTemplateBuilder().build();
    }
}
