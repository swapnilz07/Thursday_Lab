package projectpackage;

/* Write a Program to accept your basic details (Name, No, Gmail, Address, Gender, Percentage)
from user and display the output */

import java.util.Scanner;  // Import the Scanner class

public class Basicdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user_name;
        int user_no;
        String user_address;
        String user_gender;
        double user_per;
        char user_gmail;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Yoour Name:");
        user_name = sc.next();
        
        System.out.println("Enter Yoour Contact no:");
        user_no = sc.nextInt();
        
       System.out.println("Enter Your Address");
       user_address = sc.next();
       
      System.out.println("Enter Your Gender");
      user_gender = sc.next();
      
      System.out.println("Enter Your Percentage");
      user_per = sc.nextDouble();
      
      System.out.println("Enter Your Gmail");
      user_gmail = sc.next().charAt(0);
	}

}
