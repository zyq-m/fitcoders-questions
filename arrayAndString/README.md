## Array and String

### Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with **square brackets**:

```
int[] myArr;
```

We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:

```
int[] myArr = {1, 2, 3};
```

### Access Array Elements

Access an array element by pointing to its index number

Example:

```
String[] myFriends = {"Ahmad", "Abu", "Ali"};

System.out.println(myFriends[0]);

// Output: Ahmad
```

### Array Length

To find out how many elements in an array just use `length` property:

```
String[] myFriends = {"Ahmad", "Abu", "Ali"};

System.out.println(myFriends.length);

// Output: 3
```

### Print All Element in An Array

You can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.

```
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

```
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

### List of Questions and Solutions

- [Q1](Q1/README.md)
- [Q2](Q2/README.md)
- [Q3](Q3/README.md)
- [Q4](Q4/README.md)
- [Q5](Q5/README.md)
- [Q6](Q6/README.md)
- [Q7](Q7/README.md)
