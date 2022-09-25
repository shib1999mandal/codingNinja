import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
int num = s.nextInt();
		int dec_value = 0;
		int base = 1;

		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_value += last_digit * base;
			base = base * 2;
		}

		System.out.println( dec_value);
	}
}
