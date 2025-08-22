#include <iostream>
using namespace std;

int main()
{
  int n;
  cout << "Enter the length of the array: ";
  cin >> n;

  int arr[100]; // assuming max size is 100
  cout << endl
       << "Enter the elements of the array " << endl;
  for (int i = 0; i < n; i++)
  {
    cout << "Element " << i + 1 << ": ";
    cin >> arr[i];
  }

  int pos, element;
  cout << "Enter the position to insert the element: ";
  cin >> pos;
  cout << "Enter the element to insert: ";
  cin >> element;

  if (pos < 1 || pos > n + 1)
  {
    cout << "Invalid position!" << endl;
    return 1;
  }

  // Shift elements to the right
  for (int i = n; i >= pos; i--)
  {
    arr[i] = arr[i - 1];
  }

  arr[pos - 1] = element;
  n++;

  cout << "Array after insertion: ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;

  return 0;
}
