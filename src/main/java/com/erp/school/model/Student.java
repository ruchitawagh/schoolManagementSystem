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
@Table(name="student_details")
public class Student {
  
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", nullable = false)
    private Integer id;
    
    @Column(name="first_name", nullable=false)
    private String firstName;
    
    @Column(name="middle_name", nullable=true)
    private String middleName;
    
    @Column(name="last_name", nullable=true)
    private String lastName;
    
    @Column(name="mothers_name", nullable=true)
    private String motherName;
    
    @Column(name="parent_email_id",nullable=true)
    private String parentEmailId;
    
    @Column(name="section_id", nullable=true)
    private Integer sectionId;
    
    @Column(name="class_id", nullable=true)
    private Integer classId;
    
    @Column(name="division_id", nullable=true)
    private Integer divisionId;
    
    @Column(name="academic_year", nullable=true)
    private Integer academicYear;
    
    @Column(name="parent_mobile_no", nullable=true)
    private String parentMobileNo;
  
    @Column(name="dob",nullable=true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    
    @Column(name= "category" ,nullable=false)
    private String Category;
   
    @Column(name="religion",nullable=true)
    private String religion;
    
    @Column(name="caste",nullable=true)
    private String caste;
    
    @Column(name="permanent_address",nullable=true)
    private String permanentAddress;
    
    @Column(name="correspondence_address",nullable=true)
    private String correspondenceAddress;
    
    @Column(name="country",nullable=false)
    private String Country; 
    
    @Column(name="city",nullable=true)
    private String City;
  
    @Column(name="state",nullable=true)
    private String State;
    
    @Column(name="pincode",nullable=true)
    private String pincode;
    
    @Column(name="gender",nullable=true)
    private String gender;
    
    @Column(name="blood_group",nullable=false)
    private String bloodGroup;
    
    @Column(name="birth_place",nullable=false)
    private String birthPlace;
    
    @Column(name="nationality",nullable=true)
    private String nationality;
    
    @Column(name="status",nullable=false)
    private String status;
    
	@Column(name = "photo", nullable = true)
    private String photo;

    
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

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

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Integer academicYear) {
		this.academicYear = academicYear;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getParentEmailId() {
		return parentEmailId;
	}

	public void setParentEmailId(String parentEmailId) {
		this.parentEmailId = parentEmailId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}

	public String getParentMobileNo() {
		return parentMobileNo;
	}

	public void setParentMobileNo(String parentMobileNo) {
		this.parentMobileNo = parentMobileNo;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
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

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
    
    
    
}
