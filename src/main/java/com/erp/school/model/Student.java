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
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name="first_name", nullable=false)
    private String firstName;
    
    @Column(name="middle_name", nullable=true)
    private String middleName;
    
    @Column(name="last_name", nullable=true)
    private String lastName;
    
    @Column(name="mother_name", nullable=true)
    private String motherName;
    
    @Column(name="section_id", nullable=true)
    private Integer sectionId;
    
    @Column(name="academic_year", nullable=true)
    private Integer academicYear;
    
    @Column(name="phone_number", nullable=true)
    private String phoneNumber;
    
    @Column(name="age", nullable=true)
    private Integer age;
    
    @Column(name="date_of_birth",nullable=true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    
    @Column(name="parents_email_address",nullable=true)
    private String parentEmailId;
    
    @Column(name="religion",nullable=true)
    private String religion;
    
    @Column(name="caste",nullable=true)
    private String caste;
    
    @Column(name="address",nullable=true)
    private String Address;
    
    @Column(name="city",nullable=true)
    private String City;
  
    @Column(name="state",nullable=true)
    private String State;
    
    @Column(name="gender",nullable=true)
    private String gender;
    
    @Column(name="type_of_job",nullable=true)
    private String typeOfJob;
    
    @Column(name="nationality",nullable=true)
    private String nationality;
    
    @Column(name="role",nullable=false)
    private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	public String getTypeOfJob() {
		return typeOfJob;
	}

	public void setTypeOfJob(String typeOfJob) {
		this.typeOfJob = typeOfJob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
    
    
    
}
