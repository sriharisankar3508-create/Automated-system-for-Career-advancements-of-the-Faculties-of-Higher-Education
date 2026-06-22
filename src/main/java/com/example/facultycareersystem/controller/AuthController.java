package com.example.facultycareersystem.controller;

import com.example.facultycareersystem.entity.Faculty;
import com.example.facultycareersystem.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private FacultyRepository facultyRepository;

    @PostMapping("/login")
    public Faculty login(@RequestBody Faculty loginRequest) {
        return facultyRepository.findByUsernameAndPassword(
                loginRequest.getUsername(), loginRequest.getPassword());
    }
}