import java.util.*;
public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=scan.nextInt();
		scan.close();
		String x=Integer.toBinaryString(n);
    	System.out.println(Integer.toBinaryString(n));
    	int result = Integer.parseInt(x);
    	System.out.println(result);
    	
    	  ArrayList<Integer> List = new ArrayList<Integer>();

          // for example if I know the size of the input is 5, 
          // then I read one single number and put it into the arraylist.
          
              
              List.add(result);
          
          System.out.println(List);
          
          countSetBits(result);
	
	}  
          public static int countSetBits(int result)
          { int count = 0;
          while(result>0)
          { ++count; result &= result-1; } 
          return count;
          }
          
          
}  
	


