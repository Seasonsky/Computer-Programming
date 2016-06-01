/***** Macro *****/

#define PI 3.14

#ifndef H_coding
#define H_coding
... ...
#endif

/***** Include *****/

#include <iostream>
#include <cstring>
#include <cassert>

/***** Namespace *****/

using namespace std;

/***** ?: *****/

max = (a >= b)? a : b;

/***** Arrays *****/

const int ARRAY_SIZE;
int list[ARRAY_SIZE];

int list[10] = { 0 };
int list[10] = { 8, 5, 2 };
int list[] = { 5, 6, 3 };

void arrayAsParam(int listOne[], const double listTwo[]) {

}

/***** Strings *****/

char ch[16] = { 'i', 'm' };
char ch[16] = { 'i', 'm', '\0' };
char ch[] = { 'i', 'm' };
strlen(ch)==16;

char yourName[16], myName[16];
strcpy(yourName, "Jhone");
strcpy(myName, yourName);

char str[31];
cin.get(str,31);
input: Hello there.My name is Mickey Blair.
str== Hello there.My name is Mickey

/***** New & Delete *****/

int * it = new int;
float* pi = new float(3.14);
char* ch = new char[10];
int* it = new int[5][4];

delete it;
delete[] ch;

Student* stu = new Student;
delete stu;

/***** Template *****/

template<class DataType>
DataType larger(DataType a, DataType b) {
  return ((a > b) ? a : b);
}

template<class DataType>
class circle {
 private:
  DataType x;
  DataType y;
};

/***** Overloading *****/

template<class DataType>
class rectangle {
 public:
  rectangle<DataType> operator+(const rectangle<DataType>&) const;
  rectangle<DataType> operator-(const rectangle<DataType>&) const;
  rectangle<DataType> operator*(const rectangle<DataType>&) const;
  rectangle<DataType> operator/(const rectangle<DateType>&) const;

  bool operator==(const retangle<DataType>&) const;
  bool operator!=(const retangle<DataType>&) const;

  const rectangle<DataType>& operator=(const rectangle<DataType>&);

  friend ostream& operator<<(ostream&, const rectangle<DataType>&);
  friend istream& operator>>(istream&, rectangle<DataType>&);

 private:
  DataType length;
  DataType width;
  DataType* list;


};

rectangle<DataType> rectangle<DataType>::operator +(const rectangle<DataType>& rect) const {
  rectangle<DataType> tempRect;
  tempRect.length = length + rect.length;
  tempRect.width = width + rect.width;
  return tempRect;
}

bool rectangle<DataType>::operator ==(const rectangle<DataType>& rect) const {
  return (length == rect.length && width == rect.width);
}

const rectangle<DataType>& rectangle<DataType>::operator = (const rectangle<DataType>& another) {
  if (this != &another) {
    delete[] list;
    length = another.length;
    width = another.width;
    list = new DataType[maxSize];
    for (int i = 0; i < length; i++) {
      list[i] = another.list[i];
    }
  }
  return *this;
}

ostream& operator<<(ostream& osObject, const rectangle<DataType>& rect) {
  osObject << "length=" << rect.length;
  osObject << "width=" << rect.width;
  return osObject;
}

istream& operator>>(istream& isObject, rectangle<DataType>& rect) {
  isObject >> rect.length >> rect.width;
  return isObject;
}


/**********/

int i = 12345;
char c = (int)i;
cout<<endl<<(int)c<<endl;
--> 57; //Little endian

/**********/

int y;
int main() {

  cout << endl << y << endl;
  return 0;
}
Arthur@HOME ~/code/ccpp
$./a.out

0 //y has been initialized.

/**********/

float add(float x, float y){
  return x+y;
}
double add(double x, double y) {
  return x + y + 1;
}
int main() {

  double sum;
  sum = add(3.0, 5);
  cout << endl << sum << endl;

  return 0;
}
Arthur@HOME ~/code/ccpp
$./a.out

9

/**********/

char  x = 1;
switch (x);

/**********/

1 #include<iostream>
2 using namespace std;
3 int main(int argc, char* argv[]) {
  4   const int SIZE = 10;
  5   int a[SIZE * 2];
  6   a[19] = 19;
  7   cout << endl << a[19] << endl;
  8   return 0;
  9 }
$./a.out
19

/**********/

1 #include<iostream>
2 using namespace std;
3 void change(int size, int needed);
4 int main(int argc, char* argv[]) {
  5   const int SIZE = 10;
  6   change(5, 10);
  7   return 0;
  8 }
9 void change(const int size, const int needed) {
  10   int newArr[size + needed];
  11   newArr[size + needed - 1] = 99;
  12   cout << endl << newArr[size + needed - 1] << endl;
  13 }
$./a.out
99

/**********/

#include <stdio.h>
int main(){
  int a;
  printf("Input integer number:");
  scanf("%d",&a);
  switch(a){
    case 1:
      printf("Monday\n");
    case 2:
      printf("Tuesday\n");
    case 3:
      printf("Wednesday\n");
    case 4:
      printf("Thursday\n");
    case 5:
      printf("Friday\n");
    case 6:
      printf("Saturday\n");
    case 7:
      printf("Sunday\n");
    default:
      printf("error\n");
  }
  return 0;
}
- - - - -
Input integer number:4
Thursday
Friday
Saturday
Sunday
error
- - - - -

#include <stdio.h>
int main(void){
  int a;
  printf("input integer number:    ");
  scanf("%d",&a);
  switch (a){
    case 1:
      printf("Monday\n");
      break;
    case 2:
      printf("Tuesday\n");
      break;
    case 3:
      printf("Wednesday\n");
      break;
    case 4:
      printf("Thursday\n");
      break;
    case 5:
      printf("Friday\n");
      break;
    case 6:
      printf("Saturday\n");
      break;
    case 7:
      printf("Sunday\n");
      break;
    default:
      printf("error\n");
  }
  return 0;
}
- - - - -
Input integer number:4
Thursday
- - - - -

switch (c) {
  default:
    d = 0.15;
    f += p * w * (s - 3000) * (1 - d);
    s = 3000;
  case 8:
  case 9:
  case 10:
  case 11:
    d = 0.1;
    f += p * w * (s - 2000) * (1 - d);
    s = 2000;
  case 4:
  case 5:
  case 6:
  case 7:
    d = 0.08;
    f += p * w * (s - 1000) * (1 - d);
    s = 1000;
  case 2:
  case 3:
    d = 0.05;
    f += p * w * (s - 500) * (1 - d);
    s = 500;
  case 1:
    d = 0.02;
    f += p * w * (s - 250) * (1 - d);
    s = 250;
  case 0:
    d = 0;
    f += p * w * s * (1 - d);
}

char score;
cin >> score;
switch (score) {
  case 'A':
  case 'a':
    cout << "excellent";
    break;
  case 'B':
  case 'b':
    cout << "good";
    break;
  default:
    cout << "fair";
}

sky@ubuntu:~/rmst$ make
g++ -std=c++11 -o rmst.o -I.  -c    rmst.cpp
rmst.cpp: In function ‘std::ostream& operator<<(std::ostream&, const Edge&)’:
rmst.cpp:43:10: error: the value of ‘i’ is not usable in a constant expression
     case i: str = "LEFT"; break;
          ^
rmst.cpp:41:7: note: ‘int i’ is not const
   int i = 5;
       ^
rmst.cpp:43:10: error: the value of ‘i’ is not usable in a constant expression
     case i: str = "LEFT"; break;
          ^
rmst.cpp:41:7: note: ‘int i’ is not const
   int i = 5;
       ^
Makefile:22: recipe for target 'rmst.o' failed
make: *** [rmst.o] Error 1

/**********/
