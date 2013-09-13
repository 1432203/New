package edu.nvcc.account;
import javax.swing.JOptionPane;
public class Test {

	public static void main(String[] args) {
		Account acctest1 = new Account(01, "account1", "password", 4444);
		Account acctest2 = new Account(02, "account2", "password2", 4445);
		JOptionPane.showMessageDialog(null,acctest1.getAcNum() + "\n" + acctest1.getId() + "\n" + acctest1.getPin());
		acctest2.setPin(3065);
		
		JOptionPane.showMessageDialog(null,acctest1);
		JOptionPane.showMessageDialog(null,acctest2);


		System.out.println("There are " + Account.getCount() + " account(s).");
		Account.setCount(5);
		System.out.println("There are " + Account.getCount() + " account(s).");
		
	}
	
}
