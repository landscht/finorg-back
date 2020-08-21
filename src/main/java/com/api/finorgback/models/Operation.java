package com.api.finorgback.models;

import com.api.finorgback.security.services.UserDetailsImpl;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operationId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    private Double amount;

    private LocalDate date;

    private String description;

    @Enumerated(EnumType.STRING)
    private ETypeOperation typeOperation;

    public Operation() {}

        public Operation(Long id, Profile profile, Double amount, LocalDate date, String description, ETypeOperation typeOperation) {
        this.operationId = id;
        this.profile = profile;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.typeOperation = typeOperation;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ETypeOperation getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(ETypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }
}
