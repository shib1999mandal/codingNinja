// using c++  ::
#include<bits/stdc++.h>
using namespace std;
bool checkIsAP(int arr[], int n)
{
if (n == 1)
	return true;
sort(arr, arr + n);
int d = arr[1] - arr[0];
for (int i=2; i<n; i++)
	if (arr[i] - arr[i-1] != d)
	return false;

return true;
}

int main()
{
    int n;
    cin>>n;
int arr[n];
for(int i=0;i<n;i++){
    cin>>arr[i];
}

(checkIsAP(arr, n))? (cout << "true" << endl) :
					(cout << "false" << endl);

return 0;
}



// try to write the same code in  Java:


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
