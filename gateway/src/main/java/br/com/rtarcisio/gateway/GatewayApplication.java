package br.com.rtarcisio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routes (RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(r -> r.path("/v1/admin/course/**").uri("lb://course/"))
               // .route(r -> r.path("/cartoes/**").uri("lb://mscartoes"))
                //.route(r -> r.path("/avaliacoes-credito/**").uri("lb://msavaliadorcredito"))
                .build();
    }


}
