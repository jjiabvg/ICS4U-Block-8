/**
 * 
 */
package com.bayviewglen.contact;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import com.bayviewglen.contact.*;

/**
 * @author jjia
 *
 */
public class runner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner temp = new Scanner(System.in);
		Scanner fileScanner = new Scanner(System.in); 
		int iChoice; 
		final int add = 1; 
		final int remove = 2; 
		final int show = 3; 
		final int quit = 4; 
		final int searchPhone = 5; 
		final int searchLName = 7;
		final int searchFName = 6;



		AddressBook addressBook = new AddressBook();

		String bChoice; 
		System.out.println("Please enter the number)");
		System.out.println("1) J Address Book");
		System.out.println("2) I Address Book");
		System.out.println("3) A Address Book");
	
		bChoice = scanner.nextLine();
		String addressBookChosen = null;
		boolean validAddressBook = false; 
		while(!validAddressBook){
			try{
				if (bChoice .equals("1") || bChoice .equals("2") || bChoice .equals("3") ){
					validAddressBook = true;
				}else
					throw new Exception();

			}catch(Exception e){
				System.out.println("please type a valid choice.");
				bChoice = fileScanner.nextLine();
			}
		}

		if (bChoice .equals("1")){
			addressBookChosen = "traddressbook.txt";
			fileScanner = new Scanner("inputs/traddressbook.txt");
			System.out.println("J Address Book Selected.");
		}

		else if (bChoice .equals("2")){
			addressBookChosen = "fladdressbook.txt";
			fileScanner = new Scanner("inputs/fladdressbook.txt");
			System.out.println("I Address Book Selected.");
		}

		else if (bChoice .equals("3")){
			addressBookChosen = "viaddressbook.txt";
			fileScanner = new Scanner("inputs/viaddressbook.txt");
			System.out.println("A Address Book Selected.");
		}



		System.out.println("hello, this is an address book ");
		System.out.println("Jia is awesome"); 
		System.out.println("what would you like to do?"); 
		System.out.println("1.Add contact 2.Delete contact 3.Showcontact 4.Quit"); 
		System.out.println("5 Search By Phone Number");
		System.out.println("6 Search By First Name");
		System.out.println("7 Search By Last Name");

		boolean adding = false; 
		boolean removing = false; 
		boolean showing = false; 
		iChoice = scanner.nextInt();

		if(iChoice==quit ){ 
			try{
				PrintWriter writer = new PrintWriter(new File(addressBookChosen)); 
				writer.println(addressBook.getSize());
				for (String key : addressBook.keySet()){
					writer.print(addressBook.get(key));  // make sure to change this once money lost is put in
					writer.println(addressBook.get(key));
				}
				writer.close();
				System.out.println("Succesfully Saved! Have a nice day!");
				System.exit(0);

			}catch(Exception exe){
				System.out.println("Something bad happened while trying to save :( " + exe.getMessage());
				System.exit(0);      

			}

		}


		
		String firstName; 
		String lastName;
		String phoneNumber; 
		if(iChoice == add){

			System.out.println("The guy's first name pls"); 
			firstName = temp.nextLine(); 
			System.out.println("The guy's last name pls"); 
			lastName = temp.nextLine(); 
			System.out.println("The guy's phone number pls"); 
			try {
				phoneNumber = temp.nextLine();
				Integer.parseInt(phoneNumber); 
			} catch (Exception e) {
				System.out.println("The value you have input is not a valid integer");
			}
			phoneNumber = temp.nextLine();
			addressBook.addContact( firstName,  lastName,  phoneNumber ); 			
		}
		else if(iChoice == remove){
			System.out.println("The guy's phone number pls"); 
			System.out.println("if you don't know, search for it first");
			phoneNumber = temp.nextLine();
			addressBook.deleteAddress(phoneNumber); 			

		}
		else if (iChoice == searchPhone ){

			String input; 
			System.out.print("Enter the number");
			input = scanner.nextLine();

			boolean searching = false; 
			while(searching = false){ 
				System.out.println("Please enter the Last Name of the person you wish to search for: ");
			}
			try {
				input = scanner.nextLine();
				Integer.parseInt(input); 
			}catch(Exception e){
				System.out.println("a name pls");
			}
					
			if (addressBook.searchByFirstName(input) == null){
				System.out.println("nobody with that name exist.");
				
			}
				addressBook.searchByPhoneNumber(input);
				searching = true; 
				
			}

		

		if (iChoice == searchFName){
			String searchedFName = null; 
				boolean searching = false; 
				while(searching = false){ 
					System.out.println("Please enter the Last Name of the person you wish to search for: ");
				}
				try {
					searchedFName = scanner.nextLine();
				}catch(Exception e){
					System.out.println("a name pls");
				}
						
				if (addressBook.searchByFirstName(searchedFName) == null){
					System.out.println("nobody with that name exist.");
					
				}
					addressBook.searchByLastName(searchedFName);
					searching = true; 
					
				}

		

		if (iChoice == searchLName){
		String searchLastName = null;
		boolean searching = false; 
		while(searching = false){ 
			System.out.println("Please enter the Last Name of the person you wish to search for: ");
		}
		try {
			searchLastName = scanner.nextLine();
		}catch(Exception e){
			System.out.println("a name pls");
		}
				
		if (addressBook.searchByFirstName(searchLastName) == null){
			System.out.println("nobody with that name exist.");
			
		}
			addressBook.searchByLastName(searchLastName);
			searching = true; 
			
		}
		}
	}
		/*

		// Searches for a contact through the last name *Done*
		if (mainChoice . equals("3")){
			String searchedLastName;
			System.out.println("Please enter the Last Name of the person you wish to search for: ");
			searchedLastName = choiceScanner.nextLine();

			if (AddressBook.searchByLastName(searchedLastName) == null){
				System.out.println("Sorry nobody with that last name exists...");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
				System.out.println("Returning to main menu...");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
			}
			if (AddressBook.searchByLastName(searchedLastName) != null){

			}
		}
		 */

	


