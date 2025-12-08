# Financial Modeling, Unit Testing & Geometric Domain Objects

## Overview
This module introduces advanced Java object-oriented development with:
- Financial domain modeling (`BankLoan`)
- Validated business logic and state mutation
- Static fields and class-level counters
- Mathematical modeling of real-world geometry (`Spherocylinder`)
- Precision numerical computation and formatted output
- Correct equality semantics and hash behavior
- Comprehensive **JUnit test coverage**


---

## Contents

### Financial Modeling

| File | Description |
|---|---|
| `BankLoan.java` | Represents a loan with a balance, customer name, and annual interest rate. Allows borrowing, paying down balance, charging interest, validation, loan counting, and formatted string output. |
| `BankLoanTest.java` | JUnit test suite covering loan creation, borrowing rules, repayment logic, interest charging, static counters, validation behavior, and string formatting. |

### Geometric Domain Modeling

| File | Description |
|---|---|
| `Spherocylinder.java` | Object model representing a 3D geometric shape defined by radius and cylinder height. Contains getters/setters, circumference/area/volume calculations, formatted summaries, equality checks, and static counters. |
| `SpherocylinderTest.java` | Full JUnit coverage validating getters, setters, surface and volume calculations, formatting, equality tolerance rules, static count tracking, and hash consistency. |

---

## Key Concepts Demonstrated

### Object-Oriented Design Patterns
- Encapsulation of business logic
- Getter/setter validation rules
- Domain-specific state mutation
- Class-level counters (`static int`)
- Lifecycle reset for controlled test sequencing

### Financial System Behavior
- Borrowing constraints with max loan limits
- Balance updates and repayment logic
- Charge interest via compounding
- Static checks for loan validity and debt state

### Geometry System Behavior
- Accurate circumference, surface area, and volume computations
- Automatic rounding using `DecimalFormat`
- Correct object equality via:
  - case-insensitive label comparison
  - tolerance-based floating point comparison

### JUnit Testing (Enterprise Skill)
- Method-level unit validation
- Overpayment detection and refund logic
- Getter/setter test coverage
- Equality and hash invariants
- Precision numeric assertion using tolerances
- Reset behavior for static counters

This module reflects **real-world engineering** where software correctness is verified by automated testing.

---

## How to Compile

From inside this folder:

```bash
javac *.java
```

This compiles:
- domain classes
- JUnit test classes (if using a JUnit runner)

---

## How to Run Unit Tests

You can run the tests using any JUnit-compatible runner:

📌 **If using jGRASP or IntelliJ:**
- Right-click each test class → Run Test

📌 **If using Maven or Gradle (later upgrade):**
- Place test files in `src/test/java`
- Execute with build tool

Each test suite validates:
- class initialization
- business logic correctness
- geometric formulas
- precision numeric behavior
- static count logic

---

## Example — Loan Interactions

Creating a loan, borrowing, and charging interest:

```java
BankLoan loan = new BankLoan("Jane Doe", 0.10);
loan.borrowFromBank(1000);
loan.chargeInterest();
System.out.println(loan.getBalance());  // prints 1100
```

Repayment with overpayment:

```java
loan.payBank(1200);   // returns 100 refund
loan.getBalance();    // returns 0
```

---

## Example — Spherocylinder Computation

```java
Spherocylinder sp = new Spherocylinder("Sample", 3.0, 5.0);
System.out.println(sp.circumference());
System.out.println(sp.surfaceArea());
System.out.println(sp.volume());
System.out.println(sp.toString());
```

Outputs formatted human-readable geometry details.

---