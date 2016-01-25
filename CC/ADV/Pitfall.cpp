double temp=10/6;
printf("%20.3f\n",temp);
cout<<setprecision(3)<<temp<<endl;
--
./a.out 
               1.000
1

/**********/

double temp=10.0/6;
printf("%20.3f\n",temp);
cout<<setprecision(3)<<temp<<endl;
--
./a.out 
               1.000
1
--
./a.out 
               1.667
1.67

/**********/

#define MUL(x) x*3
int i = 5;
cout<<endl<<MUL(5+5)<<endl;
--> 20	

/**********/

int i = 15;
cout<<endl<<(double)(i/100)<<endl;
--> 0 

/**********/

int x;
int y;
if(x=0 && y=3) ;
$ make
g++ -o Test.o -I.  -c    Test.cpp
Test.cpp: In function ‘int main()’:
Test.cpp:6:15: error: lvalue required as left operand of assignment
    if(x=0 && y=3) ;
               ^
Makefile:22: recipe for target 'Test.o' failed
make: *** [Test.o] Error 1

/**********/

double x = 1;
switch (x) {
... ...
}
$ make
g++ -o Test.o -I.  -c    Test.cpp
Test.cpp: In function ‘int main()’:
Test.cpp:5:10: error: switch quantity not an integer
 switch (x) {
          ^
Makefile:22: recipe for target 'Test.o' failed
make: *** [Test.o] Error 1

/**********/

double x = 1;
switch (x) {}
$ make
g++ -o Test.o -I.  -c    Test.cpp
Test.cpp: In function ‘int main()’:
Test.cpp:5:10: error: switch quantity not an integer
 switch (x) {
          ^
Makefile:22: recipe for target 'Test.o' failed
make: *** [Test.o] Error 1

/**********/

int i=10;
for(int i=0;i<50000000;i++){
  j = i+1;
}
---
for(int i=0;i<50000000;i++){
  int j = i+1;
}

---
{
  int i=10;
  for(int i=0;i<50000000;i++){
    j = i+1;
  }
}

/**********/
// re-size the meomory

  1 #include<iostream>
  2 using namespace std;
  3 int* change(int size, int needed);
  4 int main(int argc, char* argv[]){
  5   int size = 5;
  6   int needed = 10;
  7   int* p = change(size,needed);
  8   cout<< endl <<"after changed: "<<p[size+needed]<<endl;
  9   return 0;
 10 }
 11 int* change(const int size, const int needed) {
 12   int * newArr= new int (size+needed);
 13   newArr[size+needed-1] = 99;
 14   cout <<endl<<newArr[size+needed-1]<<endl;
 15   return newArr;
 16 }
$ ./a.out
99
after changed: 0
--- ---
  1 #include<iostream>
  2 using namespace std;
  3 int* change(int size, int needed);
  4 int main(int argc, char* argv[]){
  5   int size = 5;
  6   int needed = 10;
  7   int* p = change(size,needed);
  8   cout<< endl <<"after changed: "<<p[size+needed-1]<<endl;
  9   return 0;
 10 }
 11 int* change(const int size, const int needed) {
 12   int * newArr= new int [size+needed];
 13   newArr[size+needed-1] = 99;
 14   cout <<endl<<newArr[size+needed-1]<<endl;
 15   return newArr;
 16 }
 $ ./a.out
99
after changed: 99
--- ---
  1 #include<iostream>
  2 using namespace std;
  3 int* change(int size, int needed);
  4 int main(int argc, char* argv[]){
  5   int size = 5;
  6   int needed = 10;
  7   int* p = change(size,needed);
  8   cout<< endl <<"after 1st changed: "<<p[13]<<endl;
  9   needed = 15;
 10   int* t = change(size,needed);
 11   cout<<endl<<"after 2nd changed: "<<t[18]<<endl;
 12   cout<<endl<<"second reference ..."<<endl;
 13   cout<< endl<<"after 1st changed: "<<p[14]<<endl;
 14   cout<<endl<<"after 2nd changed: "<<t[19]<<endl;
 15   return 0;
 16 }
 17 int* change(const int size, const int needed) {
 18   int * newArr= new int [size+needed];
 19   newArr[size+needed-2] = 88;
 20   newArr[size+needed-1] = 99;
 21   return newArr;
 22 }
$ ./a.out
after 1st changed: 88
after 2nd changed: 88
second reference ...
after 1st changed: 99
after 2nd changed: 99

/**********/