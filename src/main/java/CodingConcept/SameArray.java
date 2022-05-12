package CodingConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SameArray {

	public static void main(String[] args) {
		
		/*
		 * Array is a container in which we can store similar types of element
		 * 
		 */
     int[] arr1= {2,8,5};
     int[] arr2= {2,8,5};
     boolean flag = true;
     if(arr1.length==arr2.length)
     {
    	
    	 System.out.println("Length match- we can check now");
    	 for (int i = 0; i < arr1.length ; i++)
    	 {
    		
    		if( arr1[i]!=arr2[i])
    		{
    			flag=false; 
    			System.out.println("Not Matched");
    			break;
    			
    		}
    		
    		}
    	 }
    	
     
     else 
     {
    	 flag=false;
    	 if(flag)
    	 {
    		 System.out.println("Equal");
    	 }
    	 else
    	 {
    		 System.out.println("not equal");
    	 }
    	 
     }
     
     ArrayList<String> arrL= new ArrayList<String>();
     arrL.add("Riya");
     arrL.add("Rahul");
     
     for(String a : arrL)
     {
    	 System.out.println(a);
     }
     Collections.sort(arrL);
     System.out.println(arrL);
     
     Collections.sort(arrL,Collections.reverseOrder());
	}

}
