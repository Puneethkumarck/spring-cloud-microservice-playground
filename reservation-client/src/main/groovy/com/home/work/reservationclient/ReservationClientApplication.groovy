package com.home.work.reservationclient

import org.springframework.cloud.client.discovery.DiscoveryClient
import groovy.util.logging.Slf4j
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean


@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
class ReservationClientApplication {

    @Bean
    CommandLineRunner commandLineRunner() {
        log.info("Hello from reservation client App")
    }

    @Bean
    ApplicationRunner client(DiscoveryClient client) {
        client.getInstances("reservation-service").forEach({ServiceInstance si -> log.info("reservation service details are:${si.getHost()}  : ${si.getPort()}")})
    }

    static void main(String[] args) {
        SpringApplication.run ReservationClientApplication, args
    }
}