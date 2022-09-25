import java.util.*;
public class Solution {
 static boolean isPrime(int n){
     
          if(n==1||n==0)return false;
          for(int i=2; i<n; i++){
        
                if(n%i==0)return false;
          }
     
          return true;
      }
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
  int N = s.nextInt(); 
        for(int i=1; i<=N; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
		
	}
}
