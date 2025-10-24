CS1500 Lab — From User Story to UML to Java
Course: Introduction to Programming with Java
Length: 1–2 weeks (out-of-class)
Deliverables: Problem statement, user story, noun/verb analysis, UML class diagram, Java program, test evidence

Overview
In this lab you will:

Identify a simple real‑world problem you want to solve.

Write a clear user story for that problem.

Extract the nouns and verbs from your user story to propose attributes and methods.

Design a UML class diagram with correct access modifiers and return types.

Implement your class (and a small driver) in Java, then demonstrate that it works.

This exercise mirrors a mini software design process: requirements → design → implementation → test.

Learning Objectives
By the end of this lab you will be able to:

Write a concise user story that captures a basic software requirement.

Identify nouns/verbs and map them to attributes/methods in an object model.

Create a UML class diagram with correct visibility (+, -, #), types, and method signatures.

Implement a well‑encapsulated Java class with appropriate access modifiers, return types, and simple input validation.

Demonstrate and explain your design choices.

Part A — Identify a Problem (≈1–2 paragraphs)
Choose a small, single‑purpose problem that can be solved by one main class. Keep scope realistic for a first‑semester course. Examples:

A StepCounter that tracks steps and resets daily.

A TipCalculator that computes tip and total.

A PomodoroTimer that starts/stops a countdown and reports remaining time.

A GradeTracker that stores one course’s three exam scores and reports the average.

Tip: Avoid multi‑class apps for this lab; stick to one main class + a tiny demo.

Deliverable (PDF): A paragraph describing your chosen problem and who will use it.

Part B — Write a User Story
Use the common template:

As a <type of user> I want <goal / action> so that <benefit / reason>.

Examples:

As a diner, I want to calculate a 20% tip so that I can quickly pay the correct total.

As a runner, I want to add my steps so that I can see if I met my daily goal.

Deliverable (PDF): A single user story for your problem.

(Optional, for extra clarity) Add 1–2 acceptance criteria in Given/When/Then form.

Part C — Nouns & Verbs → Attributes & Methods
Read your user story and:

List the nouns → likely attributes (fields) and sometimes the class name.

List the verbs → likely methods (behaviors).

Mapping Guide

Noun → attribute: “tip percentage” → tipPercent: double

Verb → method: “calculate total” → calculateTotal(): double

Deliverable (PDF): Two short bullet lists: nouns and verbs, followed by a table that maps each to a proposed attribute or method.

Part D — UML Class Diagram (1 class minimum)
Draw a UML class card for your design. Use this format:

ClassName
------------------------------
- attributeName: Type
- anotherAttribute: Type
------------------------------
+ methodName(paramName: Type): ReturnType
+ anotherMethod(): ReturnType
  Visibility: + public, - private, # protected
  Types: use Java types (int, double, boolean, String, etc.)
  Methods: give parameter names and return types. If a method doesn’t return a value, use void.

Deliverable: Image or neatly formatted text UML included in your PDF.

Part E — Implement in Java
Implement your UML as a Java class. Requirements:

Encapsulation: all attributes are private. Provide public methods as needed.

Constructor: initialize fields to sensible defaults.

Return types: match your UML.

Validation: check simple invalid inputs (e.g., division by zero).

Driver: create a small YourThingDemo class with main that demonstrates at least 3 method calls and prints results.

Deliverables:

YourThing.java and YourThingDemo.java (source files)

Screenshot or console transcript that shows your program running

What to Submit (to Canvas)
PDF with: problem statement, user story, nouns/verbs lists, noun→attribute & verb→method mapping, and UML diagram.

Source code: YourThing.java and YourThingDemo.java.

Run evidence: screenshot or copied console output showing at least 3 method calls producing expected results.

(Optional) A short note (2–5 sentences) reflecting on one design decision you made.

Filename suggestion: Lab_UserStory_UML_Java_<LastName>_<FirstName>.zip

Grading Rubric (100 pts)
Category	Excellent (Full)	Partial	None
Problem & User Story (15)	Clear, scoped, and actionable user story	Minor ambiguity or scope issues	Missing/unclear
Nouns/Verbs Mapping (15)	Accurate lists and thoughtful mapping	Some mismatches	Missing or incorrect
UML Diagram (25)	Correct visibility, types, and signatures	Minor mistakes	Missing/major errors
Java Class (30)	Correct encapsulation, methods, validation	Compiles with minor issues	Does not compile/incorrect
Demo & Evidence (10)	Demo exercises ≥3 methods w/ expected output	Incomplete demo	No demo
Code Style & Comments (5)	Readable names & comments	Minor style issues	Poor style/no comments
Student Worksheet (Template)
Copy this section into your write‑up and fill it in.

Problem (1–2 paragraphs):

User Story:
As a … I want … so that …

Nouns (candidate attributes/classes):
Verbs (candidate methods):
Mapping Table:

User‑story item	Design element
(noun/verb)	(attribute/method)
UML (class card):

ClassName
------------------------------
- ...: ...
------------------------------
+ ...(...: ...): ...
  Worked Example (for reference only) — Calculator
  Do not submit this example. It’s here to show the expected depth and format.

User Story
As a student, I want to perform running calculations so that I can quickly compute a result without re‑entering previous values.

Nouns & Verbs
Nouns → attributes: current value → currentValue: double

Verbs → methods: add, subtract, multiply, divide, clear, get current

UML
Calculator
---------------------------------
- currentValue: double
---------------------------------
+ Calculator()
+ add(value: double): double
+ subtract(value: double): double
+ multiply(value: double): double
+ divide(value: double): double
+ clear(): void
+ getCurrent(): double
  Java Implementation
  Calculator.java

/**
* A simple running calculator with an accumulator value.
  */
  public class Calculator {
  private double currentValue;

  /** Creates a calculator with an initial value of 0.0. */
  public Calculator() {
  this.currentValue = 0.0;
  }

  /** Adds a value to the current total and returns the new total. */
  public double add(double value) {
  currentValue += value;
  return currentValue;
  }

  /** Subtracts a value from the current total and returns the new total. */
  public double subtract(double value) {
  currentValue -= value;
  return currentValue;
  }

  /** Multiplies the current total by a value and returns the new total. */
  public double multiply(double value) {
  currentValue *= value;
  return currentValue;
  }

  /** Divides the current total by a value and returns the new total. */
  public double divide(double value) {
  if (value == 0.0) {
  throw new IllegalArgumentException("Cannot divide by zero");
  }
  currentValue /= value;
  return currentValue;
  }

  /** Resets the calculator to 0.0. */
  public void clear() {
  currentValue = 0.0;
  }

  /** Returns the current total. */
  public double getCurrent() {
  return currentValue;
  }
  }
  CalculatorDemo.java

public class CalculatorDemo {
public static void main(String[] args) {
Calculator calc = new Calculator();

        System.out.println("Start: " + calc.getCurrent());
        System.out.println("+10 -> " + calc.add(10));      // 10.0
        System.out.println("*3  -> " + calc.multiply(3));  // 30.0
        System.out.println("-5  -> " + calc.subtract(5));  // 25.0
        System.out.println("/5  -> " + calc.divide(5));    // 5.0
        calc.clear();
        System.out.println("clear -> " + calc.getCurrent()); // 0.0
    }
}
Expected Console Output (example)

Start: 0.0
+10 -> 10.0
*3  -> 30.0
-5  -> 25.0
/5  -> 5.0
clear -> 0.0
Checklist Before You Submit
My problem is small enough for one class and one main behavior.

My user story follows the As a/I want/so that format.

I extracted nouns and verbs and mapped them to attributes and methods.

My UML card shows correct visibility (+/-), types, and return types.

All fields are private; methods are public as needed.

My program compiles and the demo shows at least 3 method calls.

I included a screenshot or transcript of program output.

Academic Integrity
Write your own user story, UML, and code. You may discuss ideas with classmates, but the design and final code must be your own. If you consulted any sources (including AI), cite them briefly in your PDF.