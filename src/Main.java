import models.User;
import java.util.*;

//import java.sql.SQLOutput;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        user.setUserId(000);
        user.setName("Admin");
        user.setPassword("01234");

        //System.out.println(user.getName()+"\n"+user.getUserId()+"\n"+user.getPassword()+"\n");

        do {
            if (user.logIn(user)) {
                System.out.println("Welcome, " + user.getName() + "\n\n");

                while (true)
                {

                    System.out.println("1.Add Expense\n" +
                            "2.Show Expenses\n" +
                            "3.Add Budget\n" +
                            "4.Show Budget\n" +
                            "5.Exit");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();

                    switch (choice)
                    {

                        case 1:
                            user.addExpense();
                            break;

                        case 2:
                            user.showExpenses();
                            break;

                        case 3:
                            user.addBudget();
                            break;

                        case 4:
                            user.showBudget();
                            break;

                        case 5:
                            System.out.println("Exiting\n");
                            System.exit(0);
                        default:
                            System.out.println("Invlaid choice");
                    }
                }
            }
            else
            {
                System.out.println("Wrong Password");
            }
        }while(true);
    }
}
