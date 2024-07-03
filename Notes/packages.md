### Packages in Java

A package in java is a mechanism to contain classes, sub packages or interfaces. It makes things easier for other programmers as they can easily locate related classes.

```
//save as Simple.java  
package mypack;  
public class Simple{  
 public static void main(String args[]){  
    System.out.println("Welcome to package");  
   }  
}  
```  

They are use to prevent naming conflicts and for controlling access in addition to make searches and utilization of classes, enumerations, interfaces and annotations easier.

Two types of packages: 1. built-in packages 2. user-defined packages.
There are many built-in packages such as java, lang, javax, net, io, util, sql etc.

**Subpackage in Java:**  
Package inside the package is called the subpackage. It should be created to categorize the package further.

```
package com.javatpoint.core;  
class Simple{  
  public static void main(String args[]){  
   System.out.println("Hello subpackage");  
  }  
}  
```

#### Remember:

1. Package statement can be written at the start of the file only once.
2. Start with root folder and ends with sub-directory name only, not the file name.
3. Package statement can be written only once at top of java file.
4. Two packages can have file with same name.

#### Remember these points while using import statement in compiler perspective:

1. import can be written multiple times after the package statement and before the class statement.
2. It must be start with the root folder name and end with file name and semicolon (;).
3. import does not mean that the memory is allocated, it just gives a path to reach.
4. If we do not want to use import statement, then we can use fully qualifed class name also while creating an object. "**com.md.hi.A aa = new com.md.hi.A();**"


#### Advantages:
1. Java package is used to categorize the classes and interfaces so that they can be easily maintained.  
2. Java package provides access protection.  
3. Java package removes naming collision.  