package com.erp.school.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.dao.StudentDao;
import com.erp.school.model.Student;
@Service
@Transactional
public class StudentService {
    
	@Autowired 
	StudentDao studentDao;
	@SuppressWarnings("unused")
	public ModelMap fetchStudentList(HttpServletRequest request,HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		List<Student> studentList =new ArrayList<Student>();
		String studentClass=null;
		String division=null;
		try{
			if(request.getParameter("studentClass") != null){
				studentClass=request.getParameter("studentClass");
			}
			if(request.getParameter("division") != null){
				division=request.getParameter("division");
			}
		     studentList = getStudentDao().fetchStudentListByStatus(studentClass,division);
		}catch(Exception e){
			e.printStackTrace();
		}
		modelMap.addAttribute("studentList", studentList);
		return modelMap;
		
	}
	
	public Integer getStudentMaxRegistrationNo(HttpServletRequest request,HttpServletResponse response){
		Integer studentRegNo=null;
		try{
			studentRegNo = getStudentDao().getStudentMaxRegistrationNo();
		}catch(Exception e){
			return 400;
		}
		return studentRegNo;
	
	}

	
	public Integer getStaffMaxRegistrationNo(HttpServletRequest request,HttpServletResponse response){
		Integer staffRegNo=null;
		try{
			staffRegNo = getStudentDao().getStaffMaxRegistrationNo();
		}catch(Exception e){
			e.printStackTrace();
			return 400;
		}
		return staffRegNo;
	
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
}
