package com.helena128.poc.reactive.swagger.configuration;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.TestEndpointApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClientConfiguration {

    @Value("${external.api}")
    private String externalApiUrl;

    @Bean
    public TestEndpointApi getTestApi() {
        return new TestEndpointApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        return new ApiClient().setBasePath(externalApiUrl);
    }
}
