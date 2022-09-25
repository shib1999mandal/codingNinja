
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        boolean flag = false;
      int i;
      for(i = 0;i < arr.length;i++){
        if(x == arr[i])
        {
          flag = true;
          break;
        }
      }
      
      if(flag == false)
        return -1;
      else 
        return i;	
	
        
    }
}
