package com.api.finorgback.services;

import com.api.finorgback.dto.OperationDto;
import com.api.finorgback.models.ETypeOperation;
import com.api.finorgback.models.Operation;
import com.api.finorgback.models.Profile;
import com.api.finorgback.repositories.OperationRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class OperationService {

    private final OperationRepository operationRepository;

    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public List<Operation> getAllOperations() {
        return this.operationRepository.findAll();
    }

    public Operation createOperation(Operation operation) {
        return this.operationRepository.save(operation);
    }

    public List<Operation> getAllByProfileAndType(Profile profile, ETypeOperation typeOperation) {
        return this.operationRepository.findByProfileAndTypeOperation(profile, typeOperation);
    }

    public List<Operation> getAllByPeriod(LocalDate startDate, LocalDate endDate, Profile profile) {
        return this.operationRepository.findAllByDateBetweenAndProfileOrderByDateDesc(startDate, endDate, profile);
    }

}
