package UI;

import models.Expenses;
import models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class showExpenseUI extends JFrame
{
    private User user;
    String [] column = {"amount","Category","Description","Date"};
    DefaultTableModel model = new DefaultTableModel(column,0);
    JTable Table = new JTable(model);
    Object[] obj;
    showExpenseUI(User u)
    {
        this.user = u;
        for(Expenses exp: user.expenses)
        {
            obj = new Object[]{exp.getAmount(),exp.getCategory(),exp.getDescription(),exp.getDate()};
            model.addRow(obj);
            Table = new JTable(model);

        }

        JScrollPane scrollPane = new JScrollPane(Table);
        add(scrollPane);

        setSize(500, 500);
        setVisible(true);

    }
}
