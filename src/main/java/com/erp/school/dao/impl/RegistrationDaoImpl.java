package com.erp.school.dao.impl;

import com.erp.school.dao.RegistrationDao;
import com.erp.school.model.Staff;

public class RegistrationDaoImpl extends GenericDaoImpl<Staff,Integer> implements RegistrationDao{
	
	protected Class<Staff> getEntityClass() {
		
		return Staff.class;
	}
}
