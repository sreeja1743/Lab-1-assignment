import java.util.*;

public class IncreasingNum {
	long temp, p;
public static void main(String args[]) {
   @SuppressWarnings("resource")
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the integer:");
   long n = s.nextLong();
   IncreasingNum obj = new IncreasingNum();
   obj.getData(obj.checkNumber(n));
   
}
public boolean checkNumber(long n){
	long q = n%10;
	n /= 10;
	if(n == 0)
		return true;
	while(n != 0){
		temp = n%10;
		if(q < temp)
			return false;
		q = temp;
		n /= 10;
	}
	return true;
}
public void getData(boolean b){
	if(b)
	System.out.println("The number is an increasing number");
	else
	System.out.println("The number is not an increasing number");
}
}