#include <bits/stdc++.h>
using namespace std;

int maxnumber(int n, int k)
{

	for (int j = 0; j < k; j++) {

		int ans = 0;
		int i = 1;


		while (n / i > 0) {


			int temp = (n / (i * 10))
						* i
					+ (n % i);
			i *= 10;

			ans = max(ans, temp);
		}

		n = ans;
	}

	return n;
}
int main()
{
	int n;
    cin>>n;
	int k = 1;

	cout << maxnumber(n, k) << endl;
	return 0;
}
