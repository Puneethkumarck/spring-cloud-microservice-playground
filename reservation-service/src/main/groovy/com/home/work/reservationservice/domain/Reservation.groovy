package com.home.work.reservationservice.domain

import com.fasterxml.jackson.annotation.JsonInclude
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
@JsonInclude
class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id

    @Column(name="reservation_name")
    public String reservationName

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    public Date createdAt

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    public Date updatedAt



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
