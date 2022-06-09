### LabTest 2

Write a program that receives a `string` input and a `character`. This string contains secret code.

Write a method named `CRACK` to get the code. The method should receive the `string` and the `character` as its parameter.

It will get all the position of the specified character from the `string` (the first letter of the string starts with `0`).

The letter position should be **merged** with a dashed `-` in a string sequence to form the secret code. This method should output the secret code to the main program.

For example a string of `abc aab` with a character `b` has a secret code of `1-6`

| string   | a   | b   | c   |     | a   | a   | b   |
| -------- | --- | --- | --- | --- | --- | --- | --- |
| position | 0   | a   | 2   | 3   | 4   | 5   | 6   |

**Sample input:**

```
air limau sangat masam
a
```

**Sample output:**

```
0-7-11-14-18-20
```
