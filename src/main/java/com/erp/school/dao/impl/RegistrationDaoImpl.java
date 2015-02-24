package com.erp.school.dao.impl;

import com.erp.school.dao.RegistrationDao;
import com.erp.school.model.TeacherDetails;

public class RegistrationDaoImpl extends GenericDaoImpl<TeacherDetails,Integer> implements RegistrationDao{
	
	protected Class<TeacherDetails> getEntityClass() {
		
		return TeacherDetails.class;
	}
}
