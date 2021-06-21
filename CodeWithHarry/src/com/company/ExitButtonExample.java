package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ExitButtonExample extends JFrame
{
    public ExitButtonExample()
    {
        initUI();
    }

    private void initUI()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);

        JButton quitButton = new JButton("Exit");
        quitButton.setBounds(90, 60, 80, 30);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });

        panel.add(quitButton);

        setTitle("Exit Button Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                ExitButtonExample ex = new ExitButtonExample();
                ex.setVisible(true);
            }
        });
    }
}