package UI;

import models.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBudgetUI extends JFrame
{
    private User user;
    JLabel categoryLabel,budgetLimitLabel,indicator;
    JTextField categoryField,budgetLimitField;
    JButton addButton;

    AddBudgetUI(User u)
    {
        this.user = u;

        setTitle("Add Budget");

        setLayout(new GridLayout(3,2,15,20));

        categoryLabel = new JLabel("Category");
        budgetLimitLabel = new JLabel("Budget Limit");
        indicator = new JLabel("");

        categoryField = new JTextField();
        budgetLimitField = new JTextField();
        addButton = new JButton("Add Budget");

        add(categoryLabel);
        add(categoryField);

        add(budgetLimitLabel);
        add(budgetLimitField);

        add(indicator);
        add(addButton);

        ActionListener addBudget = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String category = categoryField.getText();
                double budgetLimit = Double.parseDouble(budgetLimitField.getText());

                user.addBudget(category,budgetLimit);

                categoryField.setText("");
                budgetLimitField.setText("");
                indicator.setText("Your budget have been added");
            }
        };

        addButton.addActionListener(addBudget);

        setSize(450, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
