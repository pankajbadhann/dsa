#include <iostream>
using namespace std;

int main()
{
  int n;
  cout << "Enter the length of the array: ";
  cin >> n;

  int arr[n];
  cout << endl << "Enter the elements of the array (in sorted order): " << endl;

  for (int i = 0; i < n; i++)
  {
    cout << "Element " << i + 1 << ": ";
    cin >> arr[i];
  }

  int key;
  cout << "Enter the element to search: ";
  cin >> key;

  int low = 0, high = n - 1, mid;
  bool found = false;
  int position = -1;

  while (low <= high)
  {
    mid = (low + high) / 2;

    if (arr[mid] == key)
    {
      found = true;
      position = mid + 1; // 1-based position
      break;
    }
    else if (arr[mid] < key)
    {
      low = mid + 1;
    }
    else
    {
      high = mid - 1;
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
