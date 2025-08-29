//  array insertion

#include <iostream>
using namespace std;

int main()
{
  int arr[100], n, pos, elem;
  cout << "Array Size: ";
  cin >> n;
  if (n > 100 || n < 0)
    return cout << "max Size 100", 0;
  for (int i = 0; i < n; cin >> arr[i++])
    ;
  cout << "enter pos: ";
  cin >> pos;
  cout << "enter elem: ";
  cin >> elem;
  if (pos < 0 || pos > n + 1)
    return cout << "Invalid Position!", 0;
  for (int i = n; i >= pos; i--)
    arr[i] = arr[i - 1];
  arr[pos - 1] = elem;
  n++;
  cout << "new Array \n";
  for (int i = 0; i < n; cout << arr[i++] << " ")
    ;
}