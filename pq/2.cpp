#include <iostream>
using namespace std;

int main()
{
  int n, pos;
  cout << "array Size: ";
  cin >> n;
  int arr[n];
  cout << "enter elems of array \n";
  for (int i = 0; i < n; cin >> arr[i++])
    ;
  cout << "enter pos which elem you want to delete: ";
  cin >> pos;
  if (pos < 1 || pos > n)
    return cout << "Invalid Position", 0;
  for (int i = pos - 1; i < n - 1; i++)
    arr[i] = arr[i + 1];
  ;
  n--;
  cout << "Final Array: ";
  for (int i = 0; i < n; cout << arr[i++] << " ")
    ;
}