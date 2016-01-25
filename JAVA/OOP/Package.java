Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls
Test.class  TestPackage.class  TestPackage.java

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ javac TestPackage.java

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ java TestPackage
Error: Could not find or load main class TestPackage

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ java org.it315.TestPackage
Exception in thread "main" java.lang.NoClassDefFoundError: org/it315/Test
        at org.it315.TestPackage.main(TestPackage.java:4)
Caused by: java.lang.ClassNotFoundException: org.it315.Test
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 1 more
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls ./org/it315/
TestPackage.class

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ java org.it315.TestPackage
Testing the package...

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls ./org/it315/
Test.class  TestPackage.class

/**********/

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ javac -d . TestPackage.java
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls
org  TestPackage.java
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ java org.it315.TestPackage
Testing the package...
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls org/it315/
Test.class  TestPackage.class

/**********/

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls org/it315/
Test.class  TestPackage.class
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ java org/it315/TestPackage.class
Error: Could not find or load main class org.it315.TestPackage.class

/**********/

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ ls
sub-dir  TestPackage.java
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ ls sub-dir
TestPackage.class
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ java ./sub-dir/TestPackage
Error: Could not find or load main class ..sub-dir.TestPackage
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ java sub-dir.TestPackage
Error: Could not find or load main class sub-dir.TestPackage

/**********/

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ ls
sub-dir  TestPackage.class  TestPackage.java
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1
$ cd sub-dir/
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java1/sub-dir
$ java TestPackage
Error: Could not find or load main class TestPackage
// searching "classpath" directory for loading the class.

/**********/

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls
Test.java  TestPackage.java
Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ javac -d . Test*.java
TestPackage.java:4: error: cannot find symbol
    new Test().print();
        ^
  symbol:   class Test
  location: class TestPackage
1 error
// TestPackage.java: package org.it315; 
// Test.java: package org.it315.example;

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls
Test.java  TestPackage.java

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ javac -d . Test*.java

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls
org  Test.java  TestPackage.java

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls org/it315/
example  TestPackage.class

Arthur@HOME /cygdrive/d/iCACHE/iPRO/java
$ ls org/it315/example/
Test.class
// Test.java: import org.it315.example.*;
// //import org.it315.example.Test;

/**********/

import java.util.*;
import java.sql.*;
new java.sql.Date();
new java.util.Date();

/**********/

import java.awt.*;
import java.awt.event.*;

/**********/