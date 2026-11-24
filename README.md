# FinanceFlow - Personal Finance Tracker

## Overview

FinanceFlow is a Java Swing-based Personal Finance Tracker developed as a mini project for Computer Science Engineering students. The application helps users manage their personal finances by tracking expenses, setting category-wise budgets, and monitoring remaining funds.

The project provides a simple graphical user interface built using Java Swing and follows Object-Oriented Programming principles such as encapsulation, abstraction, and modular design. It enables users to record expenses, create budgets for different categories, and view their financial information in a tabular format.

---

## Features

### User Authentication
- Secure login system
- Password validation

### Expense Management
- Add new expenses
- Record expense category, amount, and date
- Store multiple expenses per user

### Budget Management
- Add category-based budgets
- Set spending limits
- Automatically calculate remaining budget

### Data Visualization
- Display expenses using JTable
- Display budgets using JTable
- Organized dashboard for navigation

### GUI Features
- Java Swing-based user interface
- Dashboard with BoxLayout
- Forms using GridLayout
- Tabular data representation using JTable

---

## Technologies Used

- Java
- Java Swing
- ArrayList Collections
- Object-Oriented Programming (OOP)
- JTable
- GridLayout
- BoxLayout
- Git & GitHub

---

## Project Structure

```text
src
│
├── models
│   ├── User.java
│   ├── Expenses.java
│   └── Budget.java
│
├── UI
│   ├── LoginFrame.java
│   ├── DashBoardFrame.java
│   ├── AddExpenseUI.java
│   ├── AddBudgetUI.java
│   ├── ShowExpenseUI.java
│   └── ShowBudgetUI.java
│
└── Main.java
```

---

## Classes Description

### User
Handles user authentication and maintains lists of expenses and budgets.

### Expenses
Represents a financial transaction containing:
- Category
- Amount
- Date

### Budget
Represents a category-based budget containing:
- Category
- Budget Limit
- Remaining Budget

### LoginFrame
Provides user authentication and access to the system.

### DashBoardFrame
Acts as the main navigation screen.

### AddExpenseUI
Allows users to add new expenses.

### AddBudgetUI
Allows users to create budgets for spending categories.

### ShowExpenseUI
Displays all recorded expenses using JTable.

### ShowBudgetUI
Displays all budgets and remaining balances using JTable.

---

## How to Run

1. Clone the repository

```bash
git clone https://github.com/username/FinanceFlow.git
```

2. Open the project in your preferred Java IDE
   - IntelliJ IDEA
   - Eclipse
   - NetBeans

3. Compile and run:

```bash
Main.java
```

4. Login using the configured credentials.

---

## Learning Outcomes

Through this project, the team gained practical experience in:

- Java Swing GUI Development
- Event Handling
- Object-Oriented Programming
- Collections Framework
- JTable and Table Models
- Layout Managers
- Git Version Control
- Team Collaboration

---

## Future Enhancements

- SQLite Database Integration
- Expense Search and Filtering
- Monthly Reports
- Pie Charts and Graphs
- Export to PDF/Excel
- Multi-user Support
- Dark Mode UI

---

## License

This project is developed for educational and academic purposes.

