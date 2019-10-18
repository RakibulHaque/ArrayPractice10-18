import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args)
	{
		int intArr[] = {10,20,15,30,9};
		
		Arrays.parallelSort(intArr);
		
		System.out.println("Integer Array: "+ Arrays.toString(intArr));
		
	}

}
