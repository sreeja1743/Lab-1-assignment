import java.util.*;

public class SumOfCubes {
	int temp;
 public static void main(String args[]) {
	 @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	 System.out.println("Enter the num:");
	 int n = s.nextInt();
	 SumOfCubes obj = new SumOfCubes();
	 obj.getData(obj.sumOfCubesOfDigits(n));
 }
 public long sumOfCubesOfDigits(int n) {
	 long sum = 0;
	 while(n != 0){
		temp = n%10;
		sum += Math.pow(temp, 3);
		n /= 10;
	 }
	 return sum;
 }
 public void getData(long sum) {
	 System.out.println("Sum of cubes of digits: "+sum);
 }
}