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
