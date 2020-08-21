package com.api.finorgback.controllers;

import com.api.finorgback.dto.OperationDto;
import com.api.finorgback.models.ETypeOperation;
import com.api.finorgback.models.Operation;
import com.api.finorgback.models.Profile;
import com.api.finorgback.services.OperationService;
import com.api.finorgback.services.ProfileService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/operation")
public class OperationController {

    private final OperationService operationService;
    private final ProfileService profileService;

    public OperationController(OperationService operationService, ProfileService profileService) {
        this.operationService = operationService;
        this.profileService = profileService;
    }

    @GetMapping
    public ResponseEntity<?> getAllOperations() {
        return ResponseEntity.ok(this.operationService.getAllOperations());
    }

    @PostMapping
    public ResponseEntity<?> createOperation(@Valid @RequestBody Operation operation) {
        return ResponseEntity.ok(this.operationService.createOperation(operation));
    }

    @GetMapping("/period/{startDate}/{endDate}/{profileId}")
    public ResponseEntity<?> getAllByPeriod(@PathVariable(value = "startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate, @PathVariable(value = "endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate, @PathVariable(value = "profileId") Long profileId) {
        Profile profile = this.profileService.getById(profileId);
        return ResponseEntity.ok(this.operationService.getAllByPeriod(startDate, endDate, profile));
    }

    @GetMapping("/{profileId}/{type}")
    public ResponseEntity<?> getAllByProjectAndType(@PathVariable(value = "profileId") Long profileId, @PathVariable(value = "type")ETypeOperation typeOperation) {
        Profile profile = this.profileService.getById(profileId);
        return ResponseEntity.ok(this.operationService.getAllByProfileAndType(profile, typeOperation));
    }

}
