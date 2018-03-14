package com.company.springtest.shared.entity;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "doctor")
public class Doctor extends Person {

    @Column(name = "specialization")
    private String specialization;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "doctor")
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
