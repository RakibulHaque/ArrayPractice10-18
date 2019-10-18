import java.util.Arrays;

public class ArraySearching {

	
	public static void main(String[] args)
	{
		//Get the array
		
		int intArr[] = {10,20,15,22,35};
		
		Arrays.parallelSort(intArr);
		
		int intKey = 22;
		
		System.out.println(intKey + "found in index = " + Arrays.binarySearch(intArr, intKey));
		
		
	}
}
