package com.erp.school.dao;

import java.util.List;

import com.erp.school.model.Section;

public interface SectionDao extends GenericDao<Section, Integer>{
   public List<Section> fetchSections();
}
