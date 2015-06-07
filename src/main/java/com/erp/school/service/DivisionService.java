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

import com.erp.school.dao.DivisionDao;
import com.erp.school.model.Division;

@Service
@Transactional
public class DivisionService {

	@Autowired
	DivisionDao divisionDao;

	public boolean addDivision(HttpServletRequest request,
			HttpServletResponse response, String requestString) {

		Division division = new Division();

		ObjectMapper objMapper = new ObjectMapper();
		try {
			division = objMapper.readValue(requestString, Division.class);
			divisionDao.persist(division);
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	
	public ModelMap fetchDivisions(HttpServletRequest request,HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		List<Division> Divisions =new ArrayList<Division>();
		try{
			Divisions = getDivisionDao().fetchDivisions();
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("academicYears", Divisions);
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "failure");
		}
		return modelMap;
	}

	public DivisionDao getDivisionDao() {
		return divisionDao;
	}

	public void setDivisionDao(DivisionDao divisionDao) {
		this.divisionDao = divisionDao;
	}

}
