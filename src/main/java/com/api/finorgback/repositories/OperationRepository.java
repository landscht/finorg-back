package com.api.finorgback.repositories;

import com.api.finorgback.models.ETypeOperation;
import com.api.finorgback.models.Operation;
import com.api.finorgback.models.Profile;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

    List<Operation> findAll();

    List<Operation> findAllByDateBetweenAndProfileOrderByDateDesc(LocalDate startDate, LocalDate endDate, Profile profile);

    List<Operation> findByProfileAndTypeOperation(Profile profile, ETypeOperation typeOperation);

}
