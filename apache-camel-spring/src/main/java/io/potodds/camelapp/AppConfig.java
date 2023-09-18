package io.potodds.camelapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private CamelContext camelContext;


    @Bean
    ProducerTemplate producerTemplate() {
        return camelContext.createProducerTemplate();
    }

    @Bean
    ConsumerTemplate consumerTemplate() {
        return camelContext.createConsumerTemplate();
    }
}
