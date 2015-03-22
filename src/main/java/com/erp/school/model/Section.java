package com.erp.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="section")
public class Section {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "section_id", nullable=false)
	private Integer sectionId;
	
	@Column(name = "section_name" ,nullable=false)
	private String sectionName;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	

}
