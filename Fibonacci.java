import java.util.*;

public class Fibonacci {
   public static void main(String args[]) {
	   @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	   //System.out.println("Enter the number of nth digith:");
	   Fibonacci obj = new Fibonacci();
	   while(true) {
		   System.out.println("Enter the number of nth digith:");
		   int n = s.nextInt();
		   System.out.println("Choose:");
		   System.out.println("1)Recursion");
		   System.out.println("2)Non-Recursion");
		   int p = s.nextInt();
		   switch(p) {
		   case 1: 
		           System.out.println(obj.recursion(n));
		          break;
		   case 2: obj.nonRecursion(n);
		           break;
		   }
	   }
   }
   
   public int recursion(int n) {
	   if(n <= 1) 
		return n;
		return recursion(n-1)+recursion(n-2);
   }
   public void nonRecursion(int n) {
	  int f[] = new int[n];
	  f[0] = 1;
	  f[1] = 1;
	   for(int i = 2; i <n; i++) 
		  f[i] = f[i-1]+f[i-2];
	   System.out.println("Nth value is"+f[n-1]);
	   
   }
}