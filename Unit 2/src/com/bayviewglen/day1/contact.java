package com.bayviewglen.day1;

public class contact {
       private String lname;
       private String fname;
       private String phone;
       
              public contact(){
                     lname = null;
                     fname = null;
                     phone = null;
              }
              
              public contact(String last, String first, String phoneNum){
                     lname = last;
                     fname = first;
                     phone = phoneNum;
              }
       
              public String getLastName(){
                     return lname;
              }
              
              public String getFirstName(){
                     return fname;
              }
              
              public String getPhoneNumber(){
                     return phone;
              }
              
              public String searchByLName(){
				return phone;
            	  
              }

}
