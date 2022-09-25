import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cho=s.nextInt();
        int i=1,sum=1;
        if(cho==1){
            while(i<=n){
                sum=sum+i;
                i++;
            }
            System.out.println(sum-1);
            
         }else if(cho==2){
            while(i<=n){
                sum=sum*i;
                i++;
            }
         System.out.println(sum);
        }
        else
        System.out.println("-1");
	}
}
