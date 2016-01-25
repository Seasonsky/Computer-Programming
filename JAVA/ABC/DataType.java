class Test{
	public static void main(String []args){
		float = 3.5f;
		byte b = 129;
		float f = 3.5;
	}
}
Arthur@HOME ~/code
$ javac Test.java
Test.java:4: error: incompatible types: possible lossy conversion from int to byte
                byte b = 129;
                         ^
Test.java:5: error: incompatible types: possible lossy conversion from double to float
                float f = 3.5;
                          ^
2 errors

/**********/

class Test{
	public static void main(String []args){
        int a = 24;
		byte b = 0;
		b = a;
	}
}
Arthur@HOME ~/java
$ javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to byte
                b = a;
                    ^
1 error

/**********/

class Test{
	public static void main(String []args){
        int i = 266;
		byte b = (byte)i;
		System.out.println("b= "+b);
	}
}
Arthur@HOME ~/java
$ java Test
b= 10
>> dec2bin(266)
ans =
100001010
>> dec2bin(266,32)
ans =
00000000-00000000-00000001-00001010

/**********/

class Test{
	public static void main(String argv[]){
       char c = 12345;
	   System.out.println(""+c);
	   System.out.println((int)c);
	}
}
Arthur@HOME ~/code/java
$ java Test
?
12345

/**********/

class Test{
	public static void main(String argv[]){
       int i = 12345;
       byte b = (byte) i;
	   System.out.println((int)b);
	}
}
Arthur@HOME ~/code/java
$ java Test
57 //Little endian

/**********/

class Test{
	public static void main(String argv[]){
       byte b = 5;
	   System.out.println(b);
	}
}
Arthur@HOME ~/code/java
$ java Test
5

/**********/

class Test{
	public static void main(String argv[]){
       byte b = 5;
	   b = b - 2;
	}
}
Arthur@HOME ~/code/java
$ javac Test.java
Test.java:4: error: incompatible types: possible lossy conversion from int to byte
           b = b - 2;
                 ^
1 error

/**********/

class Test{
	public static void main(String argv[]){
       double sum;
       sum = add(3,5);
	   System.out.println(sum);
	   sum = add(3.0,5);
	   System.out.println(sum);
	}
	public static float add(float x, float y){
		return x+y;
	}
	public static double add(double x, double y){
		return x+y+1;
	}
}
Arthur@HOME ~/code/java
$ java Test
8.0
9.0

/**********/

class Test{
	public static void main(String argv[]){
      char x;
	}
}
$ javac Test.java
class Test{
	public static void main(String argv[]){
      char x;
	  int i = x;
	}
}
$ javac Test.java
Test.java:4: error: variable x might not have been initialized
          int i = x;
                  ^
1 error

/**********/

class Test{
	public static void main(String argv[]){
       int a[];
	}
}
$ javac Test.java
class Test{
	public static void main(String argv[]){
       int a[5];
	}
}
$ javac Test.java
Test.java:3: error: ']' expected
       int a[5];
             ^
Test.java:3: error: illegal start of expression
       int a[5];
              ^
2 errors

/**********/

class Test{
	public static void main(String argv[]){
       int a[][] = new int[][3];
	}
}
$ javac Test.java
Test.java:3: error: ']' expected
       int a[][] = new int[][3];
                             ^
Test.java:3: error: ';' expected
       int a[][] = new int[][3];
                              ^
2 errors

/**********/