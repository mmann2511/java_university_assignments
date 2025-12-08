# Array Processing, Domain Lists, and Test-Driven Development

## Overview
This module demonstrates enterprise-style list aggregation and numeric processing in Java using:

- structured domain objects (`Spherocylinder`)
- a fixed-size list container with CRUD behavior (`SpherocylinderList`)
- total/average surface area and volume reporting
- max element detection and business logic scanning
- reverse-formatting and array slicing using integer arrays (`Scores`)
- rigorous validation using JUnit across all public behaviors

This is a realistic model of how domain lists are managed inside financial systems, simulations, dashboards, and manufacturing analytics.

---

# Contents

### Array Processing Utility

| File | Description |
|---|---|
| `Scores.java` | Wraps a primitive integer array and provides utility methods to: extract even values, extract odd values, compute averages, print data, and reverse-print. Shows iterative decomposition and aggregation logic. |

### Geometric Domain Model

| File | Description |
|---|---|
| `Spherocylinder.java` | Computes geometric properties (circumference, surface area, volume), supports label normalization, equality, formatted reporting, and instance counting. Implements `Comparable<Spherocylinder>` for domain ordering based on volume. |

### Domain Aggregation & CRUD Management

| File | Description |
|---|---|
| `SpherocylinderList.java` | A domain list manager designed around a fixed-size array. Supports: add, delete with left-shifting, edit, aggregate totals, averages, summary reporting, max element discovery, and structured getter access. This demonstrates enterprise list operations without dynamic collections. |

### JUnit Validation

| File | Description |
|---|---|
| `SpherocylinderTest.java` | Full TDD validation for domain object calculations, setters, equality invariants, formatted output, static lifecycle counters, and comparison ordering. |
| `SpherocylinderListTest.java` | Complete test suite for list aggregation methods, including: totals, averages, add/delete/edit operations, index shifting, empty-list safety, and largest-volume detection. |

---

# Key Engineering Concepts Demonstrated

### Array Processing & Decomposition
- extracting even/odd subsets using two-pass scanning
- iterative sum and average logic
- formatted output and reverse enumeration

### CRUD Operations on a Fixed-Size Container
- add with index advancement
- delete with element shifting (manual compaction)
- safe nulling behavior for unused slots
- edit and find operations using label-key lookups

### Domain-Level Aggregation
- total surface area
- total volume
- average reporting
- max-volume detection using iterative scanning

### Domain-TDD Integration
The code demonstrates **test-driven development** with:

- constructor assertions
- list cardinality validation
- full CRUD scenario coverage
- empty-list safety
- equality invariants
- precision tolerances for geometric computation
- string-format testing for list summaries

This reflects professional correctness guarantees, not just academic examples.

---

# Example Usage — Scores Array Processing

```java
int[] data = {4, 7, 10, 3, 8};
Scores s = new Scores(data);

System.out.println(Arrays.toString(s.findEvens()));    // [4,10,8]
System.out.println(Arrays.toString(s.findOdds()));     // [7,3]
System.out.println(s.calculateAverage());              // 6.4
```

Reverse-print:

```java
System.out.println(s.toStringInReverse());   // "8 3 10 7 4"
```

---

# Example Usage — Spherocylinder List

```java
Spherocylinder[] arr = new Spherocylinder[10];
arr[0] = new Spherocylinder("A", 1, 2);
arr[1] = new Spherocylinder("B", 2, 3);

SpherocylinderList list =
    new SpherocylinderList("Demo", arr, 2);

System.out.println(list.totalVolume());
System.out.println(list.findSpherocylinder("A"));
```

Max element selection:

```java
Spherocylinder largest = list.findSpherocylinderWithLargestVolume();
```

Delete and shift:

```java
list.deleteSpherocylinder("B");
```

---

# Compile Instructions

```bash
javac *.java
```

# Run JUnit (IDE or Maven runner)

- jGRASP
- VS Code
- IntelliJ
- Eclipse

---