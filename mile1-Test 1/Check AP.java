import java.util.*;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
			
        }

		boolean ap = true;

		int d = ar[1] - ar[0]; 
        for(int i=0; i<n-1; i++){
			if(ar[i+1] - ar[i] != d){
				ap = false;

				break;

			}

		}
			if(ap)
				System.out.println(true);
				else
					System.out.println(false);

		}
}
