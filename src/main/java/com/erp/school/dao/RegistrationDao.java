package com.erp.school.dao;

import com.erp.school.dao.GenericDao;
import com.erp.school.model.Staff;
import java.util.List;

public interface RegistrationDao extends GenericDao<Staff, Integer>{
	//public List<Staff> fetStaffDetails();

	public List<Staff> fetchStaffDetails();

}