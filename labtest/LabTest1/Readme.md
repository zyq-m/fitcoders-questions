### LabTest 1

Write a simple calculator.

The first input is a number to determine the total number of mathematical operation set (declare as `totalSet`). (count for looping)

Then in the loop of `totalSet`;

1. Read the first integer (declare as `num1`),
2. Then reads a string for the operation symbol (declare as op) such as `+`, `-`, `*` or `/`.
3. Then reads the second integer (declare as `num2`).

Your program should output the result of the mathematical operation of `num1` and `num2` as shown in the “Sample Output”.

You must also include the rules as the following: -

1. For division operation, if the second number is 0, then do not proceed with the mathematical operation. Print alert "Cannot divide" instead. Otherwise, print the division result.

2. For minus operation, if the second number is bigger than the first number, then the second number should minus the first number. Otherwise, the first number should minus the second number.

**Sample input:**

```
6
10
*
4
29
+
33
3
-
7
6
-
2
20
/
0
20
/
3
```

**Sample output:**

```
10*4 = 40
29+33 = 62
3-7 = 4
6-2 = 4
20/0 = Cannot divide
20/3 = 6.67
```
