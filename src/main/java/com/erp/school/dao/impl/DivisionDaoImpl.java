package com.erp.school.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.erp.school.dao.DivisionDao;
import com.erp.school.model.Division;

@Transactional
public class DivisionDaoImpl extends GenericDaoImpl<Division, Integer> implements DivisionDao{

	public List<Division> fetchDivisions() {
		TypedQuery<Division> userTypedQuery = em.createQuery("from division", Division.class);
		return userTypedQuery.getResultList();
	}

}
