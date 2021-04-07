import java.util.*;

public class NaturalNumbers {
	
	int sum = 0;
	
  public static void main(String args[]){
	  @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	  System.out.println("Enter n value:");
	  int n = s.nextInt();
	 NaturalNumbers r = new NaturalNumbers();
	 int sum = r.calculateSum(n);
	 r.getData(sum);
  }
  
  public int calculateSum(int n) {
	  for(int i = 1; i <= n; i++) {
		  if(i%3 == 0 || i%5 == 0)
			  sum += i;
	  }
	  return sum;
  }
  public void getData(int sum) {
	  System.out.println("Sum of natural numbers that are mutliples of 5 or 3 is "+sum);
  }
}
