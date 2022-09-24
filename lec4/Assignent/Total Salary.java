public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        int allow;
        Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        Character c=s.next().charAt(0);
        int n=c;
        if(n==65){
            allow=1700;
        }else if(n==66){
            allow=1500;
        }else {
            allow=1300;
        }
        
        double Total_salary=((basic+(0.20*basic)+(0.50*basic)+allow)-(0.11*basic));
        double p=Math.round(Total_salary);
        int h=(int)(p);
        System.out.println(h);


	}
}
