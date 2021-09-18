package model.controller;


import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.Style;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;
    JLabel l;
    JFrame f;

    MyFrame() {
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new FlowLayout());

        f = new JFrame();
        l = new JLabel();
        text te = new text();

        button = new JButton("Submit");
        button.addActionListener(this);
        button.addActionListener(te);
        button.setForeground(new Color( 0xFF855950,true));
        button.setBackground(new Color(0xFFE4D9D3, true));


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0xFF705A48, true));
        textField.setBackground(new Color(0xFFF4F4F4, true));
        textField.setCaretColor(Color.white);
        //textField.setText(" ");

        JPanel p = new JPanel();

        p.add(textField);
        p.add(button);
        p.add(l);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.setVisible(true);

//        this.add(button);
//        this.add(textField);
//        this.add(l);
//        this.pack();
//        this.setVisible(true);

        }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            // set the text of the label to the text of the field
            l.setText(textField.getText());

            // set the text of field to blank
            textField.setText("  ");
        }
    }
//        if(e.getSource()==button) {
//            l.setText("Welcome "+ textField.getText());
//            //button.setEnabled(false);
//            //textField.setEditable(false);
//        }

    }