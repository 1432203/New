

package edu.nvcc.account;
public class Account {
	private int acNum;
	private String id;
	private String password;
	private int pin;
	private static int count=0;
	public Account(int acNum, String id, String password, int pin) {
		
		this.acNum = acNum;
		this.id = id;
		this.password = password;
		this.pin = pin;
		count++;
	}
	public int getAcNum() {
		return acNum;
	}
	public void setAcNum(int acNum) {
		this.acNum = acNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Account.count = count;
	}
	
	@Override
	public String toString() {
		return "Account [acNum=" + acNum + ", id=" + id + ", password="
				+ password + ", pin=" + pin + "]";
	}

}
