package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.Student;

public interface StudentDao extends GenericDao<Student, Integer>{

	public List<Student> fetchStudentListByStatus(final String studentClass,final String division);
	
	public Integer getStaffMaxRegistrationNo();
	
	public Integer getStudentMaxRegistrationNo();
}
