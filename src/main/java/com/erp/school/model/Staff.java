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
@Table(name="staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "staff_id", nullable = false)
    private Integer id;
    
    @Column(name="acedemic_year_id",nullable=false)
    private Integer acedemicYearID;
    
    @Column(name="reg_date",nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date regDate;
    
    @Column(name="staff_role", nullable=false)
    private String staffRole;
    
    @Column(name="is_teacher", nullable=false)
    private String isTeacher;
    
    @Column(name="first_name", nullable=false)
    private String firstName;
    
    @Column(name="middle_name", nullable=true)
    private String middleName;
    
    @Column(name="last_name", nullable=true)
    private String lastName;
    
    @Column(name="date_of_joining",nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfJoining;
    
    @Column(name="date_of_birth",nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    
    @Column(name="gender",nullable=false)
    private String gender;
    
    @Column(name="marital_status",nullable=false)
    private String maritalStatus;
    
    @Column(name="religion",nullable=false)
    private String religion;
    
    @Column(name="caste",nullable=false)
    private String caste;
    
    @Column(name="photo",nullable=false)
    private String photo;
    
    @Column(name="qualification",nullable=false)
    private String qualification;
    
    @Column(name="previous_school",nullable=false)
    private String previousSchool;
    
    @Column(name="email_id",nullable=false)
    private String emailId;
    
    @Column(name="mobile_no",nullable=false)
    private String mobileNumber;
    
    @Column(name="country",nullable=false)
    private String country;

    @Column(name="state",nullable=false)
    private String state;
    
    @Column(name="city",nullable=false)
    private String city;
    
    @Column(name="permanent_address",nullable=true)
    private String permanentAddress;
    
    @Column(name="correspondence_address",nullable=true)
    private String correspondenceAddress;
    
    @Column(name="pincode",nullable=true)
    private String pincode;
    

   

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

	public Integer getAcedemicYearID() {
		return acedemicYearID;
	}

	public void setAcedemicYearID(Integer acedemicYearID) {
		this.acedemicYearID = acedemicYearID;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String getIsTeacher() {
		return isTeacher;
	}

	public void setIsTeacher(String isTeacher) {
		this.isTeacher = isTeacher;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
    
    
    
    
}
