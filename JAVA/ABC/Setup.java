Arthur@HOME ~/code
$ javac Test.java
 
Arthur@HOME ~/code
$ ls
Second.class  Teest.class  Test.java
 
/**********/
 
Arthur@HOME ~/code
$ ls
Second.class  Teest.class
 
Arthur@HOME ~/code
$ java Teest
this is my first ...
this is my second ...
 
/**********/
 
Arthur@HOME ~/code
$ ls
Second.class  Teest.class  Test.java
 
Arthur@HOME ~/code
$ java Teest
this is my first ...
this is my second ...
 
/**********/
 
Arthur@HOME ~/code
$ ls
Second.class  Teest.class
 
Arthur@HOME ~/code
$ java Second
Error: Main method not found in class Second, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
 
/**********/
 
Arthur@HOME ~/code
$ javac Test.java
Test.java:1: error: class Teest is public, should be declared in a file named Teest.java
public class Teest{
       ^
1 error
 
/**********/