package com.erp.school.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.dao.SectionDao;
import com.erp.school.model.Section;
import com.erp.school.model.Student;

@Service
@Transactional
public class SectionService {
	
	@Autowired
	SectionDao sectionDao;
	
	
	public ModelMap fetchSections(HttpServletRequest request,HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		List<Section> Sections =new ArrayList<Section>();
		try{
			Sections = getSectionDao().fetchSections();
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("sections", Sections);
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "failure");
		}
		return modelMap;
	}

	public SectionDao getSectionDao() {
		return sectionDao;
	}

	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}
	

}
