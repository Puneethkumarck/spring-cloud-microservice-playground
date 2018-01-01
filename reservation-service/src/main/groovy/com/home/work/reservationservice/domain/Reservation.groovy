package com.home.work.reservationservice.domain

import org.apache.commons.lang.builder.ToStringBuilder
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Temporal
import javax.persistence.TemporalType


@Entity
class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id

    @Column(name="reservation_name")
    private String reservationName

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt



    Reservation(Long id, String reservationName,Date createdAt,Date updatedAt) {
        this.id = id
        this.reservationName = reservationName
        this.createdAt=createdAt
        this.updatedAt=updatedAt
    }

    Reservation() {
    }


    @Override
    String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("reservationName", reservationName)
                .toString()
    }
}
