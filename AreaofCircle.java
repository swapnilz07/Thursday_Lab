package projectpackage;

//Write a Program to accept P, R & no. of years from User and calculate simple Interest?

import java.util.Scanner;  // Import the Scanner class

public class AreaofCircle {
	public static void main(String[] args) {
		double radius, circumference, area;
		Scanner sc=new Scanner (System.in);  
		System.out.print("Enter the radius of the circle: ");   
	    radius=sc.nextDouble();  
	    area=(Math.PI*(radius*radius));  
	    System.out.println("The area of the circle is: "+area); 
	    
	    System.out.print("Enter the circumference of the circle: ");   
	    circumference=sc.nextDouble();  
	    area=(circumference*circumference)/(4*Math.PI);  
	    System.out.print("The area of the circle is: "+area);
}
}
