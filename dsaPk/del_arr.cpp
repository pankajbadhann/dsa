#include <iostream>
using namespace std;

int main()
{
  int n;
  cout << "Enter the lenght of the array: ";
  cin >> n;

  int arr[n];
  cout << endl << "Enter the elements of the array: " << endl;

  for (int i = 0; i < n; i++)
  {
    cout << "Element " << i + 1 << ": ";
    cin >> arr[i];
  }

  int pos;
  cout << "Enter the position of the element to delete: ";
  cin >> pos;

  if (pos < 1 || pos > n)
  {
    cout << "Invalid position!" << endl;
    return 1;
  }

  for (int i = pos - 1; i < n - 1; i++)
  {
    arr[i] = arr[i + 1];
  }

  n--;

  cout << "Array after deletion: ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;

  return 0;
}