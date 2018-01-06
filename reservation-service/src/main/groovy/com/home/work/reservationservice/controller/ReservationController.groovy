package com.home.work.reservationservice.controller
import com.home.work.reservationservice.dao.ReservationRepository
import com.home.work.reservationservice.domain.Reservation
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class ReservationController {

    private final ReservationRepository reservationRepository

    ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository
    }

    @RequestMapping(value ="/reservations",method = RequestMethod.GET,produces = "application/json")
    List<Reservation> reservations() {
        List<Reservation> reservations= this.reservationRepository.findAll()
        log.info("from for each " + reservations.each {log.info("id is ${it.id} and reservationName is ${it.reservationName}")})
        reservations
    }


    @RequestMapping(value ="/reservations/{id}",method = RequestMethod.GET,produces = "application/json")
    Reservation reservationsById(@PathVariable long id) {
        Reservation reservation= this.reservationRepository.findById(id)
        log.info("Reservation is id= ${reservation.id} and name is ${reservation.reservationName}")
        reservation
    }
}
