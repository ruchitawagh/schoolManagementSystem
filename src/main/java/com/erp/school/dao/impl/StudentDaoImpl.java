package com.erp.school.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.erp.school.dao.StudentDao;
import com.erp.school.model.Login;
import com.erp.school.model.Section;
import com.erp.school.model.Student;

public class StudentDaoImpl extends GenericDaoImpl<Student,Integer> implements StudentDao{
	
	private SessionFactory sessionFactory;
    protected Class<Student> getEntityClass() {
		
		return Student.class;
	}
	@SuppressWarnings("unchecked")
	public List<Student> fetchStudentListByStatus(final String studentClass,final String division){
		StringBuilder queryStr = new StringBuilder();
		queryStr.append("from Student where status IS Not 'deleted'");
		if(studentClass!=null){
			queryStr.append(" and classId IN(select classId from Class where className like '%" + studentClass + "%')");
		}
		if(division!=null){
			queryStr.append(" and divisionId IN(select divisionId from Division where divisionName like '%" + division + "%')");
		}
		TypedQuery<Student> userTypedQuery = em.createQuery(queryStr.toString(), Student.class);
		return userTypedQuery.getResultList();
	}
	
	
	public Integer getStaffMaxRegistrationNo(){
		TypedQuery<Integer> userTypedQuery = em.createQuery("select Max(id) from Staff",Integer.class);
		return userTypedQuery.getSingleResult();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Integer getStudentMaxRegistrationNo() {
		TypedQuery<Integer> userTypedQuery = em.createQuery("select Max(id) from Student",Integer.class);
		return userTypedQuery.getSingleResult();
	}
}
