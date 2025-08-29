#include <iostream>
using namespace std;

int main()
{
  int arr[100], n, pos, elem;
  cout << "Size: ";
  cin >> n;
  for (int i = 0; i < n; cin >> arr[i++])
    ;
  cout << "Pos & Elem: ";
  cin >> pos >> elem;
  if (pos < 1 || pos > n + 1 || n >= 100)
    return cout << "Invalid!\n", 0;
  for (int i = n; i >= pos; i--)
    arr[i] = arr[i - 1];
  arr[pos - 1] = elem;
  n++;
  for (int i = 0; i < n; cout << arr[i++] << " ")
    ;
}