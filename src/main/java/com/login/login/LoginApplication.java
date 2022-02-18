/**
 * 
 */
package com.login.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;



/**
 * @author ksingh
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LoginApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LoginApplication.class, args);
		
	}

}