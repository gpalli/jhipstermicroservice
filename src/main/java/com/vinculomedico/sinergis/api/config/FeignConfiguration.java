package com.vinculomedico.sinergis.api.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.vinculomedico.sinergis.api")
public class FeignConfiguration {

}
