package UI;

import UI.LoginFrame;
import models.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddExpencesUI extends JFrame
{
    private User user;

    JLabel amountLabel,categoryLabel,descriptionLabel,dateLabel,indicator;

    JTextField amountField,categoryField,descriptionField,dateField;
    JButton addButton;

    public AddExpencesUI(User u)
    {

        this.user = u;

        setTitle("Add Expense");

        setLayout(new GridLayout(5, 2, 10, 10));

        amountLabel = new JLabel("Amount:");
        categoryLabel = new JLabel("Category:");
        descriptionLabel = new JLabel("Description");
        dateLabel = new JLabel("Date:");
        indicator = new JLabel("");

        amountField = new JTextField();
        categoryField = new JTextField();
        descriptionField = new JTextField();
        dateField = new JTextField();

        addButton = new JButton("Add Expense");

        add(amountLabel);
        add(amountField);

        add(categoryLabel);
        add(categoryField);

        add(descriptionLabel);
        add(descriptionField);

        add(dateLabel);
        add(dateField);

        add(indicator); // Empty cell
        add(addButton);

        //button functionality
        ActionListener addExpences = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double amt = Double.parseDouble(amountField.getText());
                String cat = categoryField.getText();
                String desc = descriptionField.getText();
                String date = dateField.getText();

                user.addExpense(amt,cat,desc,date);

                amountField.setText("");
                categoryField.setText("");
                descriptionField.setText("");
                dateField.setText("");
                indicator.setText("Your expences have been added");
            }
        };

        addButton.addActionListener(addExpences);

        setSize(450, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
