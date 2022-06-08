## Looping 👩‍💻

### Java For Loop

When you know exactly how many times you want to loop through a block of code, use the `for` loop instead of a `while` loop:

Syntax 👇

```
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

Example

```
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

Statement 1 sets a variable before the loop starts `int i = 0`.

Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is `true`, the loop will start over again, if it is `false`, the loop will end.

Statement 3 increases a value `i++` each time the code block in the loop has been executed.

### Java While Loop

The `while` loop loops through a block of code as long as a specified condition is `true`:

Syntax 👇

```
while (condition) {
  // code block to be executed
}
```

Example

In the example below, the code in the loop will run, over and over again, as long as a variable `i` is less than 5:

```
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

### For Loop Vs While Loop

| Comparison  | For                                                         | While                                                            |
| ----------- | ----------------------------------------------------------- | ---------------------------------------------------------------- |
| When to use | Used only when we already **knew** the number of iterations | Used only when the number of iteration are **not exactly known** |

### List of Questions and Solutions

- [Q1](Q1/)
- [Q2](Q2/)
- [Q3](Q3/)
- [Q4](Q4/)
- [Q5](Q5/)
- [Q6](Q6/)
- [Q7](Q7/)
- [Q8](Q8/)
