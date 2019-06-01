import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) 
	{
		// In a congruence modulo problem
		// ax congruent b mod m where 0 <= x <= 10000
		// x is the range
		// calculated as (a*i-b)%m which gives the remainder of the congruence modulo's current coefficient
		
		int a = 180;
		int b = 256;
		int m = 887;
		int x = 10000;
		
		List<Integer> xholds = new ArrayList<Integer>();
		
		for (int i = 0; i <= x; i++)
		{
			int r = (a*i-b)%m;
			System.out.println("("+a+"*"+i+"-"+b+")"+"%"+m);
			if (r == 0)
			{
				System.out.println("Holds with no remainder");
				xholds.add(i);
			}
			else
			{
				System.out.println("Does not hold with remainder " + r);
			}
		}
		
		System.out.println();
		System.out.println("Values that hold include:");
		System.out.println(xholds);
	}
	
}
