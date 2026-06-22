package com.example.facultycareersystem.repository;

import com.example.facultycareersystem.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty findByUsernameAndPassword(String username, String password);
}