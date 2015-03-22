package com.erp.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.school.service.SectionService;

@Controller
public class SectionController {
  @Autowired
  private SectionService sectionService;
  
  @RequestMapping(value= "/getSections.do", method=RequestMethod.GET)
  public @ResponseBody Object fetchSections(HttpServletRequest request,HttpServletResponse response){
	  return getSectionService().fetchSections(request,response);
	  
  }

public SectionService getSectionService() {
	return sectionService;
}

public void setSectionService(SectionService sectionService) {
	this.sectionService = sectionService;
}
}
