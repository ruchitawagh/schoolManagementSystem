
package com.erp.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.school.service.DivisionService;
import com.erp.school.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;
	
	@Autowired
	DivisionService divisionService;

	public RegistrationService getRegistrationService() {
		return registrationService;
	}

	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	/**
	 * End Point for registration of teacher or staff.
	 * 
	 * @return
	 */

	@RequestMapping(value = "/registrationStaff.do", method = RequestMethod.POST)
	public @ResponseBody Object registerTeacher(HttpServletRequest request,
			HttpServletResponse response, @RequestBody String jsonString) {
		return registrationService.registerStaff(request, jsonString);

	}

	@RequestMapping(value = "/registrationStudent.do", method = RequestMethod.POST)
	public @ResponseBody Object registerStudent(HttpServletRequest request,
			HttpServletResponse response, @RequestBody String jsonString) {
		return registrationService.registerStudent(request, jsonString);

	}
	
	@RequestMapping(value="/addDivision.do" , method=RequestMethod.POST)
	public @ResponseBody Object addDivision(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestString){
		return divisionService.addDivision(request, response, requestString);
	}

}
