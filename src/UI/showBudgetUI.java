package UI;

import models.Budget;
import models.Expenses;
import models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class showBudgetUI extends JFrame
{
    private User user;
    String [] column = {"Category","Budget Limit","Remaining Budget"};
    DefaultTableModel model = new DefaultTableModel(column,0);
    JTable Table = new JTable(model);
    Object[] obj;
    showBudgetUI(User u)
    {
        this.user = u;

        for(Budget bud: user.budget)
        {
            obj = new Object[]{bud.getCategory(),bud.getBudgetLimit(),bud.getRemainingBudget()};
            model.addRow(obj);
            Table = new JTable(model);

            JScrollPane scrollPane = new JScrollPane(Table);
            add(scrollPane);

            setSize(500, 500);
            setVisible(true);

        }
    }
}
