# Java — Collections, File Parsing & List-Based Object Modeling

## Overview
This module demonstrates intermediate object-oriented programming with:
- Domain model classes (`Ellipsoid`, `NumberOperations`)
- Composite list modeling using `ArrayList<Ellipsoid>`
- Statistical computations across a dataset
- File I/O for structured input data
- Encapsulation using getters/setters
- Driver programs that create domain models, format output, and summarize results


---

## Contents

| File | Description |
|---|---|
| `Ellipsoid.java` | Reusable class that defines a labeled ellipsoid with axes `a`, `b`, and `c`. Computes volume and surface area with proper numeric formatting. |
| `EllipsoidList.java` | Composite class that stores multiple `Ellipsoid` objects in an `ArrayList` and computes: count, total volume, total surface area, average volume, average surface area, and formatted summary reporting. |
| `EllipsoidListApp.java` | Driver program that reads ellipsoid data from a text file, constructs objects, prints the full list, and displays list summary information. |
| `NumberOperations.java` | Utility class that performs numeric operations for a given integer: odds under, powers of two under, and comparison methods. |
| `NumberOpsDriver.java` | Interactive driver that reads user integers, builds `NumberOperations` objects, and displays calculated sequences. |

### Data Files

| File | Description |
|---|---|
| `Ellipsoid_data_0.txt` | Empty dataset used for testing behavior with no ellipsoids. |
| `Ellipsoid_data_1.txt` | Structured dataset containing ellipsoid label and axes in four-line blocks, used to generate a populated `EllipsoidList`. |

---

## Key Concepts Demonstrated

- **Domain objects and encapsulation**
- **Validation of instance fields**
- **Aggregation using `ArrayList<Ellipsoid>`**
- **File parsing with `Scanner`**
- **Numerical summarization and statistical reporting**
- **Formatted output using `DecimalFormat`**
- **Iterative list traversal with `while` loops**
- **Driver design that separates model logic from I/O**

This module shows how individual classes become part of a **data-processing system** rather than standalone scripts.

---

## How to Compile

From inside this folder, run:

```bash
javac *.java
```

All class definitions and drivers will compile into `.class` files.

---

## How to Run — Ellipsoid List (File Input)

```bash
java EllipsoidListApp
```

When prompted, enter a filename:

```
Enter file name: Ellipsoid_data_1.txt
```

Example output:

```
Ellipsoid Example List

Ellipsoid "SphereA" with axes a = 2.0, b = 2.0, c = 2.0 units has:
    volume = 33.51 cubic units
    surface area = 50.27 square units

Ellipsoid "SphereB" with axes a = 3.0, b = 2.0, c = 1.5 units has:
    volume = 37.70 cubic units
    surface area = 40.89 square units

----- Summary for Example List -----
Number of Ellipsoid Objects: 2
Total Volume: 71.21 cubic units
Total Surface Area: 91.16 square units
Average Volume: 35.60 cubic units
Average Surface Area: 45.58 square units
```

---

## How to Run — Number Operations

```bash
java NumberOpsDriver
```

Example input:

```
Enter a list of positive integers separated with a space followed by 0:
5 14 25 0
```

Example output:

```
For: 5
    Odds under:       1   3   5
    Powers of 2 under:    1   2   4

For: 14
    Odds under:       1   3   5   7   9   11   13
    Powers of 2 under:    1   2   4   8
```