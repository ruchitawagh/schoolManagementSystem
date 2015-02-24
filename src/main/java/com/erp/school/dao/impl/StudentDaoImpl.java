package com.erp.school.dao.impl;

import com.erp.school.dao.StudentDao;
import com.erp.school.model.Student;

public class StudentDaoImpl extends GenericDaoImpl<Student, Integer> implements StudentDao{
    
protected Class<Student> getEntityClass() {
		
		return Student.class;
	}
}
