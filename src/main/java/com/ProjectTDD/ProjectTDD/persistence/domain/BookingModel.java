package com.ProjectTDD.ProjectTDD.persistence.domain;

import java.time.LocalDate;

public class BookingModel {
    private Long id;
    private String reservName;
    private LocalDate checkIn;
    private LocalDate checkout;
    private Integer numberGuest;

    public BookingModel(Long id, String reservName, LocalDate checkIn, LocalDate checkout, Integer numberGuest) {
        this.id = id;
        this.reservName = reservName;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.numberGuest = numberGuest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReservName() {
        return reservName;
    }

    public void setReservName(String reservName) {
        this.reservName = reservName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(Integer numberGuest) {
        this.numberGuest = numberGuest;
    }
}
