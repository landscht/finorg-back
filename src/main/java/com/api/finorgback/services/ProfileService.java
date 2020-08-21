package com.api.finorgback.services;

import com.api.finorgback.models.Profile;
import com.api.finorgback.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile createProfile(Profile profile) {
        return this.profileRepository.save(profile);
    }

    public Profile getById(Long id) {
        return this.profileRepository.findByProfileId(id);
    }

}
