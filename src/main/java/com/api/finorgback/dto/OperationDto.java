package com.api.finorgback.dto;

import com.api.finorgback.models.ETypeOperation;
import com.api.finorgback.models.Operation;

import java.time.LocalDate;

public class OperationDto {

    private Long id;
    private UserDto userDto;
    private Double amount;
    private LocalDate date;
    private String description;
    private ETypeOperation typeOperation;

    public OperationDto() {}

    public OperationDto(Long id, Double amount, LocalDate date, String description, ETypeOperation typeOperation, UserDto userDto) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.typeOperation = typeOperation;
        this.userDto = userDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
