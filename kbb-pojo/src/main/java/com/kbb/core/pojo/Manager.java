package com.kbb.core.pojo;

public class Manager {
	private String managerUserName;
	private String managerPassword;
	public String getManagerUserName() {
		return managerUserName;
	}
	public void setManagerUserName(String managerUserName) {
		this.managerUserName = managerUserName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public Manager(String managerUserName, String managerPassword) {
		super();
		this.managerUserName = managerUserName;
		this.managerPassword = managerPassword;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
