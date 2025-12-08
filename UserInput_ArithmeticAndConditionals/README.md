# User Input, Arithmetic & Conditionals

## Overview
This folder contains introductory Java programs focusing on:
- Reading user input using `Scanner`
- Performing arithmetic calculations
- Using branching (`if` / `else`)
- Guarding against invalid operations
- Formatting output for end users



---

## Contents

| File | Description |
|---|---|
| `AgeStatistics.java` | Reads personal information and calculates age in minutes, centuries, and estimated max heart rate based on gender. |
| `Expression.java` | Evaluates a mathematical expression using user-provided values for `x` and `y`, with division-by-zero handling. |
| `SquareUnits.java` | Converts a number of square inches into acres, square yards, square feet, and remaining square inches using integer decomposition. |

---

## How to Compile

```bash
javac *.java
```

This compiles all programs into `.class` files.

---

## How to Run Each Program

### AgeStatistics
```bash
java AgeStatistics
```

### Expression
```bash
java Expression
```

### SquareUnits
```bash
java SquareUnits
```

Each program will prompt the user for necessary inputs and print computed results.

---

## Sample Output

### AgeStatistics.java
```
Enter your name: Michael
Enter your age in years: 31
Enter your gender (1 for female and 0 for male): 0

	Your age in minutes is 16293600 minutes.
	Your age in centuries is 0.31 centuries.
Your max heart rate is 189.2 beats per minute.
```

### Expression.java
```
result = (10x + 32.6) (5y - 1.567) / xy
	x = 2
	y = 5
result = 168.353
```

### SquareUnits.java
```
Enter the area in square inches: 500000
Number of Units:
	Acres: 0
	Square Yards: 385
	Square Feet: 1
	Square Inches: 56
```