/**
 * 
 */
package com.login.login.loginService;

import java.util.HashMap;
import java.util.List;

import com.login.login.loginEntity.Login;

/**
 * @author ksingh
 *
 */
public interface LoginService {
	
	public List<Login> GetAllLogins();

	public Login getLoginid(Long id);

}
