# String Processing, Numeric Formatting & Equation Solving

## Overview
This folder contains Java programs demonstrating intermediate concepts including:
- Extracting information from formatted strings using `substring`
- Cleaning and transforming text input with `trim`, `toLowerCase`, `toUpperCase`, and `replace`
- Using `DecimalFormat` for human-friendly numeric output
- Using `Random` for generated values
- Solving mathematical expressions with `Math.pow` and `Math.sqrt`
- Inspecting numeric results by counting characters around the decimal point
- Validating input before extracting substrings


---

## Contents

| File | Description |
|---|---|
| `Event.java` | Extracts date, time, seating, price, and discount information from an encoded event ticket string. Also produces a random prize number. |
| `MessageConverter.java` | Reads user text and transforms it based on menu input: trimmed, lowercase, uppercase, vowel replaced, or substring removal. |
| `Solver.java` | Solves a mathematical equation, computes a square root, divides by a linear expression, counts characters around the decimal place, and formats a rounded result. |

---

## How to Compile

```bash
javac *.java
```

This compiles all programs into `.class` files.

---

## How to Run Each Program

### Event
```bash
java Event
```

### MessageConverter
```bash
java MessageConverter
```

### Solver
```bash
java Solver
```

Each program interacts with the user, processes data, and prints formatted output.

---

## Sample Output

### MessageConverter.java
```
Type in a message and press enter:
    > Hello Java Students

Output types:
    0: As is
    1: Trimmed
    2: lower case
    3: UPPER CASE
    4: v_w_ls r_pl_c_d
    5: Without first and last character
Enter your choice: 4

H_ll_ J_v_ St_d_nts
```

### Event.java (example with a fake event code)
```
Enter your event code: 12082020213550102015ORCHESTRAROOM

Event: ORCHESTRAROOM   Date: 12/08/2020   Time: 21:35
Section: 10   Row: 20   Seat: 15
Price: $35.00   Discount: 10%   Cost: $31.50
Prize Number: 4863
```

### Solver.java
```
Enter a value for x: 2.5
Result: 1.34567702
# of characters to left of decimal point: 1
# of characters to right of decimal point: 8
Formatted Result: 1.3457
```

---