package com.helena128.poc.reactive.swagger.controller;

import org.openapitools.client.api.TestEndpointApi;
import org.openapitools.client.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @Autowired
    private TestEndpointApi testEndpointApi;

    @GetMapping("/test")
    public Mono<TestModel> getTestResponse() {
        return testEndpointApi.getTestResponse().elementAt(0);
    }
}
