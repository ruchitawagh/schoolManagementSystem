package com.erp.school.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "academic_year")
public class AcademicYear {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "academic_year_id", nullable = false)
	private Integer academicyearId;
	
    @Column(name="academic_year", nullable=false)
    private String academicYear;
    
    @Column(name="start_date", nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date startDate;
    
    @Column(name="end_date", nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name="is_current_year", nullable=true)
    private Integer iscurrentYear;

	public Integer getAcademicyearId() {
		return academicyearId;
	}

	public void setAcademicyearId(Integer academicyearId) {
		this.academicyearId = academicyearId;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getIscurrentYear() {
		return iscurrentYear;
	}

	public void setIscurrentYear(Integer iscurrentYear) {
		this.iscurrentYear = iscurrentYear;
	}
    
    
    

}
