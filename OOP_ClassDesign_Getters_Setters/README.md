# Object-Oriented Class Design, Getters/Setters & Computation Methods

## Overview
This folder contains introductory Java programs demonstrating object-oriented software design with:
- Custom classes
- Constructors
- Private instance fields
- Getters and setters with validation
- Encapsulation of internal state
- String formatting and computation methods
- Driver programs that instantiate and interact with objects

These exercises are part of Auburn University’s COMP 1210 course and illustrate foundational principles of Java OOP.

---

## Contents

| File | Description |
|---|---|
| `Ellipsoid.java` | Defines a reusable Ellipsoid class with fields (label, a, b, c), validation methods, computed volume and surface area, and a formatted `toString()` output. |
| `EllipsoidApp.java` | Driver that prompts the user for ellipsoid values, validates input, and prints formatted volume and surface area using the Ellipsoid class. |
| `UserInfo.java` | Defines a User class with name, age, location, and online/offline status; includes field validation, state changes, and formatted representation. |
| `UserInfoDriver.java` | Driver that creates User objects, updates state, and prints status before and after method calls. |

---

## Core OOP Concepts Demonstrated

- Designing classes with **private fields**
- Implementing **encapsulation** using getters and setters
- Validating parameters before updating internal state
- Creating and using **constructors**
- Using `toString()` for formatted object representation
- Working with problems modeled as **domain objects**
- Computing derived values (volume, surface area)
- Using **DecimalFormat** for readable numeric output

This module shows how Java programs evolve from simple procedural scripts into **data models** that represent real-world entities.

---

## How to Compile

From inside this folder:

```bash
javac *.java
```

This compiles all class definitions and drivers into `.class` files.

---

## How to Run

### Ellipsoid Example
```bash
java EllipsoidApp
```

Example input:
```
Enter label and axes a, b, c for an ellipsoid.
    label: Example
    a: 2
    b: 3
    c: 4
```

Output (example):
```
Ellipsoid "Example" with axes a = 2.0, b = 3.0, c = 4.0 units has:
    volume = 100.53 cubic units
    surface area = 79.59 square units
```

### User Example
```bash
java UserInfoDriver
```

Example output:
```
Name: Pat Doe
Location: Not specified
Age: 0
Status: Offline

Name: Pat Doe
Location: Auburn
Age: 19
Status: Online

Name: Sam Jones
Location: Not specified
Age: 0
Status: Offline

Name: Sam Jones
Location: Atlanta
Age: 21
Status: Online
```