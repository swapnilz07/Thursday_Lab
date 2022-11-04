package projectpackage;

/*Write a program to display the following pattern
    *         	
   ***		
  *****		
 *******		
********* 
 
 */
public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
	    	 {
	    		 System.out.print("*");
	    	 }
			System.out.println();
		}
	}

}
