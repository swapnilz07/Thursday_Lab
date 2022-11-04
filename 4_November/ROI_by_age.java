package projectpackage;

/*Accept age and gender from user and display the rate of interest as follow

age above 60 and gender Male (RI= 7 %)
age above 60 and gender FeMale (RI= 7.5 %)
below 60 age = RI 5%*/

import java.util.Scanner;

public class ROI_by_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :- ");
		   int age=sc.nextInt();
		System.out.println("Enter your Gender :- ");
		  char gender=sc.next().charAt(0);
		  if(age>=60) 
		  {
			if(gender=='M'||gender=='m') 
			{
				System.out.println("Your Rate of interest is :- 7%");	
			}
			else
			{
				System.out.println("Your Rate of interest is :- 7.5%");	
			}
			 
		  }
		  else 
			{
				System.out.println("Your Rate of interest is :- 5%");	
			}
	}

}
