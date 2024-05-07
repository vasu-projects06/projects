
package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Score extends JFrame implements ActionListener{
    
    Score(String username,int score){
       setBounds(350, 140, 600, 400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simplequiz/icons/pp.jpg"));
       JLabel l1 = new JLabel(i1);
       l1.setBounds(-55, 40, 400, 350);
       add(l1);
       
       JLabel l2 = new JLabel("Thankyou " + username + " for Playing SimpleQuiz");
       l2.setBounds(25, 30, 600, 45);
       l2.setFont(new Font("RALEWAY", Font.BOLD, 20));
       l2.setForeground(Color.BLACK);
       add(l2);
       
       JLabel l3 = new JLabel("Your Score is " + score);
       l3.setBounds(350, 180, 300, 30);
       l3.setFont(new Font("Jokerman", Font.PLAIN, 24));
       l3.setForeground(Color.GREEN);
       add(l3);
       
       JButton b1 = new JButton("Play Again");
       b1.setBackground(Color.BLUE);
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       b1.setBounds(390, 245, 100, 30);
       add(b1);
       
    }
    
    public void actionPerformed(ActionEvent e){
        this.setVisible(false);
        new SimpleQuiz().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
            
}
