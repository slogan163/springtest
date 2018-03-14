package com.company.springtest.shared.entity;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "patient")
public class Patient extends Person {

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "patient")
    private Prescription prescription;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
