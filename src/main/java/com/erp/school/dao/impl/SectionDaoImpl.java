package com.erp.school.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.erp.school.dao.GenericDao;
import com.erp.school.dao.SectionDao;
import com.erp.school.model.Login;
import com.erp.school.model.Section;

public class SectionDaoImpl extends GenericDaoImpl<Section, Integer> implements SectionDao{
	
	public List<Section> fetchSections(){
		TypedQuery<Section> userTypedQuery = em.createQuery("from Section", Section.class);
		return userTypedQuery.getResultList();
		
	}
}
