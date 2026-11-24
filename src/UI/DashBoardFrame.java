package UI;

//import models.User;
import models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoardFrame extends JFrame
{
    private User user;

    JLabel addExp,showExp,addBud,showBud;
    JButton addExpBtn,showExpBtn,addBudBtn,showBudBtn;
    public DashBoardFrame(User u)
    {
        this.user = u;

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        /*addExp = new JLabel("Add Expences");
        showExp = new JLabel("Show All Expences");
        addBud = new JLabel("Add Budget");
        showExp = new JLabel("Show All Expences");*/

        addExpBtn = new JButton("Add Expences");
        showExpBtn = new JButton("Show All Expences");
        addBudBtn = new JButton("Add Budget");
        showBudBtn = new JButton("Show All Budget");

        addExpBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        showExpBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        addBudBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        showBudBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createVerticalStrut(25));
        add(addExpBtn);
        add(Box.createVerticalStrut(15));
        add(showExpBtn);
        add(Box.createVerticalStrut(15));
        add(addBudBtn);
        add(Box.createVerticalStrut(15));
        add(showBudBtn);
        add(Box.createVerticalStrut(15));

        //button functions

        ActionListener addExp = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new AddExpencesUI(user);
                //dispose();
            }
        };

        ActionListener addBud = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new AddBudgetUI(user);
                //dispose();
            }
        };

        ActionListener showExp = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new showExpenseUI(user);
            }
        };

        ActionListener showBud = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new showBudgetUI(user);
            }
        };

        addExpBtn.addActionListener(addExp);
        addBudBtn.addActionListener(addBud);
        showExpBtn.addActionListener(showExp);
        showBudBtn.addActionListener(showBud);


        //defaults
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
