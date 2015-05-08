package com.erp.school.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.model.AcademicYear;
import com.erp.school.model.Section;
import com.erp.school.dao.AcademicYearDao;

@Service
@Transactional
public class AcademicYearService {
	
	@Autowired
	AcademicYearDao academicyearDao;
	
	public boolean addAcademicYear(HttpServletRequest request,HttpServletResponse response, String requestString) {

		AcademicYear academicyear = new AcademicYear();

		ObjectMapper objMapper = new ObjectMapper();
		try {
			academicyear = objMapper.readValue(requestString, AcademicYear.class);
			academicyearDao.persist(academicyear);
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	
	public ModelMap fetchAcademicYear(HttpServletRequest request,HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		List<AcademicYear> AcademicYears =new ArrayList<AcademicYear>();
		try{
			AcademicYears = getAcademicyearDao().fetchAcademicYear();
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("academicYears", AcademicYears);
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "failure");
		}
		return modelMap;
	}

	public AcademicYearDao getAcademicyearDao() {
		return academicyearDao;
	}

	public void setAcademicyearDao(AcademicYearDao academicyearDao) {
		this.academicyearDao = academicyearDao;
	}

}
