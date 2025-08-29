#include <iostream>
using namespace std;

int main()
{
  int n; // how many number stars
  cout << "enter the lenght of your pattern : ";
  cin >> n;

  // loop
  for (int i = 1; i <= n; i++)
  {
    for (int j = n; j <= i; j--)
    {
      cout << i;
    }
    cout << endl;
  }
}