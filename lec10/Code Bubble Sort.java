
public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int round=0;round<arr.length-1;round++)
    {   
        for(int j=0;j<arr.length-1-round;j++)
        if(arr[j]>arr[j+1])
        {   int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           
        }
    }
    }  

}
