package models;

public class Budget
{
    private String category;
    private double budgetLimit;
    private double remainingBudget;

    /*public boolean isExceeded(double spentAmount)
    {
        return spentAmount > budgetLimit;
    }*/

    public void remainingBudget(double spentAmount)
    {
        remainingBudget = budgetLimit - spentAmount;
    }

    public void setCategory(String Category)
    {
        this.category = category;
    }
    public void setBudgetLimit(double budgetLimit)
    {
        this.budgetLimit = budgetLimit;
        this.remainingBudget = budgetLimit;
    }

    public String getCategory()
    {
        return category;
    }
    public double getBudgetLimit()
    {
        return budgetLimit;
    }
    public double getRemainingBudget()
    {
        return remainingBudget;
    }
}
