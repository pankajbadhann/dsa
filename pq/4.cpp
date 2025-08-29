#include <iostream>
using namespace std;

int main()
{
  int n, elem;
  cout << "Array Size: ";
  cin >> n;
  int arr[n];
  cout << "Enter elems in Sorted Order \n";
  for (int i = 0; i < n; cin >> arr[i++])
    ;
  cout << "enter wanted value: ";
  cin >> elem;
  int s = 0, e = n - 1, mid, pos = -1;
  while (s <= e)
  {
    mid = (s + e) / 2;
    if (arr[mid] == elem)
      return cout << "elem find at " << mid << " index", 0;
    else if (arr[mid] < elem)
      s = mid + 1;
    else
      e = mid - 1;
  }
  cout << "elem not found in Array";
  return 0;
}