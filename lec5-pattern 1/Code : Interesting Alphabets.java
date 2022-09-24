import java.util.*;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        int n,i=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        i=n;
        while(i>=1){
            //int p='A'+n+1;
            int j=i;
            while(j<=n){
                System.out.print((char)(j+64));
                j++;
                //p--;
            }
            System.out.println();
            i--;
            
        }
	}
}
