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


		boolean running = true; 

			AddressBook addressBook = new AddressBook();

			String bChoice; 
			System.out.println("Please enter the number)");
			System.out.println("1) J Address Book");
			System.out.println("2) I Address Book");
			System.out.println("3) A Address Book");

			bChoice = scanner.nextLine();
			String Chosen = null;
			boolean validAddressBook = false; 
			while(!validAddressBook){
			
			

			if (bChoice .equals("1")){
				Chosen = "input/J.dat";
				System.out.println("J Selected.");
				validAddressBook = true;
			}

			else if (bChoice .equals("2")){
				Chosen = "input/I.dat";
				validAddressBook = true;

				System.out.println("I  Selected.");
			}

			else if (bChoice .equals("3")){
				Chosen = "input/A.dat";
				System.out.println("A Selected.");
				validAddressBook = true;

			}
			}
			//Read the notebook
			try{
				System.out.println("=====================================================================================");


				String fname;
				String lname;
				String contact; 
				fileScanner = new Scanner(new File(Chosen));
				int numContact = Integer.parseInt(fileScanner.nextLine());
				String[] contactList = new String[numContact]; 
				for (int i = 0; i<contactList.length; ++i){
					contactList[i] = fileScanner.nextLine();
					lname = contactList[i].split(" ")[1];
					int startIndex = lname.indexOf(" ");
					int endIndex = lname.indexOf(",");
					fname =  contactList[i].split(" ")[0];
					contact = contactList[i].split(",")[1];
					lname = lname.substring(startIndex + 1, endIndex);
					addressBook.addContact(fname, lname, contact);
					}

				
			}catch(Exception ex){
				System.out.println("Umm well this is awkward... Error reading file" + ex.getMessage());
				System.exit(0);

				while(running){


				System.out.println("hello, this is an address book ");
				System.out.println("Jia is awesome"); 
				System.out.println("what would you like to do?"); 
				System.out.println("1.Add contact 2.Delete contact 3.Showcontact 4.Quit"); 
				System.out.println("5 Search By Phone Number");
				System.out.println("6 Search By First Name");
				System.out.println("7 Search By Last Name");


				iChoice = scanner.nextInt();

				if(iChoice==quit ){ 
					try{
						PrintWriter writer = new PrintWriter(new File(Chosen)); 
						writer.println(addressBook.getSize());
						for (String key : addressBook.keySet()){
							addressBook.Save(key);
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
				String phoneNumber = null; 
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
					addressBook.addContact( firstName,  lastName,  phoneNumber ); 			
				}
				else if(iChoice == remove){
					System.out.println("The guy's phone number pls"); 
					System.out.println("if you don't know, search for it first");

					boolean find = false; 
					while(!find){
						try {
							phoneNumber = temp.nextLine();
							Integer.parseInt(phoneNumber); 
						} catch (Exception e) {
							System.out.println("The value you have input is not a valid integer");
						}
						if(addressBook.validKey(phoneNumber)){
							System.out.println("pls try again"); 
						}
						addressBook.deleteAddress(phoneNumber); 			
						find = true; 
					}
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
				System.out.println("would you like to quit?y/n");
				String answer = scanner.nextLine(); 
				boolean good = true; 
				while(good){
					if(answer.equals("y")){
						running = false;
						good = false;
						try{
							PrintWriter writer = new PrintWriter(new File(Chosen)); 
							writer.println(addressBook.getSize());
							for (String key : addressBook.keySet()){
								addressBook.Save(key);
							}
							writer.close();
							System.out.println("Succesfully Saved! Have a nice day!");
							System.exit(0);

						}catch(Exception exe){
							System.out.println("Something bad happened while trying to save :( " + exe.getMessage());
							System.exit(0);      

						}
						System.out.println("good bye");
					}
					else if(answer.equals("n")){

						good = false; 
						running = true; 
					}
					else{
						System.out.println("please enter an good anwser");


					}
				}
			}

		}



	}
}



