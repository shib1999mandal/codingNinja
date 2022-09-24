import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int s,e,w;
        int i;
        Scanner g=new Scanner(System.in);
        s=g.nextInt();
        e=g.nextInt();
        w=g.nextInt();
        while(s<=e){
             
            // s=s+w;
            // System.out.println(w+" "+i);
            i=(s-32)*5/9;
            System.out.println(s+" "+i);
            s=s+w;
        }
        

		
	}

}
