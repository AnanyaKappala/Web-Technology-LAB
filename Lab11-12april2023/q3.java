/*Implement an applet which consists of two buttons named as RED and BLUE. When the user clicks RED button, a 
message “you have passed RED” will be displayed in the applet window. Similarly, when the user clicks BLUE button, 
a message “you have pressed BLUE” will be displayed in the applet window. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q3 extends JFrame implements ActionListener {
    JButton redButton, blueButton;
    JLabel messageLabel;

    public q3() {
        redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);
        
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        
        setTitle("Color Button Applet");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("You have pressed RED");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == blueButton) {
            messageLabel.setText("You have pressed BLUE");
            messageLabel.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new q3();
    }
}