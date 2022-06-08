## Method 👩‍💻

### Java methods

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

### Create a Method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses `()`. Java provides some pre-defined methods, such as `System.out.println()`, but you can also create your own methods to perform certain actions:

Syntax👇

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

Example Explained

- `myMethod()` is the name of the method
- `static` means that the method belongs to the Main class and not an object of the Main class
- `void` means that this method does not have a return value

### Call a Method

To call a method in Java, write the method's name followed by two parentheses `()` and a semicolon`;`

Example

Inside `main`, call the `greeting` method:

```java
public class Main {
  static void greeting() {
    System.out.println("Hi Mom!");
  }

  public static void main(String[] args) {
    greeting();
  }
}

// Output: "Hi Mom!"
```

A method also can be called mutltiple times:

```java
public class Main {
  static void greeting() {
    System.out.println("Hi Mom!");
  }

  public static void main(String[] args) {
    greeting();
    greeting();
    greeting();
  }
}

// Output: "Hi Mom!"
// Output: "Hi Mom!"
// Output: "Hi Mom!"
```

### Java Methods Parameters

Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a `String` called `name` as parameter:

```java
public class Main {
  static void myMethod(String name, int age) {
    System.out.println("My name is " + name);
    System.out.println("I am " + age + " years old");
  }

  public static void main(String[] args) {
    myMethod("Ahmad", 21);
  }
}

// Output: My name is Ahmad
// Output: I am 21 years old
```

### Return Values

The `void` keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as `int`, `char`, etc.) instead of `void`, and use the `return` keyword inside the method:

```java
public class Main {
  static int addTwoNum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int num = addTwoNum(2, 3);
    System.out.println(num);
  }
}
// Outputs 5
```

### List of Questions & Solutions

- [Q1](Q1/)
- [Q2](Q2/)
