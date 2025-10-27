# 🧩 CS1500 — Sorting & Searching Algorithms Lab
### Package: `D_Methods`

---

## 💡 Objective
Understand how **sorting** and **searching** algorithms work by tracing, running, and comparing their performance and logic.

---

## 🧮 Part 1: Bubble Sort

**Algorithm idea:**  
Repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order.

**Code used:** `BubbleSort.java`

| Pass | Array State | Swaps Made? (Y/N) |
|------|--------------|-------------------|
| 1 | ___________________________ | ____ |
| 2 | ___________________________ | ____ |
| 3 | ___________________________ | ____ |
| 4 | ___________________________ | ____ |

**Questions:**
1. What happens when no swaps are made during a pass?  
   → _______________________________________

2. What is the **time complexity** of Bubble Sort in the worst case?  
   → _______________________________________

---

## 📘 Part 2: Insertion Sort

**Algorithm idea:**  
Build a sorted section one element at a time by inserting each new element into its correct position.

**Code used:** `InsertionSort.java`

Trace the array `{12, 11, 13, 5, 6}` step by step.

| Step | Key Value | Array State |
|------|------------|-------------|
| 1 | ____ | __________________ |
| 2 | ____ | __________________ |
| 3 | ____ | __________________ |
| 4 | ____ | __________________ |

**Questions:**
1. What part of the array is always sorted during the process?  
   → _______________________________________

2. Is Insertion Sort faster than Bubble Sort on *nearly sorted data*?  
   → _______________________________________

---

## ⚙️ Part 3: Selection Sort

**Algorithm idea:**  
Repeatedly select the smallest element from the unsorted section and place it at the beginning.

**Code used:** `SelectionSort.java`

Given `{64, 25, 12, 22, 11}`, fill in each pass:

| Pass | Minimum Value Found | Array State After Swap |
|------|----------------------|------------------------|
| 1 | ____ | __________________ |
| 2 | ____ | __________________ |
| 3 | ____ | __________________ |
| 4 | ____ | __________________ |

**Questions:**
1. How many swaps happen in total?  
   → _______________________________________

2. Is Selection Sort a *stable* algorithm?  
   → _______________________________________

---

## 🔍 Part 4: Linear Search

**Algorithm idea:**  
Go through the list **one by one** until the target element is found or the list ends.

**Code used:** `LinearSearch.java`

Array: `{10, 20, 30, 40, 50}`  
Target: `30`

| Step | Element Checked | Match Found? |
|------|------------------|--------------|
| 1 | ____ | ____ |
| 2 | ____ | ____ |
| 3 | ____ | ____ |

**Questions:**
1. What index was found? → _______________
2. What if the element doesn’t exist? → _______________
3. What’s the **time complexity** of Linear Search? → _______________

---

## 📊 Comparison Summary

| Algorithm | Best Case | Worst Case | Stable? | Works on Unsorted Data? | Notes |
|------------|------------|------------|----------|--------------------------|-------|
| Bubble Sort | ____ | ____ | ____ | Yes | __________________ |
| Insertion Sort | ____ | ____ | ____ | Yes | __________________ |
| Selection Sort | ____ | ____ | ____ | Yes | __________________ |
| Linear Search | ____ | ____ | N/A | Yes | __________________ |

---

## 💬 Reflection
1. Which algorithm was **easiest** to understand and why?  
   → ____________________________________________

2. Which algorithm is **most efficient** for large data sets?  
   → ____________________________________________

3. Which one would you use for a **sorted array** search instead of Linear Search?  
   → ____________________________________________

---

**Instructor:** __________________________  
**Student Name:** ________________________  
**Date:** ________________________________
