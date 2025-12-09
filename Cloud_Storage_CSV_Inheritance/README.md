# Cloud Storage Inheritance, Exception Handling, and Sorted Analytics (TDD)

## Overview
This module demonstrates a **enterprise-style inheritance hierarchy** and data aggregation pipeline for a cloud-storage billing domain.  
It includes:

- An abstract superclass (`CloudStorage`)
- Multiple polymorphic subclasses:
  - `SharedCloud`, `PublicCloud`, `PersonalCloud`, `DedicatedCloud`
- Instance counting and formatted domain reporting
- CSV ingestion, validation, exception quarantine, and summary reporting
- Multiple sorted reporting methods using:
  - **natural ordering (`Comparable`)**
  - **custom ordering (`Comparator`)**
- **Full JUnit validation** of domain behavior, aggregation, file parsing, exception capture, and CLI behavior


---

# Contents

### Core Domain Model (Inheritance)

| File | Description |
|---|---|
| `CloudStorage.java` | Abstract superclass defining shared fields, base cost, formatted output, instance counting, and alphabetical ordering. |
| `SharedCloud.java` | Base data-limit model with usage, overage detection, multiplier, and monthly cost computation. |
| `PublicCloud.java` | Elevated public-cloud overage multiplier via overridden cost factor. |
| `PersonalCloud.java` | Highest overage multiplier (tiered personal model). |
| `DedicatedCloud.java` | Dedicated cloud pricing with fixed server surcharge. |

### Aggregation, Ingestion, and Reporting

| File | Description |
|---|---|
| `CloudStorageList.java` | Valid-object list container, invalid record quarantine, CSV parsing pipeline, sorted reporting, formatted summaries. |
| `MonthlyCostComparator.java` | Sorts objects in **descending monthly cost order**. |
| `InvalidCategoryException.java` | Thrown for malformed cloud-storage categories during CSV parsing. |

### CLI Driver

| File | Description |
|---|---|
| `CloudStoragePart3.java` | Command-line entry point for CSV ingestion, report printing, and file-not-found handling. |

### Automated Testing (JUnit)

| File | Description |
|---|---|
| `CloudStorageListTest.java` | Ingestion, dynamic sizing, report formatting, sorted ordering, exception detection, and invalid-record handling. |
| `MonthlyCostComparatorTest.java` | Validates ordering semantics for higher/lower/equal billing values. |
| `DedicatedCloudTest.java` | Constructor fields, instance counting, monthly computation, formatted output. |
| `SharedCloudTest.java` | Usage, limits, overage, monthly logic, formatted output. |
| `PublicCloudTest.java` | Public-tier multiplier logic and formatted output. |
| `PersonalCloudTest.java` | Personal-tier multiplier logic and cost validation. |
| `CloudStoragePart3Test.java` | CLI execution: no args, valid file, invalid file. |

---

# CSV Test Data (Included in this Module)

### `cloud_storage_data_1.csv`  *(Normal data – no exceptions)*
- Valid domain records only
- Verifies:
  - correct object creation
  - sorted reporting
  - monthly billing calculations
  - alphabetical ordering
  - cost-based ordering
- Used by:
  - `CloudStorageListTest`
  - `CloudStorageList.generateReport()`
  - end-to-end CLI runs

This file represents a clean ingestion scenario used to ensure computational correctness.

---

### `cloud_storage_data_2_exceptions.csv`  *(Mixed valid + invalid records)*
Contains a blend of:

- Valid domain lines
- Invalid categories
- Malformed numeric fields
- Missing fields
- Bad delimiters
- NoSuchElement anomalies

The ingestion pipeline must:

1. **attempt to parse each record**
2. **store valid CloudStorage objects**
3. **capture invalid input as a raw string**
4. **record the exact exception thrown**:
   - `InvalidCategoryException`
   - `NumberFormatException`
   - `NoSuchElementException`

All exceptions are **quarantined instead of terminating parsing**

---

# Key Engineering Concepts Demonstrated

### Object-Oriented Inheritance & Polymorphism
- Abstract superclass (`CloudStorage`)
- Subtype cost overrides (`monthlyCost()`)
- Shared formatting and reporting logic
- Instance lifecycle counting

### CSV Batch Ingestion & Data Sanitation
- Fault-tolerant parsing
- Multi-exception detection
- Invalid record quarantine
- Full-audit invalid-record reporting

### Dynamic List Management
- `Arrays.copyOf()` resizing
- Valid object aggregation
- Invalid object quarantining
- Both arrays remain synchronized with ingestion

### Sorted Analytics
- Alphabetical ordering (`Comparable`)
- Cost-based ordering (`Comparator`)
- Separate custom report methods
- End-to-end formatted CLI output

### Test-Driven Development
- Correctness at the domain, list, utility, and CLI level
- Exception behavior and field audits
- CLI scenarios:
  - no file provided
  - file found with mixed records
  - file not found

---

# Running the System

### Compile:
```bash
javac *.java
```

### Execute (valid dataset):
```bash
java CloudStoragePart3 cloud_storage_data_1.csv
```

### Execute (exception dataset):
```bash
java CloudStoragePart3 cloud_storage_data_2_exceptions.csv
```

### Sample Output Sections:
- Monthly Cloud Storage Report
- Report (by Name)
- Report (by Monthly Cost)
- Invalid Records Report

Invalid records show:
```
<raw csv line>
<exception type + message>
```

Exactly what a real audit log would look like.

---

# Example Cost Logic

Shared:
```java
CloudStorage a = new SharedCloud("A", 10, 25, 20);
a.monthlyCost();  // 15.00
```

Public (2× multiplier):
```java
CloudStorage b = new PublicCloud("B", 10, 25, 20);
b.monthlyCost();  // 20.00
```

Personal (3× multiplier):
```java
CloudStorage c = new PersonalCloud("C", 10, 25, 20);
c.monthlyCost();  // 25.00
```

---