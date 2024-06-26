package ProjetosProprios1.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FirstGUI{
        public static void main(String args[]) {
    
            //Creating the Frame
            JFrame frame = new JFrame("Chat Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

    
            //Creating the panel at bottom and adding components
            JPanel panel = new JPanel(); // the panel is not visible in output
            JLabel label = new JLabel("Enter Text");
            JTextField tf = new JTextField(10); // accepts upto 10 characters
            JButton send = new JButton("Send");
            JButton reset = new JButton("Reset");
            JButton mais = new JButton("+");
            JButton men = new JButton("-");
            JButton mult = new JButton("*");
            JButton div = new JButton("/");
            panel.add(label); // Components Added using Flow Layout
            panel.add(tf);
            panel.add(send);
            panel.add(reset);
            panel.add(mais);
            panel.add(men);
            panel.add(mult);
            panel.add(div);
    
            // Text Area at the Center
            JTextArea ta = new JTextArea();
    
            //Adding Components to the frame.
            frame.getContentPane().add(BorderLayout.SOUTH, panel);
            frame.getContentPane().add(BorderLayout.CENTER, ta);
            frame.setVisible(true);

            mais.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("oi");
                }
            });
        }
    }