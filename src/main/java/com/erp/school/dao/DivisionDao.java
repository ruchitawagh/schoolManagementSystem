package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.Division;

public interface DivisionDao extends GenericDao<Division, Integer> {
	public List<Division> fetchDivisions();
}

