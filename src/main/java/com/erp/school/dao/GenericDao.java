package com.erp.school.dao;

import java.io.Serializable;


public interface GenericDao <T, ID extends Serializable> {
	
	/*
     * Save the object
     * @param object entity
     */
	public void persist(T entity);
	
	/*
     * Update the object
     * @param object entity
     */
	@SuppressWarnings("hiding")
	public <T>T merge(T entity);
	
	/*
	 * Get object by id
	 */
	@SuppressWarnings("hiding")
	public <T>T find(T entity,Object primaryKey);
	
	
	
}
