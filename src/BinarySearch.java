import java.util.Arrays;

// Java program to demonstrate 
// Arrays.binarySearch() method 
  
public class BinarySearch {
	
	public static void main(String[] args)
	{
		
	  
	        // Get the Array 
	        int intArr[] = { 10, 20, 15, 22, 35 }; 
	  
	        Arrays.sort(intArr); 
	  
	        int intKey = 22; 
	  
	        System.out.println(intKey 
	                           + " found at index = "
	                           + Arrays 
	                                 .binarySearch(intArr, intKey)); 
	     
		
	}

}
