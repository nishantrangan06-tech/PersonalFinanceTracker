package UI;

import javax.swing.*;
import java.awt.*;

public class DashBoardFrame extends JFrame
{
    JLabel addExp,showExp,addBud,showBud;
    JButton addExpBtn,showExpBtn,addBudBtn,showBudBtn;
    public DashBoardFrame()
    {

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        /*addExp = new JLabel("Add Expences");
        showExp = new JLabel("Show All Expences");
        addBud = new JLabel("Add Budget");
        showExp = new JLabel("Show All Expences");*/

        addExpBtn = new JButton("Add Expences");
        showExpBtn = new JButton("Show All Expences");
        addBudBtn = new JButton("Add Budget");
        showBudBtn = new JButton("Show All Expences");

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

        //defaults
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
