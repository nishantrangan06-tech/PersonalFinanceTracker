package models;

public class Expenses
{
    //private int id;
    private double amount;
    private String category;
    private String description;
    private String date;

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setDate(String date)
    {
        this.date = date;
    }



    public double getAmount()
    {
        return amount;
    }
    public String getCategory()
    {
        return category;
    }
    public String getDescription()
    {
        return description;
    }
    public String getDate()
    {
        return date;
    }
}
