package SeleniumSession.SeleniumSession;

public class StarPattern {

	public static void main(String[] args) {
		 for(int row =1 ; row<=4; row++)
	        {        	
	        	
	        	for(int space = 3; space >=row; space--)
	        	{
	        		System.out.print(" ");
	        	}   
	        	
	        	for(int j = 1; j<=row; j++)
	        	{
	        		System.out.print("*");
	        	}
	        	
	        	System.out.println("");
	        }
	      
		for(int row = 1; row<=4 ; row++)
		{
			for(int col = 1; col<=row; col ++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		for(int row = 1; row<=4 ; row++)
		{
			for(int col = 4 ; col>=row; col--)
			{
				System.out.print("*");
			}			
			System.out.println("");
		}
		
     for(int row =1 ; row<=4; row++)
     {        	
     	for (int col = 4; col>=row;)
     	{        		
     		System.out.print("*");
     		col--;
      	}
     	
     	System.out.println("");
     	for(int space = 1; space <=row; space++)
     	{
     		System.out.print(" ");
     	}      	
     }
     
     
    

	}

}
