import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();        
        double p=Math.pow(a,b);
        int h=(int)(p);
        System.out.println(h);
    }
}
