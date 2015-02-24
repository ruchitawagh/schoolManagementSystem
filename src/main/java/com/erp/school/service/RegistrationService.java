package com.erp.school.service;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.dao.LoginDao;
import com.erp.school.dao.RegistrationDao;
import com.erp.school.dao.StudentDao;
import com.erp.school.model.Login;
import com.erp.school.model.Student;
import com.erp.school.model.TeacherDetails;


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

	public ModelMap register(HttpServletRequest request,String jsonString){
		TeacherDetails teacherDetails=null;
		ObjectMapper mapper=new ObjectMapper();
		String UserName=null;
		String Password=null;
		String role=null;
		Integer regNo;
		ModelMap modelMap = new ModelMap();
		try
		{
			teacherDetails=mapper.readValue(jsonString, TeacherDetails.class);	
			registrationDao.persist(teacherDetails);
			UserName=teacherDetails.getFirstName()+"."+teacherDetails.getLastName()+""+teacherDetails.getId();
			Password="123456";
			regNo=teacherDetails.getId();
			role=teacherDetails.getRole();
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
			role=student.getRole();
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
