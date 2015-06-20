package com.erp.school.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.erp.school.dao.RegistrationDao;
import com.erp.school.model.Staff;

@Transactional
public class RegistrationDaoImpl extends GenericDaoImpl<Staff,Integer> implements RegistrationDao{
	
	/*protected Class<Staff> getEntityClass() {
		
		return Staff.class;
	}*/

	public List<Staff> fetchStaffDetails() {
		TypedQuery<Staff> userTypedQuery = em.createQuery("from Staff", Staff.class);
		return userTypedQuery.getResultList();
	}
}
