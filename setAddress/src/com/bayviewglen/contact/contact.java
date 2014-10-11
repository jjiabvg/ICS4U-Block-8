package com.bayviewglen.contact;

public class contact {
       private String lastName;
       private String firstName;
    
       
              public contact(){
                     lastName = null;
                     firstName = null;
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
              
             

			public void getContact() {
				System.out.println( firstName + " " + lastName);
				
			}
              
           
}
