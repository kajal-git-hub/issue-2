/**
 * 
 */
package com.login.login.loginEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author ksingh
 *
 */

@Entity
@Table(name = "sign")
@EntityListeners(AuditingEntityListener.class)
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phoneNo")
	private long phoneNo;
	
	
	@Column(name = "password")
	private String password;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", password="
				+ password + "]";
	}

	

	
	

}
