package com.model;

public class Admin {
	
	private int adminId;
	private String name;
	private String address;
	private String idType;
	
	
	
	
	
	public Admin(int adminId, String name, String address, String idType) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.address = address;
		this.idType = idType;
	}
	/*below respective setter and gatter method
	 * 
	 * 
	 */
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	
	/*
	 * toString method to print value of object
	 */
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", address=" + address + ", idType=" + idType + "]";
	}
	
	
	

}
