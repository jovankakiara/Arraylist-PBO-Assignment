# 🏦 Bank Management System 

A classic, object-oriented Java console application simulating an ATM system. Built with structured Java principles, array-based collection patterns, and interactive CLI interfaces.

---

## 📌 Features

* **Account Management**: Supports initial balance setup, real-time balance queries, deposits, and withdrawals.
* **Customer-Account Binding**: Pairs customer details with bank account instances.
* **Interactive ATM Menu**: Console menu driven by `java.util.Scanner`.
* **Safe Input Handling**: Input checks for valid menu selections and transaction logic.

---

## 🏗️ Architecture & Class Overview

The project consists of four separate Java source files:

| File Name | Role | Responsibilities |
| :--- | :--- | :--- |
| **`Account.java`** | Core Data Model | Manages balance state, handles `deposit()` and `withdraw()` operations with validation. |
| **`Customer.java`** | Entity Model | Stores personal details (`firstName`, `lastName`) and manages customer accounts via `ArrayList`. |
| **`Bank.java`** | Aggregator | Manages customer records and tracks global system statistics using static properties. |
| **`Main.java`** | Entry Point | Runs the interactive ATM console interface and processes user inputs via `Scanner`. |

---

## 🛠️ Requirements & Setup

### Prerequisites
* **Java Development Kit (JDK)**: Version 8 or higher.
* **Terminal / Command Prompt**.

### Compilation
Navigate to the source directory and compile all `.java` files simultaneously:

```bash
javac Account.java Customer.java Bank.java Main.java
```

### Execution
Run the driver class:

```bash
java Main
```

---

## 💻 Sample Console Output

```text
*****************************************
*      WELCOME TO GLOBAL SMART ATM      *
*****************************************

+---------------------------------------+
| Account Holder : Kiara Septi          |
+---------------------------------------+
| [1] Check Account Balance             |
| [2] Deposit Funds                     |
| [3] Withdraw Funds                    |
| [4] Exit / Return Card                |
+---------------------------------------+
>> Select Menu Option (1-4): 2

=========================================
   DEPOSIT TRANSACTION                 
=========================================
 Enter deposit amount: $150
 Processing transaction...
 [SUCCESS] Transaction completed!
 New Balance : $650.00
-----------------------------------------
```

---

## 📝 License
This project is developed for academic exploration under Object-Oriented Programming (OOP) coursework.