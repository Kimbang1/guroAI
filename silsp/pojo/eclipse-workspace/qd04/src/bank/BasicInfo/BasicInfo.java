package bank.BasicInfo;

import java.util.Scanner;


public class BasicInfo {

	private String account;
	private double balance;
	

	public void balance(String account, double balance) {
		this.account= account;
		this.balance= balance;
	}
	
	public void mtdBalance() {
		System.out.printf( account + " 계좌잔액 : %d%f 원%n" );
		
	}
	
	
}
