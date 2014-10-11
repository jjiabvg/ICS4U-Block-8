package com.bayviewglen.contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class AddressBook
{
	private HashMap<String, contact> addressBook;


	public AddressBook()
	{
		addressBook = new HashMap<String, contact>();
	}

	public HashMap<String, contact> getAddressBook()
	{
		return addressBook;
	}

	public void addContact(String firstName, String lastName, String phoneNumber)
	{
		contact c = new contact(firstName, lastName);
		addressBook.put(phoneNumber, c);
	}

	public void deleteAddress(String phoneNumber){
		addressBook.remove(phoneNumber);
	}
	public HashMap showAddreess(){
		return addressBook;
	}

	public contact getContact(String phoneNumber){
		return addressBook.get(phoneNumber); 
	}
	
	public contact searchByPhoneNumber(String phone){
		for (String key : addressBook.keySet()){
			if (addressBook.keySet().contains(phone)){
				addressBook.get(key).getContact();
				return addressBook.get(phone);
			}
		}
		return null;
	}

	public contact searchByFirstName(String firstName){
		for (String key : addressBook.keySet()){
			if (addressBook.get(key).getFirstName().contains(firstName)){
				addressBook.get(key).getContact();
				return addressBook.get(key);
			}
		}
		return null;
	}

	public String  Save(String k){
		return addressBook.get(k).getFirstName() + " " + addressBook.get(k).getLastName() + "," + k; 
	}

	
	public contact searchByLastName(String lastName){
		for (String key : addressBook.keySet()){
			if (addressBook.get(key).getLastName().contains(lastName)){
				addressBook.get(key).getContact();
				return addressBook.get(key);
			}
		}
		return null;


	}



	public void displayAllContacts(){
		for (String key : addressBook.keySet()){
			System.out.println(key + " " + addressBook.get(key).getFirstName() + " " + addressBook.get(key).getLastName());
		}
	}

	public Map<String, contact> getBook(){
		return addressBook;
	}

	public boolean validKey(String akey){
		for (String key : addressBook.keySet()){
			if (addressBook.containsKey(akey)){
				return true;
			}
		}
		return false;
	}
	public Set<String> keySet(){
		return addressBook.keySet();

	}


	public boolean validValue(contact c){
		for (String key : addressBook.keySet()){
			if (addressBook.containsValue(c)){
				return true;
			}
		}
		return false;
	}

	public int getSize(){
		return addressBook.size(); 
	}

	public contact get(String key) {
		return addressBook.get(key);
	}

}
