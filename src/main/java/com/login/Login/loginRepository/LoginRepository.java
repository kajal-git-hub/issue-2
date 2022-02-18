/**
 * 
 */
package com.login.Login.loginRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.login.loginEntity.Login;

/**
 * @author ksingh
 *
 */
public interface LoginRepository extends JpaRepository<Login,Long>{

}
