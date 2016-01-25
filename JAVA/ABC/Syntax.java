class Test{
	public static void main(String[]args){
		System.out.println("hello ...");
	}
}

/**********/

class Test {
    public static void main(String[] args) {
        System.out.println("My
                           First Java.");
    }
}
Arthur@HOME ~/code
$ javac Test.java
Test.java:3: error: unclosed string literal
        System.out.println("My
                           ^
Test.java:3: error: ';' expected
        System.out.println("My
                              ^
Test.java:4: error: unclosed string literal
                           First Java.");
                                      ^
Test.java:4: error: not a statement
                           First Java.");
                                     ^
4 errors

/**********/

class Test {
    public static void main(String[] args) {
        System.out.println("My"+
                           "First Java.");
    }
}
Arthur@HOME ~/code
$ javac Test.java

/**********/

class Test{
	public static void main(String []args){
      System.out.println('a'+1);
	  System.out.println(""+'a'+1);
	}
}
Arthur@HOME ~/java
$ java Test
98
a1

/**********/

class Test {
    public static void main(String[] args) {
       int user_name, _userName, $user_name;
	   int 98user;
    }
}
Arthur@HOME ~/code
$ javac Test.java
Test.java:4: error: not a statement
           int 98user;
           ^
Test.java:4: error: ';' expected
           int 98user;
              ^
Test.java:4: error: not a statement
           int 98user;
                 ^
3 errors

/**********/

class Test {
    public static void main(String[] args) {
       System.out.println(0x8a + 0123 + "ab\'c");
	   System.out.println(0x8a + " " + 0123 + " " + 'a' +" bc");
	   System.out.println(2e3f + "\n" + .4f + " " + 5.022e+3f);
    }
}
Arthur@HOME ~/code
$ java Test
221ab'c
138 83 a bc
2000.0
0.4 5022.0

/**********/

class Test{
	public static void main(String argv[]){
       int i = 5;
	   System.out.println(""+i+5);
	}
}
Arthur@HOME ~/code/java
$ java Test
55

/**********/

class Test{
	public static void main(String argv[]){
       int i = 5;
	   System.out.println(i+5+"");
	}
}
Arthur@HOME ~/code/java
$ java Test
10

/**********/

class Test{
	public static void main(String argv[]){
       System.out.println(""+0123);
	   System.out.println(""+0x123);
	   System.out.println(""+123L);
	   System.out.println(""+12.3e+3);
	   System.out.println(""+123+'\t'+45);
	}
}
Arthur@HOME ~/code/java
$ java Test
83
291
123
12300.0
123     45

/**********/