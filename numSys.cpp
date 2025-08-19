#include <iostream>
using namespace std;

int decToBin(int num)
{
  int ans = 0, pow = 1;
  while (num > 0)
  {
    int rem = num % 2;
    num /= 2;

    ans += (rem * pow);
    pow *= 10;
  }
  return ans;
}

int binToDec(int num)
{
  int ans = 0, pow = 1;
  while (num > 0)
  {
    int rem = num % 10;
    ans += rem * pow;
    num /= 10;
    pow *= 2;
  }
  return ans;
}

int main()
{
  int num;
  cout << "enter a number: ";
  cin >> num;

  cout << "binary number of " << num << " is: " << decToBin(num) << endl;
  cout << "decimal number of " << num << " is: " << binToDec(num) << endl;
  cout << (10 << 2);
  cout << (10 >> 1);
}