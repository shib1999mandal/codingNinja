import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();       
        
    int i = 1, result = 1;

    while (result <= x) {
        i++;
        result = i * i;
    }
    System.out.println(i - 1);

	}
}
