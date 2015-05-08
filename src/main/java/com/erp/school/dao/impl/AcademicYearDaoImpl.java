package com.erp.school.dao.impl;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.erp.school.dao.AcademicYearDao;
import com.erp.school.model.AcademicYear;
import com.erp.school.model.Section;


@Transactional
public class AcademicYearDaoImpl extends GenericDaoImpl<AcademicYear, Integer> implements AcademicYearDao{

	public List<AcademicYear> fetchAcademicYear() {
		TypedQuery<AcademicYear> userTypedQuery = em.createQuery("from AcademicYear", AcademicYear.class);
		return userTypedQuery.getResultList();
	}
}
