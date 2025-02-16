# Sorting-Algorithms-in-Java
A simple Java program that implements common sorting algorithms for sorting integer data in both ascending and descending order, while also tracking the number of swaps and comparisons for each algorithm.
This program allows users to execute various sorting algorithms via the command line, specifying the mode, algorithm, and order of sorting.

## **Usage:**
The program expects **two lines of input**:

### **1st Line: Command Specification**
```
[mode] [algorithm] [order]
```
- **`[mode]`** → Specifies output type:
  - `count` → Tracks swaps and comparisons.
  - `trace` → Displays sorting steps.
- **`[algorithm]`** → Sorting algorithm to use:
  - `insert`, `select`, `bubble`, `heap`, `merge`, `quick`, `radix`, `bucket`
- **`[order]`** → Sorting order:
  - `up` → Ascending order.
  - `down` → Descending order.

### **2nd Line: List of Numbers**
```
[number1] [number2] [number3] ...
```
- A space-separated list of integers.
- These numbers will be sorted based on the provided parameters.

---

## **Example Inputs and Outputs**

### **Example 1: Counting Operations in Selection Sort (Ascending)**
#### **Input:**
```
count select up
8 3 1 9 7
```
#### **Output:**
```
12 10 | 12 10 | 12 10  # (where 12 = swaps, 10 = comparisons)
```
This counts swaps and comparisons while sorting in **ascending order**.

---

### **Example 2: Step-by-Step Sorting with Bubble Sort (Descending)**
#### **Input:**
```
trace bubble down
4 2 7 1 16
```
#### **Output:**
```
4 2 7 1 16
16 | 4 2 7 1
16 7 | 4 2 1
16 7 4 2 | 1  # (Final sorted order)
```
Each step shows the array transformation after sorting iterations.

---

## **Edge Cases & Notes**
- **Invalid commands** → If an unknown command is given, the program ignores it.
- **Empty input** → The program should handle cases where no numbers are provided.
- **Single-element array** → Should return the same number immediately.
- **Non-numeric input** → If non-numeric characters are in the second line, the program may throw an error.

---
