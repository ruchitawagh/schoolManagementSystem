package com.erp.school.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.dao.LoginDao;
import com.erp.school.dao.RegistrationDao;
import com.erp.school.dao.StudentDao;
import com.erp.school.model.AcademicYear;
import com.erp.school.model.Login;
import com.erp.school.model.Student;
import com.erp.school.model.Staff;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;


@Service
@Transactional
public class RegistrationService {
  
	@Autowired
	RegistrationDao registrationDao;
	
	@Autowired
	LoginDao loginDao;
	
	@Autowired
	StudentDao studentDao;
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public ModelMap registerStaff(HttpServletRequest request,String jsonString){
		Staff teacherDetails=null;
		ObjectMapper mapper=new ObjectMapper();
		String UserName=null;
		String Password=null;
		String role=null;
		String isTeacher=null;
		Integer regNo;
		ModelMap modelMap = new ModelMap();
		try
		{
			teacherDetails=mapper.readValue(jsonString, Staff.class);	
			registrationDao.persist(teacherDetails);
			UserName=teacherDetails.getFirstName()+"."+teacherDetails.getLastName()+""+teacherDetails.getId();
			Password="123456";
			regNo=teacherDetails.getId();
			role=teacherDetails.getStaffRole();
			isTeacher=teacherDetails.getIsTeacher();
			if(isTeacher.equals("Yes")){
				setLoginAttribute(UserName,Password,regNo,role);
			}
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("code",200);
			modelMap.addAttribute("message", "Staff registered successfully.");
			modelMap.addAttribute("username", UserName);
			modelMap.addAttribute("password", Password);
			
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "Failure");
			modelMap.addAttribute("code", 400);
			modelMap.addAttribute("message", "Error in saving staff information, please try after some time.");			
		}
		return modelMap;
		
	}
	
	public ModelMap registerStudent(HttpServletRequest request,String jsonString){
		Student student=null;
		ObjectMapper mapper=new ObjectMapper();
		String UserName=null;
		String Password=null;
		Integer regNo;
		String role=null;
		ModelMap modelMap = new ModelMap();
		try
		{
			student=mapper.readValue(jsonString, Student.class);	
			studentDao.persist(student);
			UserName=student.getFirstName()+"."+student.getLastName()+""+student.getId();
			Password="123456";
			role="student";
			regNo=student.getId();
			setLoginAttribute(UserName,Password,regNo,role);
			modelMap.addAttribute("Status", "Success");
			modelMap.addAttribute("Message", "Data Saved sucessfully");
			modelMap.addAttribute("UserName", UserName);
			modelMap.addAttribute("Password", Password);
			
		}catch(Exception e){
			modelMap.addAttribute("Status", "Failure");
		}
		return modelMap;
		
	}

	public Object fetchSatffList(HttpServletRequest request,HttpServletResponse response){
		/*ModelMap modelMap = new ModelMap();
		List<AcademicYear> AcademicYears =new ArrayList<AcademicYear>();
		try{
			AcademicYears = getAcademicyearDao().fetchAcademicYear();
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("academicYears", AcademicYears);
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "failure");
		}
		return modelMap;
		 * 
		 * 
		 */
		ModelMap modelMap = new ModelMap();
		List<Staff> StaffLists = new ArrayList<Staff>();
		try{
			StaffLists = getRegistrationDao().fetchStaffDetails();
			modelMap.addAttribute("status", "Success");
			modelMap.addAttribute("staffList", StaffLists);
		}catch(Exception e){
			e.printStackTrace();
			modelMap.addAttribute("status", "failure");
		}
		return StaffLists;
	}
	
	public void setLoginAttribute(String userName,String PassWord,Integer RegNo,String role){
			Login login=new Login();
			login.setUserName(userName);
			login.setPassword(PassWord);
			login.setRegistrationNumber(RegNo);
			login.setRole(role);
			loginDao.persist(login);
	}

	public RegistrationDao getRegistrationDao() {
		return registrationDao;
	}

	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}
	
	
}
