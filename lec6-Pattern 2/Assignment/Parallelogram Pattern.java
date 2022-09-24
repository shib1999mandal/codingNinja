import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) 
			    	System.out.print(" ");
			for (int j = 1; j <= n; j++) 
				System.out.print("*");
				System.out.println();
		}
	}
}
