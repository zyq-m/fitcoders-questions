## Array and String

### Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with **square brackets**:

```java
int[] myArr;
```

We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:

```java
int[] myArr = {1, 2, 3};
```

### Access Array Elements

Access an array element by pointing to its index number

Example:

```java
String[] myFriends = {"Ahmad", "Abu", "Ali"};

System.out.println(myFriends[0]);

// Output: Ahmad
```

### Array Length

To find out how many elements in an array just use `length` property:

```java
String[] myFriends = {"Ahmad", "Abu", "Ali"};

System.out.println(myFriends.length);

// Output: 3
```

### Print All Element in An Array

You can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.

```java
String[] myFriends = {"Ahmad", "Abu", "Ali"};

for (int i = 0; i < myFriends.length; i++) {
    System.out.println(myFriends[i]);
}

// Output👇
// Ahmad
// Abu
// Ali
```

### Empty Element in An Array

You can declare an array with empty element and initialize it later.

```java
String[] favFood = new String[3]; // empty array

// initialize element in array
favFood[0] = "Karipap";
favFood[1] = "Nasi Lemak";
favFood[2] = "Ramen";

// print all elements in array
for (int i = 0; i < favFood.length; i++) {
    System.out.println(favFood[i]);
}

// Output👇
// Karipap
// Nasi Lemak
// Ramen
```

### Java String `charAt()` Method

The `charAt()` method returns the character at the specified index in a string.

The index of the first character is 0, the second character is 1, and so on.

Example:

```java
String text = "Mom";
char result = text.charAt(0);

System.out.println(result);
// Output: M
```

### List of Questions and Solutions

- [Q1](Q1)
- [Q2](Q2)
- [Q3](Q3)
- [Q4](Q4)
- [Q5](Q5)
- [Q6](Q6)
- [Q7](Q7)
