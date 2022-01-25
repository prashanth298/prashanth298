package com.trinity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trinity.model.Register;

@Repository
public interface RegistrationRepo extends JpaRepository<Register, Integer> {

}
