package models;
import models.Expenses;
import models.Budget;
import java.util.*;

public class User
{
    Scanner sc = new Scanner(System.in);
    private int userId;
    private String name;
    private String password;
    private ArrayList<Expenses> expenses = new ArrayList<>();
    private ArrayList<Budget> budget = new ArrayList<>();

    //setters
    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    //getters
    public int getUserId()
    {
        return userId;
    }
    public String getName()
    {
        return name;
    }
    public String getPassword()
    {
        return password;
    }

    public void addExpense()
    {
        Expenses E = new Expenses();

        //Amount,
        System.out.print("Enter your expense amount: ");
        double amount = sc.nextDouble();
        E.setAmount(amount);
        //Category,
        System.out.print("Enter your expense category: ");
        String category = sc.next();
        E.setCategory(category);
        //description,
        sc.nextLine();
        System.out.print("Enter your expense description: ");
        String description = sc.nextLine();
        E.setDescription(description);
        //date
        System.out.print("Enter the date(dd-mm-yyyy): ");
        String date = sc.next();
        E.setDate(date);


        expenses.add(E);
        System.out.println("Your expense has been added");
    }

    public void showExpenses()
    {
        System.out.println("All your expenses");
        int i = 1;
        for (Expenses expense : expenses)
        {
            System.out.println("--------Expense "+i+" --------");
            System.out.println("Amount: "+expense.getAmount());
            System.out.println("Category: "+expense.getCategory());
            System.out.println("Description: "+expense.getDescription());
            System.out.println("Date: "+expense.getDate());
            System.out.println("-----------------------\n");

            i++;
        }
    }


    public void addBudget()
    {
        Budget b = new Budget();

        //category
        System.out.print("Enter your budget category: ");
        String category = sc.next();
        b.setCategory(category);

        //budgetLimit
        System.out.print("Enter your your budgetLimit: ");
        double budgetLimit = sc.nextDouble();
        b.setBudgetLimit(budgetLimit);

        //creating and adding budget
        budget.add(b);
        System.out.println("Your budget has been added");
    }

    public void showBudget()
    {
        System.out.println("All your budgets");
        for (Budget b : budget)
        {
            System.out.println("Category: "+b.getCategory());
            System.out.println("Budget Limit: "+b.getBudgetLimit());
            System.out.println("Remaining Budget: "+b.getRemainingBudget());
        }
    }
}
