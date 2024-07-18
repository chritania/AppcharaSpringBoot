package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.UserDetails;
import com.Appchara.Appchara.NotFoundException.UserDetailsNotFoundException;
import com.Appchara.Appchara.Repository.UserDetailsRepository;


@RestController
@RequestMapping("/api/v1/profile")
public class UserDetailsController {
    
    private final UserDetailsRepository repo;

    public UserDetailsController(UserDetailsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<UserDetails> getAllProfiles() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public UserDetails getProfileById(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new UserDetailsNotFoundException(id));
    }

    @GetMapping("/phone/{phoneNumber}")
    public UserDetails getProfileByPhoneNumber(@PathVariable String phoneNumber) {
        return repo.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new UserDetailsNotFoundException("Profile with phone number " + phoneNumber + " not found"));
    }

    @PostMapping("/add")
    public UserDetails createProfile(@RequestBody UserDetails newProfile) {
        return repo.save(newProfile);
    }

    @PutMapping("/edit/{id}")
    public UserDetails updateProfile(@PathVariable Long id, @RequestBody UserDetails updatedProfile) {
        return repo.findById(id)
                .map(profile -> {
                    profile.setPhoneNumber(updatedProfile.getPhoneNumber());
                    profile.setAddress(updatedProfile.getAddress());
                    return repo.save(profile);
                })
                .orElseThrow(() -> new UserDetailsNotFoundException(id));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfile(@PathVariable Long id) {
        repo.deleteById(id);
        return "Profile with ID " + id + " has been deleted";
    }
}
