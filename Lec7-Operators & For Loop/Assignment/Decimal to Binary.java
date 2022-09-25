import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] binaryNum = new int[32];
        int i = 0;
        if(n==0){
                System.out.print("0");
            }else
        while (n > 0) {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    
	

	}
}
