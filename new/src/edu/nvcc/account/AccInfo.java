package edu.nvcc.account;

public class AccInfo {
	
	private int phone;
	private String firstname;
	private String lastname;
	private static int count=0;
	
	public AccInfo(int phone, String firstname, String lastname) {
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		count++;	
	}
	
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		AccInfo.count = count;
	}

}
