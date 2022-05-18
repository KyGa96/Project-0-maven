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
							System.out.println("|                (LETTERS ONLY)                 |");
							System.out.println("|-----------------------------------------------|");
							newUserPojo.setPassword(menu.nextLine());
							UserPojo returnedUserPojo = null;
							
								try {
									returnedUserPojo = userService.addUser(newUserPojo);
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
						
						int selection2 = menu.nextInt();
								switch(selection2) {
								
								case 1:
									System.out.println("|--------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***          |");
									System.out.println("|--------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO WITHDRAW BELOW|");
									System.out.println("|                                                        |");
									System.out.println("|                   TYPE EXIT TO QUIT                    |");
									System.out.println("|--------------------------------------------------------|");
									
									break;
									
								case 2:
								
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***         |");
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO DEPOSIT BELOW|");
									System.out.println("|                                                       |");
									System.out.println("|                   TYPE EXIT TO QUIT                   |");
									System.out.println("|-------------------------------------------------------|");
									break;
									
								case 3:
									System.out.println("|-----------------------------------------------------------|");
									System.out.println("|***THANK YOU FOR CHOOSING EASY BANKING MANAGEMENT SYSTEM***|");
									System.out.println("|-----------------------------------------------------------|");
									System.exit(0);
									break;
								
								}
						
								break;
						
								
	
						case 2:
							UserPojo existingUserPojo = new UserPojo();
							System.out.println("|------------------------------------|");
							System.out.println("|***EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|------------------------------------|");
							System.out.println("|   PLEASE ENTER EXISTING USERNAME   |"); 
							System.out.println("|------------------------------------|");
							existingUserPojo.setUsername(menu.nextLine());
							
							menu.nextLine();
							System.out.println("|------------------------------------|");
							System.out.println("|***EASY BANKING MANAGEMENT SYSTEM***|");
							System.out.println("|------------------------------------|");
							System.out.println("|   PLEASE ENTER EXISTING PASSWORD   |"); 
							System.out.println("|------------------------------------|");
							existingUserPojo.setPassword(menu.nextLine());
							
							System.out.println("|-------------------------------------------|");
							System.out.println("|   ***EASY BANKING MANAGEMENT SYSTEM***    |");
							System.out.println("|-------------------------------------------|");
							System.out.println("|              LOGIN SUCESSFUL              |");
							System.out.println("|                                           |");
							System.out.println("|              CONTINUE? (Y/N)              |");
							System.out.println("|-------------------------------------------|");
							proceed = menu.nextLine();
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
									System.out.println("|--------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***          |");
									System.out.println("|--------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO WITHDRAW BELOW|");
									System.out.println("|--------------------------------------------------------|");
									break;
									
								case 2:
								
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|          ***EASY BANKING MANAGEMENT SYSTEM***         |");
									System.out.println("|-------------------------------------------------------|");
									System.out.println("|PLEASE INPUT THE AMOUNT YOU WOULD LIKE TO DEPOSIT BELOW|");
									System.out.println("|-------------------------------------------------------|");
									break;
								case 3:
									System.out.println("|-----------------------------------------------------------|");
									System.out.println("|***THANK YOU FOR CHOOSING EASY BANKING MANAGEMENT SYSTEM***|");
									System.out.println("|-----------------------------------------------------------|");
									System.exit(0);
									break;
								
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
				
			
				
		
				

		
		
		
		
		
	


