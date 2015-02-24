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
@Table(name="teacher_details")
public class TeacherDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name="first_name", nullable=false)
    private String firstName;
    
    @Column(name="middle_name", nullable=true)
    private String middleName;
    
    @Column(name="last_name", nullable=true)
    private String lastName;
    
    @Column(name="age", nullable=true)
    private Integer age;
    
    @Column(name="date_of_birth",nullable=true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    
    @Column(name="email_id",nullable=true)
    private String emailId;
    
    @Column(name="qualification",nullable=true)
    private String qualification;
    
    @Column(name="previous_school",nullable=true)
    private String previousSchool;
    
    @Column(name="marital_status",nullable=true)
    private String maritalStatus;
    
    @Column(name="religion",nullable=true)
    private String religion;
    
    @Column(name="date_of_joining",nullable=true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfJoining;
    
    @Column(name="primary_address",nullable=true)
    private String primaryAddress;
    
    @Column(name="secondary_address",nullable=true)
    private String secondaryAddress;
    
    @Column(name="primary_city",nullable=true)
    private String primaryCity;
    
    @Column(name="secondary_city",nullable=true)
    private String secondaryCity;
    
    @Column(name="primary_state",nullable=true)
    private String primaryState;
    
    @Column(name="secondary_state",nullable=true)
    private String secondaryState;
    
    @Column(name="type_of_job",nullable=true)
    private String typeOfJob;
    
    @Column(name="pan_no",nullable=true)
    private Double panNo;
    
    @Column(name="aadhar_no",nullable=true)
    private Double aadharNo;
    
    @Column(name="driving_license_no",nullable=true)
    private Double drivingLicenseNo;
    
    @Column(name="bank_acc_no",nullable=true)
    private Double bankAccountNo;
    
    @Column(name="bank_acc_name",nullable=true)
    private String bankAccountName;
    
    @Column(name="role",nullable=true)
    private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPreviousSchool() {
		return previousSchool;
	}

	public void setPreviousSchool(String previousSchool) {
		this.previousSchool = previousSchool;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getSecondaryAddress() {
		return secondaryAddress;
	}

	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	public String getPrimaryCity() {
		return primaryCity;
	}

	public void setPrimaryCity(String primaryCity) {
		this.primaryCity = primaryCity;
	}

	public String getSecondaryCity() {
		return secondaryCity;
	}

	public void setSecondaryCity(String secondaryCity) {
		this.secondaryCity = secondaryCity;
	}

	public String getPrimaryState() {
		return primaryState;
	}

	public void setPrimaryState(String primaryState) {
		this.primaryState = primaryState;
	}

	public String getSecondaryState() {
		return secondaryState;
	}

	public void setSecondaryState(String secondaryState) {
		this.secondaryState = secondaryState;
	}

	public String getTypeOfJob() {
		return typeOfJob;
	}

	public void setTypeOfJob(String typeOfJob) {
		this.typeOfJob = typeOfJob;
	}

	public Double getPanNo() {
		return panNo;
	}

	public void setPanNo(Double panNo) {
		this.panNo = panNo;
	}

	public Double getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Double aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Double getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(Double drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public Double getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(Double bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
    
    
    
}
