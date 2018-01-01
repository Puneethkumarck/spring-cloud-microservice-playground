package com.home.work.reservationservice.controller
import com.home.work.reservationservice.dao.ReservationRepository
import com.home.work.reservationservice.domain.Reservation
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/rsrvc")
@Slf4j
class ReservationController {

    private final ReservationRepository reservationRepository

    @RequestMapping(value ="/reservations",method = RequestMethod.GET)
    @ResponseBody Collection<Reservation> reservations() {
        log.info(reservationRepository.findAll().toString())
         this.reservationRepository.findAll()
    }
}
