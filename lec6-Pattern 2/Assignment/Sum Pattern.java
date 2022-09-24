import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,num,sum=1;
        for(i=0; i<n; i++) // outer loop for rows
        {
            num=1;
            for(j=0; j<i; j++) // inner loop for rows
            {
                System.out.print(num);
                num++;
                System.out.print("+");
            }
            System.out.print(i+1);
            System.out.print("=");
            System.out.print(sum);
            sum=sum+i+1;
            System.out.println();
            sum++;
        }
	}
}
