package com.qf.domain;

public class User {
	private String uername;
	private String password;
	private String sex;
	private String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String uername, String password, String sex, String email) {
		super();
		this.uername = uername;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}
	public String getUername() {
		return uername;
	}
	public void setUername(String uername) {
		this.uername = uername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
