package com.example.demo.config;

import com.example.demo.client.PersonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {

    @Bean
    public PersonClient personClient() {

        // Eğer Service Discovery kullanıyorsanız (örneğin Eureka):
        /*
        WebClient webClient = WebClient.builder()
            .baseUrl("http://person-service")  // Service adı
            .build();
        */

        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8000")
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(webClient))
                .build();

        return factory.createClient(PersonClient.class);
    }

    // Birden fazla client için örnek kullanım
    /*@Bean
    public LessonClient lessonClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:9000")
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(webClient))
                .build();

        return factory.createClient(LessonClient.class);
    }*/
}
