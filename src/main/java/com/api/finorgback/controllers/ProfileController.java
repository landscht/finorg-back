package com.api.finorgback.controllers;

import com.api.finorgback.models.Profile;
import com.api.finorgback.services.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public ResponseEntity<?> createProfile(@Valid @RequestBody Profile profile) {
        return ResponseEntity.ok(this.profileService.createProfile(profile));
    }

}
