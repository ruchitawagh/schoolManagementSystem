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
import com.erp.school.util.Response;
import com.erp.school.util.ResponseHead;
import com.erp.school.util.ResponsePayLoad;
import com.erp.school.util.ResponsePayLoadStatus;




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
		
		/**
		 * Creating Response structure to be returned.
		 */
		Response returnObject = new Response();
		
		ResponseHead responseHead = new ResponseHead();
		returnObject.setHead(responseHead);
		
		ResponsePayLoad responsePayLoad = new ResponsePayLoad();
		ResponsePayLoadStatus responsePayLoadStatus = new ResponsePayLoadStatus();
		responsePayLoad.setStatus(responsePayLoadStatus);
		returnObject.setPayLoad(responsePayLoad);
		
		try {
			user = objectMapper.readValue(jsonString, Login.class);
			isValidUser = sessionService.validateUser(user);
			if(isValidUser){
				returnObject.getHead().setId("Yet to be decided, what is to be kept in this field");
				returnObject.getHead().setSessionId("Session management is yet pending having low priority as per discussion");
				returnObject.getPayLoad().getStatus().setCode(200);
				returnObject.getPayLoad().getStatus().setMsg("Valid user");
			}else{
				returnObject.getHead().setId("Yet to be decided, what is to be kept in this field");
				returnObject.getHead().setSessionId("Session management is yet pending having low priority as per discussion");
				returnObject.getPayLoad().getStatus().setCode(400);
				returnObject.getPayLoad().getStatus().setMsg("Invalid User");
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnObject.getHead().setId("Yet to be decided, what is to be kept in this field");
			returnObject.getHead().setSessionId("Session management is yet pending having low priority as per discussion");
			returnObject.getPayLoad().getStatus().setCode(400);
			returnObject.getPayLoad().getStatus().setMsg("Oops Something went wrong : Filed in validationg user credentials");
		}
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("response", returnObject);
		return modelMap;
	}
}
