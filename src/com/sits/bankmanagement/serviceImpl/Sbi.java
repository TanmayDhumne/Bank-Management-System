package com.sits.bankmanagement.serviceImpl;
import com.sit.bankmanagement.model.*;
import com.sits.bankmanagement.serviceI.RBI;

import java.util.Scanner;
public class Sbi implements RBI {
    boolean flag ;
	Scanner sc = new Scanner(System.in);
	Account useraccount = new Account();
	int choice1 = 0;
//--------------CREATE ACCOUNT METHOD------------------------	
	@Override
	public void createAccount() {
		
		System.out.print("ENTER YOUR NAME:-");
		String name = sc.next();
		System.out.println();
		useraccount.setName(name);
		
		System.out.print("ENTER YOUR ACCOUNT NUMBER:-");
		String acc_number = sc.next();
		System.out.println();
	    useraccount.setAccNo(acc_number);
		
		
		System.out.print("ENTER YOUR ADHAR NUMBER:-");
		String adhar_no = sc.next();
		System.out.println();
		useraccount.setAdharNo(adhar_no);
		
		
		
		while(true) {
			
			System.out.print("ENTER YOUR GENDER:-");
			String male ="Male";
			String female = "Female";
			String others = "Other";
			System.out.println();
			System.out.println("IF YOUR GENDER IS OTHER THAN MALE OR FEMALE TYPE --OTHER-- :");
			String Gender = sc.next();
			System.out.println();
			
			if(Gender.equalsIgnoreCase(male) || Gender.equalsIgnoreCase(female) || Gender.equalsIgnoreCase(others)) {
				
				useraccount.setGender(Gender);
				break;
				
			}else {
				
				System.out.println("INVALID INPUT");
				
			}
			
		}
		
		
		
		
		
	    
		while(true) {
			
	    System.out.print("ENTER YOUR MOBILE NUMBER:-");
		String mobile_no = sc.next();
		System.out.println();
			
		    if(mobile_no.length()==10) {
		    	useraccount.setMobNo(mobile_no);
	         break;
		    }else {
		    	
		    	System.out.println("YOUR MOBILE NUMBER IS NOT VALID IT SHOULD BE 10 DIGIT");
		    	
		    }
		}
		
		
		while(true) {
			
			System.out.print("ENTER YOUR AGE:-");
			int age = sc.nextInt();
			System.out.println();
			
		if(age>10) {
			
			useraccount.setAge(age);
			break;
		}else {
			
			System.out.println("YOUR AGE MUST BE GREATER THAN 10");
			
		}	
			
			
		}
		
		
		
		while(true) {
		System.out.print("ENTER 1st DEPOSITE(IT SHOULD BE MINIMUM 500):- ");
		double balance = sc.nextDouble();
		
		
		System.out.println();
		
		if(balance >= 500) {
			
			useraccount.setBalance(balance);
			System.out.println("THANK YOU!!!");
			System.out.println("CREATE ACCOUNT SUCCESSFULLY!!");
			System.out.println("YOUR CURRENT BALANCE IS :-"+balance);
			
			break;
			}else {
				
				System.out.println("YOUR INPUT AMOUNT IS LESS THAN 500 ...PLEASE ENTER THE AMOUNT MORE THAN 500");
				
		
			}
		
		
		
		}
		
//		while(balance<=500) {
//			
//		 balance = sc.nextDouble();
//			
//			if(balance >= 500) {
//				
//				useraccount.setBalance(balance);
//				System.out.println("CREATE ACCOUNT SUCCESSFULLY!!");
//				}else {
//					
//					System.out.println("YOUR INPUT AMOUNT IS LESS THAN 500...PLEASE ENTER THE AMOUNT MORE THAN 500");
//					
//				}
//		 
//		 
//		 
//		}
		flag =true;
		}
	
		
		
	
//-------------DISPLAY DETAILS METHOD------------------------	
	@Override
    public void displayAllDetails() {
		
		
				if(flag == true) {
			System.out.println("ENTER THE ACCOUNT NUMBER:-");
			
				
				
			String Verify_acc_number = sc.next();
			//while(true) {
			
		if(Verify_acc_number.equals(useraccount.getAccNo())) {
		
		System.out.println();
		System.out.println();
	    System.out.println("ACCOUNT HOLDER NAME IS:- "+useraccount.getName());
	    System.out.println("ACCOUNT NUMBER IS:- "+useraccount.getAccNo());
	    System.out.println("ADHAR NUMBER OF "+useraccount.getName()+"is:- "+useraccount.getAdharNo());
	    System.out.println(useraccount.getName()+" gender is "+useraccount.getGender());
	    System.out.println(useraccount.getName()+" age is "+useraccount.getAge());
        System.out.println("YOUR MOBILE NUMBER :-"+useraccount.getMobNo());
        System.out.println("YOUR CURRENT BALANCE IS :- "+useraccount.getBalance());
        System.out.println();
        System.out.println();
       // break;
		}else {
			
		    System.out.println("ENTERED ACCOUNT NUMBER DONT MATCH");
            System.out.println();		
			
			
		}
		}else {
			
			System.out.println("THE ACCOUNT DOES NOT EXIST..!!!");
			
		}
		}
		
		//flag =true;
		
//	}
		
	
//-------------DEPOSITE METHOD------------------------------	
	@Override
    public void depositeMoney() {
		
		if(flag == true) {
			System.out.println("ENTER THE ACCOUNT NUMBER:-");
			String Verify_acc_number = sc.next();
		    
			if(Verify_acc_number.equals(useraccount.getAccNo())) {
			
			System.out.println("CHOOSE ACCOUNT TYPE:-");
			System.out.println("1.SAVING ACCOUNT");
			System.out.println("2.CURRENT ACCOUNT");
			int Account_type = sc.nextInt();
			System.out.print("ENTER THE AMOUNT TO BE DEPOSITE:-");
			System.out.println("--MINIMUM AMOUNT TO BE DEPOSITE 1000--");
            int deposite = sc.nextInt();
			
			
			
			switch(Account_type) {
			
			case 1:
				
				if(Account_type ==1) {
				
					
					if(deposite>=1000) {
					
				
				
				System.out.println("BALANCE IN YOUR ACCOUNT :-"+useraccount.getBalance());
				
			    double b = useraccount.getBalance()+deposite;
				
				useraccount.setBalance(b);
				
				
				System.out.println("TOTAL AMOUNT IN YOUR SAVING ACCOUNT AFTER DEPOSITE:- "+ b);
				
				}else {
					
					System.out.println("ENTER AMOUNT MORE THAN 1000");
					System.out.println("AMOUNT IS NOT DEPOSITED IN THE ACCOUNT");
					
				}
				}
				
				break;
			
			case 2 :
				
				if(Account_type ==2) {
					
					if(deposite>=1000) {
					
					
					System.out.println("BALANCE IN YOUR ACCOUNT :-"+useraccount.getBalance());
					
					
					   double b = useraccount.getBalance()+deposite;
					
					   useraccount.setBalance(b);
					
					System.out.println("TOTAL AMOUNT IN YOUR CURRENT ACCOUNT AFTER DEPOSITE:- "+b);
			
					
			}else {
				
				System.out.println("ENTER AMOUNT MORE THAN 1000");
				System.out.println("AMOUNT IS NOT DEPOSITED IN THE ACCOUNT");
				
			}
				}
			
		}
		
		
	
    }else {
    	
    	System.out.println("YOUR ACCOUNT NUMBER IS NOT MATCHED WITH THE PREVIOUS ");
    	
    }
	}
	}
//--------------WITHDRAWL METHOD----------------------------
	@Override
    public void withdrawl() {
	
		if(flag == true) {
			System.out.println("ENTER THE ACCOUNT NUMBER:-");
			
			String Verify_acc_number = sc.next();
		    
			if(Verify_acc_number.equals(useraccount.getAccNo())) {
			
			System.out.println("CHOOSE ACCOUNT TYPE:-");
			System.out.println("1.SAVING ACCOUNT");
			System.out.println("2.CURRENT ACCOUNT");
			int Account_type = sc.nextInt();
			System.out.print("ENTER THE AMOUNT TO BE WITHDRAWL :-");
			System.out.println("--MINIMUM AMOUNT TO BE WITHDRAWL IS 500--");
            int withdrawl = sc.nextInt();
			
		
	        
			switch(Account_type) {
			
			case 1:
				
				if(Account_type ==1) {
				
					
					if(withdrawl>=500) {
					
				
				
				System.out.println("BALANCE IN YOUR ACCOUNT :-"+useraccount.getBalance());
				
				
				
				double b = useraccount.getBalance() - withdrawl ;
				
				
				useraccount.setBalance(b);
				System.out.println("TOTAL AMOUNT IN YOUR SAVING ACCOUNT AFTER WITHDRAWL:- "+b);
				
				}else {
					
					System.out.println("ENTER AMOUNT MORE THAN 500");
					System.out.println("AMOUNT IS NOT WITHDRAWL FROM YOUR ACCOUNT");
					
				}
				}
				
				break;
			
			case 2 :
				
				if(Account_type ==2) {
					
					if(withdrawl>=500) {
					
					
					System.out.println("BALANCE IN YOUR ACCOUNT :-"+useraccount.getBalance());
					
					double b = useraccount.getBalance()-withdrawl;
					useraccount.setBalance(b);
					System.out.println("TOTAL AMOUNT IN YOUR CURRENT ACCOUNT AFTER WITHDRAWL:- "+useraccount.getBalance());
			
			}else {
				
				System.out.println("ENTER AMOUNT MORE THAN 500");
				System.out.println("AMOUNT IS NOT WITHDRAWL FROM ACCOUNT");
				
			}
				}
			
		}
		
		
	
    }else {
    	
    	System.out.println("YOUR ACCOUNT NUMBER IS NOT MATCHED WITH THE PREVIOUS ");
    	
    }
	}
	}
	
	
    
//--------------CHECK BALANCE METHOD-----------------------	
	@Override
    public void balanceCheck() {
	
		if(flag == true) {
			System.out.println("ENTER THE ACCOUNT NUMBER:-");
			String Verify_acc_number = sc.next();
		   if(Verify_acc_number.equals(useraccount.getAccNo())) {
			   
			   
			   System.out.println("YOUR ACCOUNT BALANCE IS:-");
			   System.out.println(useraccount.getBalance());
			   
			   
		   }else {
			   
			   System.out.println("ACCOUNT DOSE NOT MATCH");
			   
		   }
	   
    }

	}
	
//---------------UPDATE_INFORMATION------------------------------------	
	
	public void update_info() {
		int out = 0;
		do {
			System.out.println();
			System.out.println();
		System.out.println("CHOOSE THE OPTION WHICH YOU WANT TO UPDATE:-");
		System.out.println("1.UPDATE ACCOUNT HOLDER NAME");
		System.out.println("2.UPDATE YOUR MOBILE NUMBER");
		System.out.println("3.UPDATE YOUR AGE");
		System.out.println("4.EXIT");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("UPDATING THE NEW NAME");
			System.out.println();
			System.out.println("ENTER THE NEW NAME TO USE AS THE ACCOUNT HOLDER NAME:-");
			String name2 =sc.next();
			useraccount.setName(name2);
			System.out.println("NEW ACCOUNT NAME AS --"+name2+"--IS SET..!!!");
		    break;
		    
		case 2:
			
			System.out.println("UPDATING THE MOBILE NUMBER");
			System.out.println();
			System.out.println("ENTER THE NEW MOBILE NUMBER TO BE USED:-");
			String mobile_no2= sc.next();
			useraccount.setMobNo(mobile_no2);
			System.out.println("NEW MOBILE IS SET SUCCESSFULLY !!!");
			break;
		
		case 3:
			
			System.out.println("UPDATING THE ACCOUNT HOLDER AGE");
			System.out.println();
			System.out.println("ENTER THE NEW AGE TO BE UPDATED");
			int age2 = sc.nextInt();
			useraccount.setAge(age2);
			System.out.println("NEW AGE SET SUCCESSFULLY!!!!!");
			break;
			
		case 4 :
			out = 4;
			System.out.println("EXITED");
	
			default:
				System.out.println("ENTER THE CHOICE FROM BELOW");
			
		}
		}while(out==0);	
	}
	
	
	
	
}
