//package entity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public void details()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Please Enter your details for Registration:-");
			ValidName();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your address");
			String address = sc.next();
	        Validage();
	        Validmob();
	       
	        
	 }

	   Scanner sc=new Scanner(System.in);
	String name;
	 int age;

	    public void ValidName()
	    {
	        System.out.println("Enter your name");

	        name=sc.nextLine();

	                if(name== null || name.isEmpty())
	                    {
	                          System.out.println("Please enter your Name");
	                          ValidName();
	                    }
	    }
	 public void Validage()
	 {
	            System.out.println("Enter your age");
	            age=sc.nextInt();
	                 if(age<0 || age>99)
	                    {
	                       System.out.println("Given Age is not valid!!");
	                       
	                       Validage();
	                       
	                    }


	 }
	 public void Validmob()
	 {
		 System.out.println("Enter Mobile Number");
			String mob = sc.next();
			 String regex = "\\d{10}";
			 Pattern pattern = Pattern.compile(regex);
			 Matcher matcher = pattern.matcher(mob);
			 if(matcher.matches()) {
		         
		      } else { 
		         System.out.println("Given phone number is not valid!!");
		         Validmob();
		      }
	 }





}
