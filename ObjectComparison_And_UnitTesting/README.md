# Object Comparison, Domain Modeling, and JUnit Validation

## Overview
This module explores object-oriented domain development in Java using:
- Comparable interfaces for ordering
- Encapsulation of customer account data
- Overloaded setters for flexible attribute updates
- Business-domain comparison behavior
- Numeric tolerance logic for floating-point accuracy
- Comprehensive automated testing using JUnit

These examples show how domain objects evolve into sortable and testable entities — a core enterprise skill used in financial systems, UI sorting, and collections logic.

---

## Contents

### Customer Domain Object

| File | Description |
|---|---|
| `Customer.java` | Represents a customer with name, location, and account balance. Supports overloaded location setters, balance mutation, formatted printing, and ordering using the `Comparable<Customer>` interface. |
| `CustomerTest.java` | JUnit validation for setter correctness, balance changes, string formatting, and numeric ordering logic (less-than, greater-than, and equality tolerance). |

### Geometric Domain Object with Ordering

| File | Description |
|---|---|
| `Spherocylinder.java` | Extends geometric modeling with radius, height, circumference, area, and volume calculation — and introduces ordering behavior using `Comparable<Spherocylinder>` based on volume. Also includes equality rules and static instance tracking. |
| `SpherocylinderTest.java` | Full test suite covering numeric methods, getter/setter validation, formatted output, static lifecycle behavior, equality invariants, and correct ordering semantics. |

---

## Key Object-Oriented Concepts Demonstrated

### Comparable Interfaces
- `compareTo()` used to order objects by:
  - account balance (Customer)
  - volume (Spherocylinder)
- Enables:
  - sorting with `Collections.sort()`  
  - min/max detection  
  - business prioritization rules  

### Overloaded Setter Behavior
- Ability to set location:
  - as a full address string
  - or as structured city + state components

### Numeric Logic & Tolerance
- Prevents floating-point equality issues by using:
  ```java
  Math.abs(a - b) < 0.000001
  ```
- This is production-grade equality handling

### Mutability & State Management
- Real-world balance changes via:
  ```java
  changeBalance(double amount)
  ```
- Flexible attribute assignment for domain evolution

### Domain-to-String Representation
- Clean formatting for:
  - Account summaries
  - Geometry summaries
- Readable diagnostic output for developers and testers

---

## JUnit Testing (Software Engineering Skill)

Each class includes a full automated test suite validating:
- getters and setters
- string formatting
- business-domain ordering logic
- static lifecycle counters
- equality & hash consistency
- floating point computation accuracy
- overloaded methods and state mutation

This demonstrates **test-driven correctness**, a critical engineering skill.

---

## Example Usage — Customer Comparison

```java
Customer a = new Customer("Alice");
Customer b = new Customer("Bob");
a.changeBalance(300);
b.changeBalance(500);
System.out.println(a.compareTo(b));   // prints -1 (a < b)
```

Sorting:

```java
List<Customer> customers = Arrays.asList(a, b);
Collections.sort(customers);  // ascending by balance
```

---

## Example Usage — Spherocylinder Ordering

```java
Spherocylinder sp1 = new Spherocylinder("A", 3.0, 5.0);
Spherocylinder sp2 = new Spherocylinder("B", 10.0, 15.0);
System.out.println(sp1.compareTo(sp2));   // prints -1
```

Automatic sorting:

```java
List<Spherocylinder> list = Arrays.asList(sp1, sp2);
Collections.sort(list);    // ascending by volume
```

---