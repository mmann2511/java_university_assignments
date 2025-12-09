# Exception Handling, Integer vs. Decimal Division, and Swing-Based User Interaction

## Overview
This module demonstrates **robust arithmetic and exception handling patterns in Java**, including:

- static utility methods
- integer vs. floating-point division semantics
- checked and unchecked error handling
- safe input validation
- GUI-based user interaction via `JOptionPane`
- proper use of `try/catch` for both parsing and arithmetic logic



---

# Contents

| File | Description |
|---|---|
| `Division.java` | Contains two static division methods demonstrating integer division with safe fallback, and decimal division with explicit argument validation. |
| `DivisionDriver.java` | Swing-based GUI program that prompts the user for integer inputs, performs arithmetic, and reports results or errors via dialog boxes. |

---

# Key Engineering Concepts Demonstrated

## 1. Integer Division With Safe Fallback

```java
public static int intDivide(int numIn, int denomIn) {
   try {
      return numIn / denomIn;
   }
   catch (ArithmeticException e) {
      return 0;
   }
}
```

**Behavior:**

- Performs standard integer division (`/`)
- Uses a `try/catch` to intercept division-by-zero
- Returns `0` instead of throwing, which protects caller logic
- Predictable behavior during aggregation workflows

This pattern is realistic in:

- data cleansing
- billing calculations
- statistical merging
- numeric pre-processing

## 2. Decimal Division With Explicit Validation

```java
public static double decimalDivide(int numIn, int denomIn) {
   if (denomIn == 0) {
      throw new IllegalArgumentException("The denominator cannot be zero.");
   }
   return (double) numIn / denomIn;
}
```

**Behavior:**

- Converts integer to double
- Enforces **input contract**, rather than silent failure
- Communicates **illegal state** to caller
- Ideal when correctness is more important than graceful fallback

This mirrors enterprise validation:

> Arithmetic rules **don’t silently rewrite math** unless policy says so.

## 3. Safe User Input Parsing

```java
int num = Integer.parseInt(numInput);
int denom = Integer.parseInt(denomInput);
```

Guarded with:

```java
catch (NumberFormatException e) {
   JOptionPane.showMessageDialog(null,
      "Invalid input: enter numerical integer values only.",
      "Error", JOptionPane.ERROR_MESSAGE);
}
```

**What it demonstrates:**

- End-user input is **untrusted**
- Parsing can fail
- Exception messaging should be **clear and actionable**

## 4. Swing GUI Interaction

```java
String numInput = JOptionPane.showInputDialog("Enter the numerator:");
String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
```

This module shows:

- GUI input prompting
- GUI result output
- GUI exception alerts
- beginner desktop-UI patterns

No CLI required.

---

# Division Result Output Example

```
Integer division:
4

Floating point division:
4.57142857
```

With invalid denominator:

```
Error: The denominator cannot be zero.
```

With invalid characters:

```
Error: Invalid input: enter numerical integer values only.
```

---

# Compile and Run Instructions

```bash
javac *.java
java DivisionDriver
```

Execution launches Swing dialog boxes — no console interaction needed.

---