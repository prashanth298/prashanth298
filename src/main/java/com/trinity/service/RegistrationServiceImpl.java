package com.trinity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.model.Register;
import com.trinity.repo.RegistrationRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepo registrationRepo;

	@Override
	public int save(Register reg) {
		Register register = registrationRepo.save(reg);
		return register.getUid();
	}

}
