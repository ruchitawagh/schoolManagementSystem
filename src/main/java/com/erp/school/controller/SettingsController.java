package com.erp.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.school.service.AcademicYearService;

@Controller
public class SettingsController {
	@Autowired
	AcademicYearService academicyearService;
	
	public AcademicYearService getAcademicYearService() {
		return academicyearService;
	}
	
	public void setAcademicYearService(AcademicYearService academmicyearService) {
		this.academicyearService = academmicyearService;
	}
	
	@RequestMapping(value="/addAcademicYear.do" , method=RequestMethod.POST)
	public @ResponseBody Object addAcademicYear(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestString){
		System.out.println("JSON : \n" + requestString);
		return academicyearService.addAcademicYear(request, response, requestString);
	}
	
	@RequestMapping(value= "/getAcademicYears.do", method=RequestMethod.GET)
	  public @ResponseBody Object fetchAcademicYear(HttpServletRequest request,HttpServletResponse response){
		  return getAcademicYearService().fetchAcademicYear(request,response); 
	  }

	@RequestMapping(value= "/updateAcademicYears.do", method=RequestMethod.POST)
	  public @ResponseBody Object updateAcademicYear(HttpServletRequest request,HttpServletResponse response, @RequestBody String requestString){
		  return getAcademicYearService().updateAcademicYear(request,response,requestString); 
	  }

	@RequestMapping(value= "/deleteAcademicYears.do", method=RequestMethod.POST)
	  public @ResponseBody Object deleteAcademicYear(HttpServletRequest request,HttpServletResponse response){
		  return getAcademicYearService().deleteAcademicYear(request,response); 
	  }

}
