
public class Totalcost {

	public static void main(String[] args) {
		double mealprice=12d;
		double tippercent=20;
		double tipcost=mealprice*(tippercent/100);
		System.out.println(tipcost);
		double taxpercent=8;
		double taxcost=mealprice*(taxpercent/100);
		System.out.println(taxcost);
		double tc;
		tc=(mealprice+taxcost+tipcost);
		System.out.println("totalcost = "+ tc);  
		
	

	}

}
