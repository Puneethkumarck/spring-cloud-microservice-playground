package com.home.work.reservationservice
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.home.work.*")
class ReservationServiceApp {

    static void main(String[] args) {
        SpringApplication.run ReservationServiceApp, args
    }
}
