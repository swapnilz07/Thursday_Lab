package projectpackage;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
	     for(i=1;i<=5;i++)
	     {
	    	 for(j=4;j>=i;j--)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
	    	 System.out.println();
	     }
	}

}
