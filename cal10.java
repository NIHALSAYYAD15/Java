//calculator using swing
//cal10

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cal10
{
 public static void main(String args[])
  {
   operation obj = new operation();
  }
 }
 class operation extends JFrame implements ActionListener
 {
   JTextField t1,t2,t3;
   JButton b1,b2,b3,b4,b5,b6;
   JLabel l1,l2,l3;
   public operation()
   {
     t1 = new JTextField(15);
     t2 = new JTextField(15);
     t3 = new JTextField(15);
     b1 = new JButton("+");
     b2 = new JButton("-");
     b3 = new JButton("*");
     b4 = new JButton("/");
     b5 = new JButton("%");
     b6 = new JButton("clear");
     l1 = new JLabel("Result");
     l2 = new JLabel("number 1");
     l3 = new JLabel("number 2");
     
     add(l2);
     add(t1);
     add(l3);
     add(t2);
     add(l1);
     add(t3);
     add(b1);
     add(b2);add(b3);add(b4);add(b5);add(b6);
      
      setLayout(new GridLayout(6,2));
      setVisible(true);
      setSize(400,400);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
    int num1 = Integer.parseInt(t1.getText());  
    int num2 = Integer.parseInt(t2.getText());
    int value =0;
    if(e.getSource()== b1)
       value = num1 + num2;
    if(e.getSource()== b2)
       value = num1 - num2;
    if(e.getSource() == b3)
       value = num1 * num2;
    if(e.getSource() == b4)
       value = num1 / num2;
    if(e.getSource() == b5)
       value = num1 % num2;
    if(e.getSource() == b6)
       value =0;
    t3.setText(value + " ");
    }
 }   

