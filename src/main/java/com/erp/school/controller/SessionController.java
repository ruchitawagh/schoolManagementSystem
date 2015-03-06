package com.erp.school.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.school.model.Login;
import com.erp.school.service.SessionService;




/**
 * 
 * @author Pranav Kumar
 * 
 * Controller class for login, logout and session management.
 * End points belonging to this controller will verify the user against it's credentials and generate a session token to be maintained and will terminate the session after the user logs out.
 *
 */

@Controller
public class SessionController {
	
	@Autowired
	SessionService sessionService;
	
	/**
	 * End Point to be hit while logging-in
	 * 
	 * @return
	 */

	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public @ResponseBody Object login(HttpServletRequest request,  HttpServletResponse response, @RequestBody String jsonString){
		System.out.println("JSON : \n" + jsonString);
		ObjectMapper objectMapper = new ObjectMapper();
		Login user = null;
		Boolean isValidUser = true;
		try {
			user = objectMapper.readValue(jsonString, Login.class);
			System.out.println("*******************************************************************");
			System.out.println(user.getUserName());
			isValidUser = sessionService.validateUser(user);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("isValidUser", isValidUser);
		modelMap.addAttribute("message","hello, u r a valid user");
		return modelMap;
	}
}
