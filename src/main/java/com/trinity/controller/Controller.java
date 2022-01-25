package com.trinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinity.model.Register;
import com.trinity.repo.RegistrationRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	private RegistrationRepo registrationRepo;

	@PostMapping("api/register")
	public String save(@RequestBody Register register) {
		 Register save = registrationRepo.save(register);
		return "User got registered with the id " + save.getUid();

	}
}
