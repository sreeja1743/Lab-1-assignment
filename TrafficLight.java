import java.util.*;

public class TrafficLight {
	int n;
    public static void main(String args[]) {
    	TrafficLight obj = new TrafficLight();
    	while(true){
    		System.out.println("Choose a number");
    		System.out.println("1)Red");
    		System.out.println("2)Yellow");
    		System.out.println("3)Green");
    		@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
    	     obj.n = s.nextInt();
    	switch(obj.n) {
    	case 1: System.out.println("Stop!");
    	        break;
    	case 2 : System.out.println("Ready");
    	        break;
    	case 3: System.out.println("Go");
    	        break;
    	}
    	
    }
    }
}