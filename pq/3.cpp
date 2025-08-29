#include <iostream>
using namespace std;

int main()
{
  int n, elem;
  cout << "Array Size: ";
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; cin >> arr[i++])
    ;
  cout << "find elem enter: ";
  cin >> elem;
  for (int i = 0; i < n; i++)
    if (arr[i] == elem)
      return cout << "elem is at " << i << " index", 0;
  cout << "does'n exist";
}