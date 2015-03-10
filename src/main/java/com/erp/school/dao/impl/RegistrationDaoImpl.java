package com.erp.school.dao.impl;

import com.erp.school.dao.RegistrationDao;
import com.erp.school.model.Teacher;

public class RegistrationDaoImpl extends GenericDaoImpl<Teacher,Integer> implements RegistrationDao{
	
	protected Class<Teacher> getEntityClass() {
		
		return Teacher.class;
	}
}
