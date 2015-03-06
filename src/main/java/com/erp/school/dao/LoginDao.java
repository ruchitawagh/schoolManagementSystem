package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.Login;

public interface LoginDao extends GenericDao<Login, Integer>{
	public List<Login> getLoginByUserNameAndPasword(Login user);
}
