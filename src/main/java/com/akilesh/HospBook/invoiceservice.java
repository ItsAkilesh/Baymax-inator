package com.akilesh.HospBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class invoiceservice {

	@Autowired
	private invoiceRepository rep;
	
	
	public void save(invoice entity) {
		rep.save(entity);
	}
	
	public List<invoice> view(){
		return rep.findAll();
	}
}
