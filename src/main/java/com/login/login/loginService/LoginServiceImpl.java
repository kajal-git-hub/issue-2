/**
 * 
 */
package com.login.login.loginService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Login.loginRepository.LoginRepository;
import com.login.login.loginEntity.Login;

/**
 * @author ksingh
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	List<Login> list;
	@Autowired LoginRepository loginRepository;
	
	@Override
	public List GetAllLogins()
	{
		List <Login> data = loginRepository.findAll();
		List list = new ArrayList<>();
		
		return list;
	}

	@Override
	public Login getLoginid(Long loginid)  {
		// TODO Auto-generated method stub
		Login l1 = null;
		for(Login login:list)
		{
			if(login.getId() == loginid)
			
			l1 = login;
			break;
		}
		
		return l1;
	}
	
	
	
	
	
	

}
