package presentation;


import java.util.List;


import java.util.Scanner;

import exception.SystemException;
import model.AccountPojo;
import model.UserPojo;
import service.AccountService;
import service.AccountServiceImpl;
import service.UserService;
import service.UserServiceImpl;



public class EasyBankingSystem {
	
		public static void main(String[] args) { //main method
			
			Scanner menu = new Scanner(System.in);
			
			AccountService accountService = new AccountServiceImpl();
			UserService userService = new UserServiceImpl(); 
			
			
			String proceed = "Y";
			
			while(proceed == "Y") {
				System.out.println("|-----------------------------------------------|");
				System.out.println("|***WELCOME TO EASY BANKING MANAGEMENT SYSTEM***|");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|          PLEASE INPUT YOUR SELECTION          |");
				System.out.println("|                                               |");
				System.out.println("|1) CREATE A NEW ACCOUNT                        |");
				System.out.println("|                                               |");
				System.out.println("|2) LOGIN WITH EXISTING ACCOUNT                 |");
				System.out.println("|                                               |");
				System.out.println("|3) EXIT                                        |");
				System.out.println("|-----------------------------------------------|");
				int selection = menu.nextInt();{
					
				
				
				switch(selection) {					
						
						case 1:
							UserPojo newUserPojo = new UserPojo();
							AccountPojo newAccountPojo = new AccountPojo();
							System.out.println("|-----------------------------------------------|");
							System.out.println("|***WELCOME TO EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|-----------------------------------------------|");
							System.out.println("|         PLEASE ENTER A NEW USERNAME           |");
							System.out.println("|-----------------------------------------------|");
							
							menu.nextLine();
							newUserPojo.setUsername(menu.nextLine());
							
							
							System.out.println("|-----------------------------------------------|");
							System.out.println("|***WELCOME TO EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|-----------------------------------------------|");
							System.out.println("|          PLEASE ENTER A NEW PASSWORD          |");
							System.out.println("|-----------------------------------------------|");
							newUserPojo.setPassword(menu.nextLine());
							UserPojo userPojo = null;
							
								try {
									userPojo = userService.addUser(newUserPojo, newAccountPojo);
								}
								catch(SystemException e) {
									System.out.println(e.getMessage());
									break;
								}
						
						    System.out.println("|-------------------------------------------|");
							System.out.println("|   ***EASY BANKING MANAGEMENT SYSTEM***    |");
							System.out.println("|-------------------------------------------|");
							System.out.println("| YOUR ACCOUNT HAS BEEN SUCESSFULLY CREATED!|");
							System.out.println("|             WELCOME NEW USER!!            |");
							System.out.println("|        PLEASE INPUT YOUR SELECTION        |");
							System.out.println("|                                           |");
							System.out.println("|1) WITHDRAW FROM ACCOUNT                   |");
							System.out.println("|                                           |");
							System.out.println("|2) DEPOSIT INTO ACCOUNT                    |");
							System.out.println("|                                           |");
							System.out.println("|3) EXIT                                    |");
							System.out.println("|-------------------------------------------|");
							String newaccountProceed = "Y";
							while (newaccountProceed == "Y"){
							int selection2 = menu.nextInt();
								
								switch(selection2) {
								
								case 1:
									System.out.println("|----------------------------------------------------------|");
									System.out.println("|           ***EASY BANKING MANAGEMENT SYSTEM***           |");
									System.out.println("|----------------------------------------------------------|");
									System.out.println("| PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO WITHDRAW BELOW |");
									System.out.println("|----------------------------------------------------------|");
									double withdraw = menu.nextDouble();
									double updatedWithdrawBalance = newAccountPojo.getAccountBalance() - withdraw;
									if (withdraw < 0) {
										System.out.println("|---------------------------------------------|");
										System.out.println("|    ***EASY BANKING MANAGEMENT SYSTEM***     |");
										System.out.println("|---------------------------------------------|");
										System.out.println("| WITHDRAW REQUEST DENIED, INSUFFICAINT FUNDS |");
										System.out.println("|---------------------------------------------|");
										break;
									}else {
										newAccountPojo.setAccountBalance(updatedWithdrawBalance);
										try {
											accountService.withdrawFromAccount(newAccountPojo);
										}catch(SystemException e) {
											System.out.println(e.getMessage());
											break;
										}

										System.out.println("|-------------------------------------------------|");
										System.out.println("|       ***EASY BANKING MANAGEMENT SYSTEM***      |");
										System.out.println("|-------------------------------------------------|");
										System.out.println("| WITHDRAW SUCESSFUL, NEW BALANCE DISPLAYED BELOW |");
										System.out.println("|-------------------------------------------------|");
										System.out.println(" NEW ACCOUNT BALANCE: " + newAccountPojo.getAccountBalance());
										break;
									}									
									
								case 2:
								
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***         |");
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO DEPOSIT BELOW|");
									System.out.println("|-------------------------------------------------------|");
									double deposit = menu.nextDouble();
									double updatedDepositBalance = newAccountPojo.getAccountBalance() + deposit;
									newAccountPojo.setAccountBalance(updatedDepositBalance);
									try {
										accountService.depositToAccount(newAccountPojo);
									}catch
										(SystemException e){
											System.out.println(e.getMessage());
											break;
										}

									System.out.println("|------------------------------------------------|");
									System.out.println("|      ***EASY BANKING MANAGEMENT SYSTEM***      |");
									System.out.println("|------------------------------------------------|");
									System.out.println("| DEPOSIT SUCESSFUL, NEW BALANCE DISPLAYED BELOW |");
									System.out.println("|------------------------------------------------|");
									System.out.println(" NEW ACCOUNT BALANCE: " + newAccountPojo.getAccountBalance());
									break;
									
								case 3:
									System.out.println("|-----------------------------------------------------------|");
									System.out.println("|***THANK YOU FOR CHOOSING EASY BANKING MANAGEMENT SYSTEM***|");
									System.out.println("|-----------------------------------------------------------|");
									System.exit(0);
									break;
								}
							
							}
							break;
						
								
	
						case 2:
							UserPojo existingUserPojo = new UserPojo();
							AccountPojo extisitingUserAccountPojo = new AccountPojo();
							System.out.println("|------------------------------------|");
							System.out.println("|***EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|------------------------------------|");
							System.out.println("|   PLEASE ENTER EXISTING USERNAME   |"); 
							System.out.println("|------------------------------------|");
							menu.nextLine();
							existingUserPojo.setUsername(menu.nextLine());
							
							System.out.println("|------------------------------------|");
							System.out.println("|***EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|------------------------------------|");
							System.out.println("|   PLEASE ENTER EXISTING PASSWORD   |"); 
							System.out.println("|------------------------------------|");
							existingUserPojo.setPassword(menu.nextLine());
							UserPojo userLoginInfo = null;
							
							try {
								userLoginInfo = userService.loginUser(existingUserPojo);
							}catch(SystemException e) {
								System.out.println("|----------------------------------------------|");
								System.out.println("|     ***EASY BANKING MANAGEMENT SYSTEM***     |");
								System.out.println("|----------------------------------------------|");
								System.out.println("| AN ERROR HAS OCCURED, PLEASE TRY AGAIN LATER |"); 
								System.out.println("|----------------------------------------------|");
								e.printStackTrace();
								break;
							}
							
							int existingUserAccountNumber = userLoginInfo.getAccountNumber();
							
							if(existingUserAccountNumber == 0) {
								System.out.println("|------------------------------------------------------|");
								System.out.println("|         ***EASY BANKING MANAGEMENT SYSTEM***         |");
								System.out.println("|------------------------------------------------------|");
								System.out.println("| INCORRECT USERNAME AND/OR PASSWORD, PLEASE TRY AGAIN |"); 
								System.out.println("|------------------------------------------------------|");
							}else {
								
								extisitingUserAccountPojo.setAccountNumber(existingUserAccountNumber);
							
							
							System.out.println("|-------------------------------------------|");
							System.out.println("|   ***EASY BANKING MANAGEMENT SYSTEM***    |");
							System.out.println("|-------------------------------------------|");
							System.out.println("|              LOGIN SUCESSFUL              |");
							System.out.println("|                                           |");
							System.out.println("|              CONTINUE? (Y/N)              |");
							System.out.println("|-------------------------------------------|");
							proceed = menu.nextLine();
							
							String accountProceed = "Y";
							while (accountProceed == "Y"){
								
							
							System.out.println("|-------------------------------------------|");
							System.out.println("|   ***EASY BANKING MANAGEMENT SYSTEM***    |");
							System.out.println("|-------------------------------------------|");
							System.out.println("|        PLEASE INPUT YOUR SELECTION        |");
							System.out.println("|                                           |");
							System.out.println("|1) WITHDRAW FROM ACCOUNT                   |");
							System.out.println("|                                           |");
							System.out.println("|2) DEPOSIT INTO ACCOUNT                    |");
							System.out.println("|                                           |");
							System.out.println("|3) EXIT                                    |");
							System.out.println("|-------------------------------------------|");
							int selection3 = menu.nextInt();
								
								switch(selection3) {
								
								case 1:
									System.out.println("|----------------------------------------------------------|");
									System.out.println("|           ***EASY BANKING MANAGEMENT SYSTEM***           |");
									System.out.println("|----------------------------------------------------------|");
									System.out.println("| PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO WITHDRAW BELOW |");
									System.out.println("|----------------------------------------------------------|");
									double withdraw = menu.nextDouble();
									double updatedWithdrawBalance = extisitingUserAccountPojo.getAccountBalance() - withdraw;
									if (withdraw < 0) {
										System.out.println("|---------------------------------------------|");
										System.out.println("|    ***EASY BANKING MANAGEMENT SYSTEM***     |");
										System.out.println("|---------------------------------------------|");
										System.out.println("| WITHDRAW REQUEST DENIED, INSUFFICAINT FUNDS |");
										System.out.println("|---------------------------------------------|");
										break;
									}else {
										extisitingUserAccountPojo.setAccountBalance(updatedWithdrawBalance);
										try {
											accountService.withdrawFromAccount(extisitingUserAccountPojo);
										}catch(SystemException e) {
											System.out.println(e.getMessage());
											break;
										}

										System.out.println("|-------------------------------------------------|");
										System.out.println("|       ***EASY BANKING MANAGEMENT SYSTEM***      |");
										System.out.println("|-------------------------------------------------|");
										System.out.println("| WITHDRAW SUCESSFUL, NEW BALANCE DISPLAYED BELOW |");
										System.out.println("|-------------------------------------------------|");
										System.out.println(" NEW ACCOUNT BALANCE: " + extisitingUserAccountPojo.getAccountBalance());
										break;
									}									
									
								case 2:
								
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***         |");
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO DEPOSIT BELOW|");
									System.out.println("|-------------------------------------------------------|");
									double deposit = menu.nextDouble();
									double updatedDepositBalance = extisitingUserAccountPojo.getAccountBalance() + deposit;
									extisitingUserAccountPojo.setAccountBalance(updatedDepositBalance);
									try {
										accountService.depositToAccount(extisitingUserAccountPojo);
									}catch
										(SystemException e){
											System.out.println(e.getMessage());
											break;
										}

									System.out.println("|------------------------------------------------|");
									System.out.println("|      ***EASY BANKING MANAGEMENT SYSTEM***      |");
									System.out.println("|------------------------------------------------|");
									System.out.println("| DEPOSIT SUCESSFUL, NEW BALANCE DISPLAYED BELOW |");
									System.out.println("|------------------------------------------------|");
									System.out.println(" NEW ACCOUNT BALANCE: " + extisitingUserAccountPojo.getAccountBalance());
									break;
									
								case 3:
									System.out.println("|-----------------------------------------------------------|");
									System.out.println("|***THANK YOU FOR CHOOSING EASY BANKING MANAGEMENT SYSTEM***|");
									System.out.println("|-----------------------------------------------------------|");
									System.exit(0);
									break;
								}
								}
								}
						
								break;
							
						case 3:
							System.out.println("|-----------------------------------------------------------|");
							System.out.println("|***THANK YOU FOR CHOOSING EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|-----------------------------------------------------------|");
							System.exit(0);
							break;
				}							
			}					
		}							
	}
}

		
		
		
		
		
	


