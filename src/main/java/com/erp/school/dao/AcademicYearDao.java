package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.AcademicYear;
import com.erp.school.model.Section;

public interface AcademicYearDao extends GenericDao<AcademicYear, Integer>{
	public List<AcademicYear> fetchAcademicYear();
}
