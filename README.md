# java8-new-features

## Lambda expressions

 - Anonymous Functions
 - Write more *functional and optimized* codes
 - Simplest way to *implement interfaces* that has only one abstract method (Functional Interface or SAM - Single Abstract Method Interface _Java8+_)
 - Browse, filter and extract data from collections in a simpler and more direct way.
 - Operator lambda ```->```

## Basic sintax

 - No arguments: ```( ) -> System.out.println("Hello World");```
 - With argument:  ```( s ) -> System.out.println(s);```
 - Two arguments:  ```( x, y ) -> x + y;```
 - Two Explicit arguments: ```(Integer x, Integer y -> x + y)```

## Method references

In some cases it can be used as a replacement for Lambda expressions
Operator Method References ```'Class/Obj'::'Referenced Method'```

 - It can reference an instance method of a particular object
 - A static method
 - An instance method of an arbitrary object from a specific type

## Stream

 - java.util.stream - Contains classes, interfaces e enum;
 - These are NOT data structures; DO NOT store data;
 - Manipulate data structure, collections, arrays, I/O flows through a pipeline in a simpler and more efficient way.

## Base64

 - Encode and decode according to Base64 scheme;
 - Encode binary data into characters (RFC 4648 and RFC 2045);
	  - Alphabet (A-Za-z0-9+/)
	  - URL
	  - MIMETYPE
	
## Optional

 - Class belonging to the java.util package, used as an object container that may or may not have a null value;
 - Handle NullpointerException Exception

## JavaScript Nashorn
 - Ability to run Javascript codes natively on the JVM;
 - Nashorn = Rhino (Mozilla)
 - Javascript execution:
	- jjs (command line)
	- embark with the Java code
 - Benefits
	- Modify part of the logic without recompiling
	- Flexibility
	- Interoperability
	
## Reflection of methods and parameters
 - java.lang.reflect.*;
 - Obtain information about methods and parameters of a class or instance at runtime
