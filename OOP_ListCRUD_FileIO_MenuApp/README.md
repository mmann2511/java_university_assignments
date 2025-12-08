# List CRUD Operations, File Parsing & Interactive Menu Application

## Overview
This module extends previous ellipsoid and list-based modeling by introducing:

- Full CRUD operations (`add`, `delete`, `find`, `edit`)
- File-driven list creation with structured data
- An interactive terminal **menu application**
- Encapsulation of list state inside a domain model
- Statistical utilities using custom classes (`Temperatures`)
- Iterative numerical summaries and formatted reporting

These programs showcase how object-oriented domain models evolve into **interactive systems** with user workflows, persistent lists, and extensibility.

---

## Contents

### Domain & List Modeling

| File | Description |
|---|---|
| `Ellipsoid.java` | Defines a labeled ellipsoid with axes `a`, `b`, and `c`; computes volume and surface area with numeric formatting and validation. |
| `EllipsoidList.java` | Composite class storing multiple `Ellipsoid` objects, computing totals/averages, generating formatted summaries, and supporting full CRUD operations as well as file parsing. |

### User Interface Applications

| File | Description |
|---|---|
| `EllipsoidListApp.java` | Reads an input file, constructs a populated list, and prints the full list and summary information. |
| `EllipsoidListMenuApp.java` | **Interactive menu application** that allows a user to: read a file, print the list, print summary, add objects, delete objects, find objects, or edit objects — all from user-entered commands. |

### Temperature Modeling

| File | Description |
|---|---|
| `TemperatureInfo.java` | Interactive driver that accepts user-entered temperature values and allows menu-based exploration of low, high, or formatted display. |
| `Temperatures.java` | Encapsulates a list of integer temperature values, providing low/high computations, comparisons, and formatted list reporting. |

### Data Files

| File | Description |
|---|---|
| `Ellipsoid_data_0.txt` | Empty dataset used to verify correct behavior when no ellipsoids are present. |
| `Ellipsoid_data_1.txt` | Structured dataset for populating lists using four-line ellipsoid records (label, a, b, c). Used to test list creation and statistics. |

---

## Key Concepts Demonstrated

- **CRUD on domain models**
  - `addEllipsoid()`
  - `deleteEllipsoid()`
  - `findEllipsoid()`
  - `editEllipsoid()`

- **File parsing and list population**
  - Converts structured text into domain objects
  - Automatically validates and stores data using constructors

- **Data analytics**
  - Total volume and surface area
  - Average volume and surface area
  - Min/max temperature calculations
  - Iterative statistics using loops

- **Encapsulation & validation**
  - Controlled field updates using getters/setters
  - Positive numeric validation for ellipsoid axes

- **User-driven command interface**
  - Provides **command-line workflow**
  - Builds system behavior that feels application-like
  - State persists across commands until user quits

- **Formatted reporting**
  - Summary statistics using `DecimalFormat`
  - Multi-line toString rendering for readable inspection

These skills reflect **real-world application structure** — domain models + list management + persistence + UI interaction.

---

## How to Compile

From inside this folder, run:

```bash
javac *.java
```

All supporting classes and applications will compile into `.class` files.

---

## How to Run — Interactive Menu

```bash
java EllipsoidListMenuApp
```

The terminal menu will appear:

```
Ellipsoid List System Menu
R - Read File and Create Ellipsoid List
P - Print Ellipsoid List
S - Print Summary
A - Add Ellipsoid
D - Delete Ellipsoid
F - Find Ellipsoid
E - Edit Ellipsoid
Q - Quit
```

Example workflow:

```
Enter Code [R, P, S, A, D, F, E, or Q]: R
    File Name: Ellipsoid_data_1.txt
    File read in and Ellipsoid List created

Enter Code [R, P, S, A, D, F, E, or Q]: S
----- Summary for My Sample List -----
Number of Ellipsoid Objects: 3
Total Volume: 142.76 cubic units
Total Surface Area: 185.41 square units
Average Volume: 47.58 cubic units
Average Surface Area: 61.80 square units
```

Users may continue adding, editing, deleting, or searching objects until quitting.

---

## How to Run — File-Only List Creation

```bash
java EllipsoidListApp
```

Example:

```
Enter file name: Ellipsoid_data_1.txt
```

Followed by formatted list output and a summary block.

---

## How to Run — Temperature Analysis

```bash
java TemperatureInfo
```

Example:

```
Enter a temperature (or nothing to end list): 72
Enter a temperature (or nothing to end list): 65
Enter a temperature (or nothing to end list):
Enter choice - [L]ow temp, [H]igh temp, [P]rint, [E]nd: P
    Temperatures: [72, 65]
    Low: 65
    High: 72
```