package com.sit.bankmanagement.client;

import com.sits.bankmanagement.serviceI.RBI;

import com.sits.bankmanagement.serviceImpl.Sbi;

import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		RBI bank = new Sbi();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("DEAR CUSTOMER SBI WELCOMES YOU !!!!!");
		
		while(true) {
		System.out.println("1.CREATE A NEW ACCOUNT");
		System.out.println("2.DISPLAY ALL DETAILS");
		System.out.println("3.DEPOSITE MONEY TO ACCOUNT");
		System.out.println("4.WITHDRAWL MONEY FROM ACCOUNT");
		System.out.println("5.CHECK BALANCE IN YOUR ACCOUNT");
		System.out.println("6.UPDATE INFORMATION");
		System.out.println("7.EXIT FROM PROJECT");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			
			bank.createAccount();
		    break;
		    
		case 2 :
			
			bank.displayAllDetails();
			break;
		
		case 3 :
			
			bank.depositeMoney();
			break;
			
		case 4 :
			
			bank.withdrawl();
			break;
			
		case 5 :
			
			bank.balanceCheck();
			break;
		
			
		case 6:	
			
			bank.update_info();
			break;
			
		case 7 :
			
			System.out.println("EXITED");
			System.exit(0);
		    break;
			
		default:
			System.out.println("INVALID OPERATION ...PLEASE CHOOSE FROM GIVEN OPERATION");
			
		}
		
		
		}
		
		
	}

}
