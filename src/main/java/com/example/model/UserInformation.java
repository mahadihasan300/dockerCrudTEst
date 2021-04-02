package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInformation {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String phoneNumebr;
	
	public UserInformation() {
		super();
	}

	

	public UserInformation(Long id, String name, String phoneNumebr) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumebr = phoneNumebr;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumebr() {
		return phoneNumebr;
	}

	public void setPhoneNumebr(String phoneNumebr) {
		this.phoneNumebr = phoneNumebr;
	}
	
	
	

}
