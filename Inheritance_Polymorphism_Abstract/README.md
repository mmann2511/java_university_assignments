# Inheritance, Polymorphism, Abstract Classes, Cost Calculation & Inventory Aggregation

## Overview
This module demonstrates enterprise-style object modeling using:

- **class inheritance hierarchy** (`InventoryItem` → `ElectronicsItem` → `OnlineTextItem` → `OnlineArticle` / `OnlineBook`)
- **polymorphic cost calculation**
- **static tax policy enforcement**
- **shipping surcharges for physical goods**
- **inventory aggregation via an array-backed list**
- **aggregate billing using polymorphic iteration**
- **clean domain specialization without code duplication**



---

# Contents

| File | Description |
|---|---|
| `InventoryItem.java` | Base domain model representing a generic item with a price and tax policy. Provides default `calculateCost()` and formatted output. |
| `ElectronicsItem.java` | Subclass that adds physical weight and a per-pound shipping charge. Demonstrates **cost override + physical inventory logic**. |
| `OnlineTextItem.java` | Abstract subclass for digital products. Overrides `calculateCost()` to return base price without tax or shipping. Establishes a **polymorphic digital layer**. |
| `OnlineArticle.java` | Concrete subclass for online articles. Adds word count and inherits digital pricing behavior. |
| `OnlineBook.java` | Concrete subclass for online books. Adds author metadata and a custom `toString()` implementation. |
| `InventoryApp.java` | Driver demonstrating polymorphic instantiation of multiple item types and static tax assignment. |
| `ItemsList.java` | Array-backed inventory container supporting polymorphic aggregation, adding items, listing inventory, and total cost calculation with conditional surcharges. |
| `InventoryListApp.java` | Driver for `ItemsList`, showing real-world aggregation and surcharge billing behaviors across mixed item types. |

---

# Key Engineering Concepts Demonstrated

## 1. Class Hierarchy & Specialization
- **physical vs. digital** items share a common domain interface
- subclasses extend parent cost logic without modifying caller code
- `OnlineTextItem` is abstract to enforce domain structure and avoid meaningless instantiation

## 2. Polymorphic Cost Behavior

| Type | Tax? | Shipping? | Notes |
|---|---|---|---|
| InventoryItem | Yes | No | Physical product baseline |
| ElectronicsItem | Yes | Yes | Adds per-pound shipping |
| OnlineTextItem | No | No | Digital content — cost unaffected by tax or freight |
| OnlineArticle | No | No | Inherits digital rules |
| OnlineBook | No | No | Adds author metadata |

Every item type exposes the same **`calculateCost()` method**, yet **returns different business logic** based on its subclass — true polymorphism.

## 3. Static Tax Policy
- `InventoryItem.setTaxRate()` applies globally
- predicts real industry tax handling (state, region, class rules)
- prevents redundant per-object duplication

## 4. Abstract Class Enforcement
- `OnlineTextItem` cannot be instantiated directly
- logically separates **physical SKUs** from **digital content assets**

## 5. Inventory Aggregation
### `ItemsList`:
- Holds an `InventoryItem[]` that can contain **any of its subclasses**
- Supports:
  - adding items
  - printing full inventory
  - surcharge billing on electronics only
  - polymorphic `calculateCost()` resolution at runtime

### **Real Enterprise Pattern**
This mimics:

- warehouse billing systems
- freight + tax computation
- digital marketplaces
- shopping cart platforms
- SKU aggregation reporting

---

# Example Usage

```java
InventoryItem.setTaxRate(0.05);

ItemsList myItems = new ItemsList();
myItems.addItem(new ElectronicsItem("Laptop", 1234.56, 10));
myItems.addItem(new InventoryItem("Motor oil", 9.80));
myItems.addItem(new OnlineBook("All Things Java", 12.30));
myItems.addItem(new OnlineArticle("Useful Acronyms", 3.40));

System.out.println(myItems.toString());
System.out.println("Total: " + myItems.calculateTotal(2.0));
```

### Billing Logic
- Physical items are taxed
- Digital items are not taxed
- Electronics get:
  - tax + shipping (inside `calculateCost()`)
  - optional **surcharge** added per item (via `ItemsList.calculateTotal()`)


---

# Compile Instructions

```bash
javac *.java
java InventoryListApp
```

No external libraries required.

---

# Inventory Output Example

```
All inventory:

laptop: $<computed>
motor oil: $<computed>
All Things Java: $12.30
Useful Acronyms: $3.40

Total: <computed>
```

(The `calculateCost()` formatting changes based on item type.)

---