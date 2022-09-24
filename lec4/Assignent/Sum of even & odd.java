import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i=0,e=0,o=0;
        while(n>0){
            i=(n%10);
            if(i%2==0){
                e=e+i;
            }else if(i%2!=0){
                o=o+i;
            }
            n=n/10;
        }
        System.out.println(e+" "+o);

        

    }
}

