package com.erp.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.school.service.StudentService;

@Controller
public class StudentController {
	@Autowired 
	StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="/fetchStudent.do" ,method = RequestMethod.GET)
	public @ResponseBody Object fetchStudentList(HttpServletRequest request,HttpServletResponse response){
		return getStudentService().fetchStudentList(request, response);
		
	}
	
	@RequestMapping(value="/getStudentMaxRegistration.do" ,method = RequestMethod.GET)
	public Integer getStudentMaxRegistrationNo(HttpServletRequest request,HttpServletResponse response){
		return getStudentService().getStudentMaxRegistrationNo(request, response);
		
	}
	
	@RequestMapping(value="/getStaffMaxRegistration.do" ,method = RequestMethod.GET)
	public Integer getStaffMaxRegistrationNo(HttpServletRequest request,HttpServletResponse response){
		return getStudentService().getStaffMaxRegistrationNo(request, response);
		
	}
	
	

}
