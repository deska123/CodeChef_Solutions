/* https://www.codechef.com/problems/ZCOSCH */

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int score;
	cin >> score;
	if(score >= 1 && score <= 50) {
	    cout << "100";
	} else if(score >= 51 && score <= 100) {
	    cout << "50";
	} else {
	    cout << "0";
	}
	
	return 0;
}
