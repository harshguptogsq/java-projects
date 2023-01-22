
package quizgame;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
  
    JButton b1,b2;
    String username;
    
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome  " +username+" to Simple Minds ");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16 ));
        l2.setBounds(20, 90, 600, 350);
        l2.setText("<html>"+
	"1. You have to give answer point to point ." + "<br><br>" +
	"2. There is a timer of 15 second so you have to give the answer with in it ." + "<br><br>" +
	"3. Here all the questions are compulsory ." + "<br><br>" +
	"4. please do so quietly ." + "<br><br>" +
	"5. All Question have Four Options ." + "<br><br>" +
	"6. There is one Lifeline Button , one Submit Button and one Next Button ." + "<br><br>" +
	"7. If you Choose Lifeline Button then the do Wrong Options are disappear ." + "<br><br>" +
	"8. May you Enjoy this. Thank You . GOOD LUCK ... " + "<br><br>" +
"</html>");
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizGame().setVisible(true);
        }
        else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
  
}
