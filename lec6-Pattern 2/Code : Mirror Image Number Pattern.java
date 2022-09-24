import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int spa=1;
            while(spa<=n-i){
                System.out.print(" ");
                spa++;
            }
            int sta=1;
            while(sta<=i){
                System.out.print(sta);
                sta++;
            }
            System.out.println();
            i++;
        }
		
	}

}
