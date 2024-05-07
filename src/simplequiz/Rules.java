
package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rules extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(310, 50, 700, 600);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Quiz");
        l1.setForeground(Color.CYAN);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 40, 600, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(30, 100, 650, 350);
        l2.setText(
                "<html>"+
	"1. Only 10 questions will be inside the test and all questions are compulsory." + "<br><br>" +
	"2. A student gets 15 seconds to answer the question intended for it." + "<br><br>" +
	"3. If a student cannot answer a question they can pass it or after 15 seconds it gets automatically passed to the next question." + "<br><br>" +
	"4. There is no negative marking for wrong answer." + "<br><br>" +
	"5. Only you can use a 50-50 lifeline inside the test." + "<br><br>" +
	"6. The students can not discuss before giving the answer." + "<br><br>" +
    "</html>"



        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,470, 90, 28);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(410,470, 90, 28);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            this.setVisible(false);
            new SimpleQuiz().setVisible(true);
        }else if(e.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
    
}
