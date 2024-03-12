package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public vehicle Car(){
        return new Car();
    }
    @Bean
    public vehicle bike(){
        return new bike();
    }
    @Bean
    public vehicle cycle(){
        return new cycle();
    }
    @Bean
    public Traveler traveler(){
        return new Traveler(Car());//dependency injection
    }





}
