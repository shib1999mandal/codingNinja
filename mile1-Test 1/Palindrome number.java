import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int org=s.nextInt();
        int revnum=0;
        int tempOrg=org;
        while(tempOrg>0){
            int lastDig=tempOrg%10;
            revnum=revnum*10+lastDig;
            tempOrg=tempOrg/10;
        }
        if(org==revnum){
            System.out.println("true");
        }else
            System.out.println("false");
            

	}
}
