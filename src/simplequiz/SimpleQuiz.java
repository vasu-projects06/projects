package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SimpleQuiz extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1;
    SimpleQuiz(){
        setBounds(210, 100, 900, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simplequiz/icons/Ready.jfif"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(-250, -50, 900, 500);
        add(l1);
        
        JLabel l2 = new JLabel("Simple Quiz");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(Color.CYAN);
        l2.setBounds(485, 80, 300, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(Color.MAGENTA);
        l3.setBounds(460, 195, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(610, 195, 190, 22);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(510, 270, 110, 27);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(680, 270, 110, 27);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
     
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
            
        }else{
            System.exit(0);  
        }
        
    }

    
    public static void main(String[] args) {
        new SimpleQuiz();
        
    }
    
}
