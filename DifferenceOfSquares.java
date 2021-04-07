import java.util.*;

public class DifferenceOfSquares {
	
    public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n :");
    	int n = s.nextInt();
    	DifferenceOfSquares obj = new DifferenceOfSquares();
    	int diff = obj.calculateDifference(n);
    	obj.getData(diff);
       
    }
    public int sumOfSquares(int n) {
    	int sum = (n*(n+1)*(2*n+1)/6);
    	return sum;
    }
    public int sumOfN(int n) {
    	int sum = (n*(n+1)/2);
    	return sum*sum;
    }
    public int calculateDifference(int n) {
    	int diff = sumOfSquares(n)-sumOfN(n);
    	return diff;
    }
    public void getData(int diff) {
    	System.out.println("Difference between sum of squares and square of sum is "+diff);
    }
}
