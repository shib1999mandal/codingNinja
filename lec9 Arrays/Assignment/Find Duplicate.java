
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n=arr.length,num=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-1;j++){
                if(arr[i]==arr[j]){
                    num=arr[j];
                }
            }
        }
        
        return num;
    }
}
