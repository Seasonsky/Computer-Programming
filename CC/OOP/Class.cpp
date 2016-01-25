class person{
	public:
    	int age;
};
int main(){
	person p1;
	cout<<"# "<<sizeof(p1)<<endl;
	return 0;
}
$ ./a.out
# 4

/**********/

class person{
	public:
    	int age;
};
int main(){
	person p1;
	p1.age = 60;
	cout<<"# "<<sizeof(p1)<<endl;
	return 0;
}
$ ./a.out
# 4

/**********/

class person{
	public:
    	int age;
		int shit(int input){
			return input + 1; 
		}
};
int main(){
	person p1;
	p1.age = 60;
	int i = p1.shit(p1.age);
	cout<<"# "<<sizeof(p1)<<endl;
	return 0;
}
$ ./a.out
# 4

/**********/

/* Inner class */

  1 class Outer {
  2   class Inner{};
  3 };
  4
  5 int main(){
  6   return 0;
  7 }
$ ./a.out

/**********/