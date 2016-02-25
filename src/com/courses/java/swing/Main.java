package com.courses.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        MyForm myform = new MyForm();
    }
}

class MyForm extends JFrame{
    private JTextArea textArea;
    private JButton button;

    public MyForm() throws HeadlessException {
        super("SomeForm");
        setSize(200,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        button = new JButton("PushMe");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("sup\n");
//                textArea.setText("Fuuuuuuuuuuuuuuuuu");
            }
        });
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
