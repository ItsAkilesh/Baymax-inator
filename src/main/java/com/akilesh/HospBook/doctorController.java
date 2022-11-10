package com.akilesh.HospBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class doctorController {

	@Autowired
	private appointmentService service;
	
	@RequestMapping("/doctorAppointments")
	public String showDoctorAppointments(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String doctorName = authentication.getName();
		List<appointment> doctorAppointments = service.findByDoctorName(doctorName);
		model.addAttribute("doctorAppointments",doctorAppointments);
		return "doctorAppointments.html";
	}
	
	@RequestMapping("/createPrescription")
	public String createPrescription() {
		return "createPrescription";
	}
}
