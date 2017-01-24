import java.util.*;
public class Sort {

	public static void main(String[] args) {
			   
		     Scanner input = new Scanner(System.in);

		        // Create a new array. The user enters the size
		     System.out.println("enter the size of the array");
		        int[] array = new int[input.nextInt()];

		        System.out.println("Please enter the elements");
		        for(int i = 0; i < array.length; i++)
		            array[i] = input.nextInt();
		        input.close();

		        Arrays.sort(array);
		        for(int i = 0; i < array.length; i++)
		        System.out.println(array[i]);
		    }

		

	}


