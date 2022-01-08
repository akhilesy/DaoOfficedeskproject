package com.model;

public class User {

	private int userid;
	private String name;
	private String address;
	private String bookingstatus;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public User(int userid, String name, String address, String bookingstatus) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.bookingstatus = bookingstatus;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", address=" + address + ", bookingstatus=" + bookingstatus
				+ "]";
	}

}
