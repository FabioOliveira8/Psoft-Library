package com.project.psoft.lendingmanagement.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class LendingNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer sequenceNumber;
    private String currentYear;

    public LendingNumber (int sequenceNumber) {
        this.sequenceNumber = sequenceNumber + 1;
        currentYear = String.valueOf(LocalDate.now().getYear());
    }
    public LendingNumber () {
        this.sequenceNumber = 1;
        currentYear = String.valueOf(LocalDate.now().getYear());
    }

    public String getLendingNumber () {
        return currentYear + "/" + sequenceNumber;
    }
}