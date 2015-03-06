package com.erp.school.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.erp.school.dao.LoginDao;
import com.erp.school.model.Login;


@Service
@Transactional
public class SessionService {
	
	@Autowired
	LoginDao loginDao;
	
	/*@Autowired
	GenericDao genericDao;*/
	
	/**
	 * Below method "doOperation" has nothing to do. I was initially written for PUC kind of work.
	 * @param request
	 * @return
	 */
	
	public ModelMap doOperation(HttpServletRequest request){
		/*User user = new User();
		user.setUserName(request.getParameter("name"));
		user.setRegistrationNumber("A302");
		user.setStandard(5);
		user.setDivision("div-A");
		//user.setId(1);
		ModelMap modelMap = new ModelMap();
		//modelMap.addAttribute("userObject", user);
		modelMap.addAttribute("status", "Succes");
		modelMap.addAttribute("object",user);
		//genericDao.persist(user);
		//em.persist(user);
		//em.flush();
		TypedQuery<User> userTypedQuery = em.createQuery("from User where id=?1", User.class);
		userTypedQuery.setParameter(1, 10);
		List<User> userList = userTypedQuery.getResultList();
		List<User> userList1 = userTypedQuery.getResultList();
		//User user1 = userTypedQuery.getSingleResult();
		userList.get(0).setUserName(userList.get(0).getUserName() + "-X");
		em.persist(user);
		modelMap.addAllAttributes(userList);
		modelMap.addAllAttributes(userList1);
		modelMap.addAttribute("message", "Hello " + user.getUserName() + " !");*/
		ModelMap modelMap = new ModelMap();
		return modelMap;
		
	}
	
	
	/**
	 * Method for validating the user for the credentials entered while log-in process.
	 * @param user
	 * @return Boolean
	 */
	public Boolean validateUser(Login user){
		List<Login> userList = loginDao.getLoginByUserNameAndPasword(user);
		
		if(userList != null && userList.size() > 0){
			return true;
		}else{
			return false;
		}
	}

}
