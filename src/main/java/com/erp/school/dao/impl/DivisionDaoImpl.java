package com.erp.school.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erp.school.dao.DivisionDao;
import com.erp.school.model.Division;

@Transactional
public class DivisionDaoImpl extends GenericDaoImpl<Division, Integer> implements DivisionDao{

}
