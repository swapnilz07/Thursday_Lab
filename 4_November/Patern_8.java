package projectpackage;

//Write a program to display the following pattern?

/*
******
*    *
*    *
******
*/

public class Patern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(i==0||i==3||j==0||j==3)
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
