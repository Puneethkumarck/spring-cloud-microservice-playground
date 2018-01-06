package com.home.work.reservationservice.dao

import com.home.work.reservationservice.domain.Reservation
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Slf4j
@Component
class DataInitilizer  implements CommandLineRunner{

    @Autowired
    private final ReservationRepository reservationRepository

    @Override
    void run(String... strings) throws Exception {

        ["puneeth","manoj","muni","rangee","pradeep","quancy","josh","kabali"].forEach({

            name -> reservationRepository.save(new Reservation(null,name,new Date(),new Date()))
        })

        log.info("Values inserted in the database is "+ reservationRepository.findAll().toString())
    }
}
