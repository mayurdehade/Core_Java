**1. What are the advantages of java package?**

1. Java package is used to categorize the classes and interfaces so that they can be easily maintained.
2. Java package provides access protection.
3. Java package removes naming collision.

**2. Define package in Java?**  
A package in java is a mechanism to contain classes, sub packages or interfaces. It makes things easier for other programmers as they can easily locate related classes.

**3. Why are packages used?**  
Packages in Java are used to group related classes, interfaces, and sub-packages. We use Java packages to avoid naming conflicts since there can be two classes with the same name in two different packages.

**4. Which package is always imported by default?**  
In Java, two packages java.lang package and a no-name package (also called default package) are imported by default in all the classes of Java. Default Package doesn't have a name but it is present by default and thus, it is named the default package.

**5. Can I import the same package/class twice? Will the JVM loads package twice at runtime?**  
Yes, we can import the same package/class twice, there is no issue. The Java compiler processes the imports and ensures that each class is loaded only once at runtime.

**6. Explain the uses of Java packages?**  
Packages in Java are used to group related classes, interfaces, and sub-packages. We use Java packages to avoid naming conflicts since there can be two classes with the same name in two different packages.

**7. What is the base class of all classes?**  
Object class is inherited by all the classes in Java. It is the parent class of every class in Java either directly or indirectly.

**8. Do you know any inbuilt packages in java? Please name those.**  
Yes, Java comes with a rich set of built-in packages like java.lang, java.io, java.util, java.net, java.sql.

**9. What do you think is the logic behind having a single base class for all classes?**  
Having a single base class, Object, for all classes in Java ensures that every class inherits a basic set of useful methods, like toString(), equals(), and hashCode(). It also supports polymorphism, enabling different classes to be treated generically as Object, which makes the language more flexible and easier to use.

**10. How to use packages in Java?**  
for using packages in java you can use import statement or fully qualified class name by using these you can create object of class present in package and access it.

**11. What are the best practices while using packages in java?**  
Name packages using your organization's reverse domain name (e.g., com.example.project) to avoid conflicts, keep related classes together to maintain code organization, and ensure directory structures match package names. Use clear, descriptive names for packages to reflect their purpose. Import only necessary classes rather than using wildcard imports (e.g., import com.example.project.MyClass instead of import com.example.project.) to keep dependencies clear. Lastly, use appropriate access modifiers to encapsulate classes and interfaces, ensuring that only necessary parts are exposed.

**12. What is a predefined packages in Java?**  
A predefined package (also called a built-in package) is a group of related classes and interfaces that are included with the Java Development Kit (JDK). Some predefined packages are java.lang, java.io, java.util, java.net, java.sql

**13. Name any two classes from built in package.**  
from java.lang package: System, String, StringBuffer, StringBuilder  
from java.util package: Arrays, LinkedList, Date

**14. What is the use of import statement?**  
import statement is used to bring in classes, interfaces, or entire packages from other packages into the current file's scope. This allows you to use the imported types directly, without needing to write their fully qualified names every time.

**15. If we need to use a method from a class which is in the different package then we need to write import packagenm.classname?**  
Yes, To use a method from a class in a different package in Java, you need to import the class using the import statement. If we do not want to use import statement, then we can use fully qualified class name also while creating an object. "**com.md.hi.A aa = new com.md.hi.A();**"
