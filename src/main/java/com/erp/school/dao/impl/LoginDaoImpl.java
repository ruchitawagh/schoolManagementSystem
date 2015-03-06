package com.erp.school.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.erp.school.dao.LoginDao;
import com.erp.school.model.Login;

public class LoginDaoImpl extends GenericDaoImpl<Login, Integer> implements LoginDao{
	public List<Login> getLoginByUserNameAndPasword(Login user) {
		TypedQuery<Login> userTypedQuery = em.createQuery("from Login where userName=?1 and password=?2", Login.class);
		userTypedQuery.setParameter(1, user.getUserName());
		userTypedQuery.setParameter(2, user.getPassword());
		return userTypedQuery.getResultList();
	}

}
