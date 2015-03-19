package com.erp.school.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
