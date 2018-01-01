package com.home.work.reservationservice.dao

import com.home.work.reservationservice.domain.Reservation
import org.springframework.data.jpa.repository.JpaRepository

import javax.transaction.Transactional

@Transactional
interface ReservationRepository extends JpaRepository<Reservation,Long>{

    Collection<Reservation> findByReservationName(String reservationName)
}
