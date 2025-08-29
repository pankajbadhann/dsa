#include <iostream>
using namespace std;

#define MAX 5
class Stack
{
  int n = MAX, top = -1;
  int arr[MAX];

public:
  bool isEmpty() { return top == -1; }
  bool isFull() { return top == n - 1; }
  int size() { return top + 1; }
  void push(int x)
  {
    if (!isFull())
      arr[++top] = x;
    else
      cout << "Stack Full \n";
  }
  void pop()
  {
    if (!isEmpty())
      top--;
    else
      cout << "Stack Empty \n";
  }
  int peek() { return isEmpty() ? -1 : arr[top]; }
};

int main()
{
  Stack s;
  cout << "Stack Size: " << s.size();
  cout << endl;
  s.pop();
  cout << "Stack Size: " << s.size() << endl;
  s.push(30);
  cout << "Stack Size: " << s.size() << endl;
  s.push(60);
  cout << "Stack Top Elem " << s.peek() << endl;
  cout << "Stack Size: " << s.size() << endl;
}