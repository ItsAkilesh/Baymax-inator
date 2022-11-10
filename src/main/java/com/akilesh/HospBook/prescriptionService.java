package com.akilesh.HospBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class prescriptionService {
	
	@Autowired
	private prescriptionRepository repository;
	
	public void save(prescription Prescription) {
		repository.save(Prescription);
	}
	
	public List<prescription> findByPatientName(String patientName){
		
			return repository.findByPatientName(patientName);
	}
}
