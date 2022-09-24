import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         int n,i=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(i<=n){
            int p='A'+i-1;
            int j=1;
            while(j<=i){
                System.out.print((char)(p));
                j++;
                p++;
            }
            System.out.println();
            i++;
            
        }
        

		
	}

}
