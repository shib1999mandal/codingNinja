import java.util.*; 
public class Solution {
 public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
 
        return fib(n - 1) + fib(n - 2);
    }
 
    
	
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
		int n = s.nextInt(); 
        System.out.println(fib(n));

		
	}
    
}
