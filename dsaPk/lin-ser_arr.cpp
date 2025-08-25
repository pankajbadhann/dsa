#include <iostream>
using namespace std;

int main()
{
  int n;
  cout << "Enter the length of the array: ";
  cin >> n;

  int arr[n];
  cout << endl << "Enter the elements of the array: " << endl;

  for (int i = 0; i < n; i++)
  {
    cout << "Element " << i + 1 << ": ";
    cin >> arr[i];
  }

  int key;
  cout << "Enter the element to search: ";
  cin >> key;

  bool found = false;
  int position = -1;

  for (int i = 0; i < n; i++)
  {
    if (arr[i] == key)
    {
      found = true;
      position = i + 1; // 1-based index
      break;
    }
  }

  if (found)
  {
    cout << "Element found at position " << position << "." << endl;
  }
  else
  {
    cout << "Element not found in the array." << endl;
  }

  return 0;
}
