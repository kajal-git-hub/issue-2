/**
 * 
 */
package com.login.login.loginController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.login.login.loginEntity.Login;
import com.login.login.loginService.LoginService;

/**
 * @author ksingh
 *
 */

@RestController
public class LoginController {
	
	@Autowired LoginService loginService;
	
	
	@GetMapping("/logins")
	public List<Login> GetAllLogins()
	{
		
		return null;
	}
	
	@GetMapping("/logins/{loginId}")
	public Login getLogin(@PathVariable String loginId)
	{
		return this.loginService.getLoginid(Long.parseLong(loginId));
	}
	
	

}
