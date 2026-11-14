package UI;

import models.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame
{
    User user;

    JLabel label;
    JTextField password;
    JButton submit;
    public LoginFrame(User u)
    {
        user = u;

        label = new JLabel("Enter Your password");
        password = new JTextField(20);
        submit = new JButton("Submit");

        add(label);
        add(password);
        add(submit);

        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(user.logIn(user,password.getText()))
                {
                    new DashBoardFrame();
                    dispose();
                }
            }
        };

        submit.addActionListener(al);

        //defaults
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
