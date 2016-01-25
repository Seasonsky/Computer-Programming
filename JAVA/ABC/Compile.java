Sky@Sky-PC /cygdrive/c/Cache/iPRO/jar
$ ls
just  just.jar  Just.java  Test.java  tin  tin.jar  Tin.java

Sky@Sky-PC /cygdrive/c/Cache/iPRO/jar
$ javac -cp "just.jar;tin.jar" Test.java

Sky@Sky-PC /cygdrive/c/Cache/iPRO/jar
$ ls
just  just.jar  Just.java  Test.class  Test.java  tin  tin.jar  Tin.java

Sky@Sky-PC /cygdrive/c/Cache/iPRO/jar
$ java Test
This is Just class
This is Tin class
*** Testing ***

Sky@Sky-PC /cygdrive/c/Cache/iPRO/jar
$ vim Test.java
  1 import just.*;
  2 import tin.*;
  3 class Test {
  4   public static void main(String[] args) {
  5     Just jst = new Just();
  6     jst.shout();
  7     Tin tin = new Tin();
  8     tin.shout();
  9     System.out.println("*** Testing ***");
 10   }
 11 }

/**********/