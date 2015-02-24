package com.erp.school.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.ejb.EntityManagerImpl;

import com.erp.school.dao.GenericDao;

public abstract class GenericDaoImpl<E, ID extends Serializable> implements GenericDao<E,ID>{

	@PersistenceContext
	public EntityManager em;
	
	public void persist(E entity) {
		em.persist(entity);
	}

}
