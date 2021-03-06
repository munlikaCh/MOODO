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
import javafx.scene.image.Image;
import model.Item.Weapon;
import view.EquipPane;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;
    JLabel l;
    JFrame f;

    MyFrame() {

        f = new JFrame("Tell me about your story today!!");
        l = new JLabel();
        text te = new text();

        button = new JButton("Submit");
        button.addActionListener(this);
        button.addActionListener(te);
        button.setForeground(new Color( 0xFF855950,true));
        button.setBackground(new Color(0xFFE4D9D3, true));


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,14));
        textField.setForeground(new Color(0xFF705A48, true));
        textField.setBackground(new Color(0xFFF4F4F4, true));
        textField.setCaretColor(Color.white);

        JPanel p = new JPanel();
        p.add(textField);
        p.add(button);
        p.add(l);
        f.add(p);
        f.setSize(400, 300);
        f.setVisible(true);

        }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==button) {
                l.setText("Your story : "+textField.getText());
                textField.setText("");
            }
        }catch (Exception getS){
            textField.setText("");
        }
    }
    }