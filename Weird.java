import java.util.*;

public class Weird {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=scan.nextInt();
		scan.close();
		if ( n% 2 == 0)
		{
			
			if (n>1&n<6)
			{System.out.println("Not wierd");}
			if(n>5&n<21)
			{
		         System.out.println("wierd");
			}
			if (n>20){
		         System.out.println("not wierd");
			}
		}
			else
				System.out.println(" wierd");
	}

}

