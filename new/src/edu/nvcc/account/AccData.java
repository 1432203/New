package edu.nvcc.account;

import java.util.Arrays;

public class AccData {
	private double money;
	private int viptype;
	private boolean admin;
	private String[] Character = new String[3];
	
	private static int count=0;
	
	
	public AccData(double money, int viptype, boolean admin, String[] character) {
		this.money = money;
		this.viptype = viptype;
		this.admin = admin;
		Character = character;
		count++;
	}
		
	public String toString() {
		return "Data [money=" + money + ", viptype=" + viptype + ", admin="
				+ admin + ", Character=" + Arrays.toString(Character) + "]";
	}
	//aaaa

	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getViptype() {
		return viptype;
	}
	public void setViptype(int viptype) {
		this.viptype = viptype;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String[] getCharacter() {
		return Character;
	}
	public void setCharacter(String[] character) {
		Character = character;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		AccData.count = count;
	}
}
