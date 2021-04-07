import java.util.*;

public class PrimeNumbers {
	int size = 0;
    public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	System.out.println("Enter the value: ");
    	int n = s.nextInt();
    	PrimeNumbers obj = new PrimeNumbers();
    	obj.getData(obj.primeNumbers(n));
    }
      public int[] primeNumbers(int n) {
    	  int temp[] = new int [3000];
    	  for(int i = 2; i < n; i++) {
    	    if(isPrime(i))
    	    	temp[size++] = i;
    	  }
    	  return temp;
      }
      public boolean isPrime(int n) {
    	  for(int i = 2; i <= n/2; i++) {
    		  if(n%i == 0)
    			  return false;
    	  }
    	  return true;
      }
      public void getData(int arr[]) {
    	  for(int i = 0; i < size; i++)
    		  System.out.print(" "+arr[i]);
      }
}
