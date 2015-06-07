package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.AcademicYear;

public interface AcademicYearDao extends GenericDao<AcademicYear, Integer>{
	public List<AcademicYear> fetchAcademicYear();
}
