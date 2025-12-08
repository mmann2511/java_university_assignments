# Intro to Java — Basic Output & Class Structure

## Overview
This folder contains early introductory Java programs demonstrating the basics of:
- Java class structure
- The `main` method entry point
- Printing formatted text to the console
- String concatenation and whitespace formatting
- Using documentation comments (`/** ... */`)

---

## Contents

| File | Description |
|---|---|
| `CourseInfo.java` | Prints introductory course information to the console. |
| `StudentInfo.java` | Prints formatted personal information. |
| `JLetter.java` | Creates ASCII-style output to form a large block letter "J". |
| `MyLifeGoals.java` | Prints short, medium, and long-term life goals. |

---

## How to Compile

From inside this folder, run:

```bash
javac *.java
```

This will compile all four programs into `.class` files.

---

## How to Run Each Program

```bash
java CourseInfo
java StudentInfo
java JLetter
java MyLifeGoals
```

Each will print to the console when executed.

---

## Sample Output

### CourseInfo.java

```
This course provides an introduction to Java and
object-oriented programming.

The course also introduces the basics of software development.
```

### JLetter.java

```
JAVAJAVAJAVA
JAVAJAVAJAVA
      JAVA
      JAVA
      JAVA
      JAVA
J     JAVA
JA    JAVA
 JAVAJAVA
  JAVAJA
```