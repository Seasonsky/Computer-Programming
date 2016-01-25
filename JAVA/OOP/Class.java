class Person{
  int age; // class member
  void shout(){
    int age = 60;  // local variable
    System.out.println(age);
  }
}

/**********/

{
   ... ...
   Person p1 = new Person();
   ... ...
}

{
   ... ...
   Person p1 = new Person();
   ... ...
   p1 = null;
   ... ...
}

{
   ... ...
   Person p1 = new Person();
   Person p2 = new Person();
   ... ...
   p1 = null;
   ... ...
}

/**********/

String str1 = new String("abc");
String str2 = new String("abcd");
if(str1==str2) return 1;
if(str1.equals(str2)) return 1;

/**********/

new Person().shout();

getSomeone(new Person());
int getSomeone(Person p){
    ... ...
}

/**********/

// *HANDLE*
  1 class Compare{
  2  public static void main(String[] args){
  3   String str1 = new String("abc");
  4   String str2 = new String("abc");
  5   String str3 = str1;
  6   if(str1 == str2){
  7     System.out.println("str1 == str2");
  8   }
  9   else {
 10     System.out.println("str1 != str2");
 11   }
 12   if(str1 == str3){
 13     System.out.println("str1 == str3");
 14   }
 15   else {
 16     System.out.println("str1 != str3");
 17   }
 18  }
 19 }
$ java Compare
str1 != str2
str1 == str3
--- ---
  1 class Compare{
  2  public static void main(String[] args){
  3   String str1 = new String("abc");
  4   String str2 = new String("abc");
  5   String str3 = str1;
  6   if(str1.equals(str2)){
  7     System.out.println("str1 == str2");
  8   }
  9   else {
 10     System.out.println("str1 != str2");
 11   }
 12   if(str1.equals(str3)){
 13     System.out.println("str1 == str3");
 14   }
 15   else {
 16     System.out.println("str1 != str3");
 17   }
 18  }
 19 }
$ java Compare
str1 equals str2
str1 equals str3

/**********/

Person p1 = new Person();
p1.shout();
--- ---
new Person.shout();
--- ---
public int getID(Person p){
  return p.ID;
}
int id = getID(new Person());

/**********/

  1 class A{
  2   private int x = 3;
  3   public static void main(String[] args){
  4     new A().func(new A());
  5   }
  6   public void func(A a){
  7     System.out.println(a.x);
  8   }
  9 }
$ java A
3

/**********/

  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4     System.out.println(p.str + " " + p.i);
  5   }
  6 }
  7 class Person{
  8   public int i = 3;
  9   public String str = "unknown";
 10 }
$ make run
java Test
unknown 3
--- ---
  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4     System.out.println(p.str + " " + p.i);
  5   }
  6 }
  7 class Person{
  8   public int i = 3;
  9   public String str = "unknown";
 10   public Person(){
 11     i = 33;
 12     str = "Tom";
 13   }
 14 }
$ make run
java Test
Tom 33

/**********/

  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4   }
  5 }
  6 class Person{
  7   public int i;
  8   public String str;
  9   public Person(String s, int x){
 10     i = x;
 11     str = s;
 12   }
 13 }
$ make
javac ./*.java
.\Test.java:3: error: constructor Person in class Person cannot be applied to given types;
    Person p = new Person();
               ^
  required: String,int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
Makefile:2: recipe for target 'target' failed
make: *** [target] Error 1

/**********/

  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4   }
  5 }
  6 class Person{
  7   public int i;
  8   public String str;
  9   private Person(){
 10     i = 3;
 11     str = "Tom";
 12   }
 13 }
$ make
javac ./*.java
.\Test.java:3: error: Person() has private access in Person
    Person p = new Person();
               ^
1 error
Makefile:2: recipe for target 'target' failed
make: *** [target] Error 1

/**********/

  1 class Test{
  2   int id = 33;
  3   public static void main(String[] args){
  4     Test t = new Test();
  5     System.out.println(t.id);
  6   }
  7 }
$ make run
java Test
33
--- ---
  1 class Test{
  2   private int id = 33;
  3   public static void main(String[] args){
  4     Test t = new Test();
  5     System.out.println(t.id);
  6   }
  7 }
$ make run
java Test
33
--- ---
  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4     System.out.println(p.id);
  5   }
  6 }
  7 class Person{
  8   int id = 33;
  9 }
$ make run
java Test
33
--- ---
  1 class Test{
  2   public static void main(String[] args){
  3     Person p = new Person();
  4     System.out.println(p.id);
  5   }
  6 }
  7 class Person{
  8   private int id = 33;
  9 }
$ make
javac ./*.java
.\Test.java:4: error: id has private access in Person
    System.out.println(p.id);
                        ^
1 error
Makefile:2: recipe for target 'target' failed
make: *** [target] Error 1

/**********/
//this
  1 class Container{
  2   Component comp;
  3   public void addComp(){
  4     comp = new Component(this);
  5   }
  6 }
  7
  8 class Component{
  9   Container myCont;
 10   public Component(Container c){
 11     myCont = c;
 12   }
 13 }
--- ---
public Person(String name){
  this.name = name;
}
--- ---
public class Person{
  String name;
  int age;
  public Person(String name){
    this.name = name;
  }
  public Person(String name, int age){
    this(name);
    this.age = age;
  }
}
--- ---
class A{
  String name;
  public A(String x){
    name = x;
  }
  public void func1(){
    System.out.println("func1 of" + name + "is calling");
  }
  public void func2(){
    A a2 = new A("a2");
    this.func1();
    a2.func1();
  }
}
$run
func1 of a1 is calling
func1 of a2 is calling

/**********/
// finalize & System.gc()

  1 class Person{
  2   public void finalize(){
  3     System.out.println("Finalizing the object ...");
  4   }
  5   public static void main(String[] args){
  6     new Person();
  7     new Person();
  8     new Person();
  9     System.out.println("-- End of program --");
 10   }
 11 }
$ java Person
-- End of program --
--- ---
  1 class Person{
  2   public void finalize(){
  3     System.out.println("Finalizing the object ...");
  4   }
  5   public static void main(String[] args){
  6     new Person();
  7     new Person();
  8     new Person();
  9     System.gc();
 10     System.out.println("-- End of program --");
 11   }
 12 }
$ java Person
-- End of program --
Finalizing the object ...
Finalizing the object ...
Finalizing the object ...
--- ---
  1 class Person{
  2   public void finalize(){
  3     System.out.println("Finalizing the object ...");
  4   }
  5 }
  6 class TestPerson{
  7   public static void main(String[] args){
  8     Person p1 = new Person();
  9     Person p2 = new Person();
 10     Person p3 = new Person();
 11     System.gc();
 12     System.out.println("-- End of program --");
 13   }
 14 }
$ java TestPerson
-- End of program --

/**********/

// static: one-time; class: loaded when needed;
  1 class StaticCode{
  2   static{
  3     System.out.println("This is StaticCode ...");
  4   }
  5 }
  6 class TestStaticCode{
  7   static{
  8     System.out.println("Testing ...");
  9   }
 10   public static void main(String[] args){
 11     System.out.println("-- Begin of Program --");
 12     new StaticCode();
 13     new StaticCode();
 14     new StaticCode();
 15     System.out.println("-- End of Program --");
 16   }
 17 }
$ java TestStaticCode
Testing ...
-- Begin of Program --
This is StaticCode ...
-- End of Program --

/**********/

// The constructor!
  1 class Person {
  2   public String name;
  3   public int age;
  4   public Person(String name, int age) {
  5     this.name = name;
  6     this.age = age;
  7   }
  8   public void getInfo() {
  9     System.out.println(name);
 10     System.out.println(age);
 11   }
 12 }
 13 class Student extends Person {
 14   public void study() {
 15     System.out.println("studying");
 16   }
 17   public static void main(String[] args) {
 18     Student s = new Student();
 19     s.name = "Kate";
 20     s.age = 16;
 21     s.getInfo();
 22     s.study();
 23   }
 24 }
 $ make
javac ./*.java
.\Test.java:13: error: constructor Person in class Person cannot be applied to given types;
class Student extends Person {
^
  required: String,int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
Makefile:2: recipe for target 'target' failed
make: *** [target] Error 1 */

--- ---

  1 class Person {
  2   public String name;
  3   public int age;
  4   public Person(String name, int age) {
  5     this.name = name;
  6     this.age = age;
  7   }
  8   public void getInfo() {
  9     System.out.println(name);
 10     System.out.println(age);
 11   }
 12   public Person() {}
 13 }
 14 class Student extends Person {
 15   public void study() {
 16     System.out.println("studying");
 17   }
 18   public static void main(String[] args) {
 19     Student s = new Student();
 20     s.name = "Kate";
 21     s.age = 16;
 22     s.getInfo();
 23     s.study();
 24   }
 25 }
$ java Student
Kate
16
studying

/**********/

/* Inner Class */

  1 class Outer {
  2   class Inner {}
  3 }
$ ls
Makefile  Outer$Inner.class  Outer.class  Test.java

/**********/

  1 class Outer {
  2   class Inner {
  3     static int a = 10;
  4   }
  5 }
$ javac Test.java
Test.java:3: error: Illegal static declaration in inner class Outer.Inner
    static int a = 10;
               ^
  modifier 'static' is only allowed in constant variable declarations
1 error

/**********/

  1 class Outer {
  2   private int i = 10;
  3   public void makeInner() {
  4     Inner in = new Inner();
  5     in.seeOuter();
  6   }
  7   class Inner {
  8     public void seeOuter() {
  9       System.out.print(i);
 10     }
 11   }
 12   public static void main(String[] args) {
 13     Outer out = new Outer();
 14     out.makeInner();
 15   }
 16 }
$ java Outer
10

/**********/

  1 class Outer {
  2   private int i = 10;
  3   class Inner {
  4     public void seeOuter() {
  5       System.out.print(i);
  6     }
  7   }
  8   public static void main(String[] args) {
  9     Outer out = new Outer();
 10     Outer.Inner in = out.new Inner();
 11     //Outer.Inner in = new Outer().new Inner();
 12     in.seeOuter();
 13   }
 14 }
$ java Outer
10

/**********/

  1 class Outer {
  2   class Inner {
  3     public void seeOuter() {
  4       System.out.println(this);
  5       System.out.println(Outer.this);
  6     }
  7   }
  8 }

/**********/

  1 class Outer {
  2   public void doSomething() {
  3     class Inner {
  4       public void seeOuter() {
  5       }
  6     }
  7   }
  8 }

--- ---

  1 class Outer {
  2   public void doSomething() {
  3     final int a = 10;
  4     class Inner {
  5       public void seeOuter() {
  6         System.out.println(a);
  7       }
  8     }
  9       Inner in = new Inner();
 10       in.seeOuter();
 11   }
 12   public static void main(String[] args) {
 13     Outer out = new Outer();
 14     out.doSomething();
 15   }
 16 }

/**********/