import java.util.*;

public class PowerOfTwo {
     public static void main(String args[]) {
    	 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	 System.out.println("Enter the num:");
    	 int n = s.nextInt();
    	 PowerOfTwo obj = new PowerOfTwo();
    	 obj.getData(obj.checkNumber(n));
     }
     public boolean checkNumber(int n) {
    	 if((n & (n-1)) == 0)
    		 return true;
    	 return false;
     }
     public void getData(boolean b) {
    	 if(b)
    		System.out.println("Number is a power of 2");
    	 else
    		 System.out.println("Number is not a power of 2");
     }
}
