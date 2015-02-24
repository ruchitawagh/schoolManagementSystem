package com.erp.school.dao;

import java.io.Serializable;


public interface GenericDao <T, ID extends Serializable> {
	
	/*
     * Save or update the object
     * @param object entity
     */
	public void persist(T entity);
}
