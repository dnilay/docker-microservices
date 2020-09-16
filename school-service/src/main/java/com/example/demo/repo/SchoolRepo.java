package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {

}
