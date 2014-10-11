package com.bayviewglen.contact;

public class contact {
       private String lastName;
       private String firstName;
       private String phoneNumber;
       
              public contact(){
                     lastName = null;
                     firstName = null;
                     phoneNumber = null;
              }
              
              public contact(String last, String first){
                     lastName = last;
                     firstName = first;
              }
       
              public String getLastName(){
                     return lastName;
              }
              
              public String getFirstName(){
                     return firstName;
              }
              
              public String getPhoneNumber(){
                     return phoneNumber;
              }

			public void getContact() {
				System.out.println(phoneNumber + " " + firstName + " " + lastName);
				
			}
              
           
}
