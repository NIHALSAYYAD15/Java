//Implement following GUI program to demonstrate Itemevent. bold & italic
//14

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class cbdemo extends JFrame implements ItemListener
{
   JTextField t1;
  JCheckBox b1,b2,b3;
  public cbdemo()
  {
	setTitle("Checkbox demo");        
            t1=new JTextField(" Welcome to JAVA",20);
            Font f= new Font("Verdana", Font.PLAIN, 18);
	t1.setFont(f);
	b1=new JCheckBox("BOLD");
	b2=new JCheckBox("ITALIC");	
            b1.addItemListener(this);
 	b2.addItemListener(this);

	setSize(500,500);
	setLayout(new FlowLayout());	
	add(b1); 
	add(b2); 
	add(t1);	
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }

public void itemStateChanged(ItemEvent e)
 {   int a,b;
a=((b1.isSelected())?Font.BOLD:Font.PLAIN);
b=((b2.isSelected())?Font.ITALIC:Font.PLAIN);	
Font f1=new Font("Verdana", a+b, 18);
t1.setFont(f1);
 }
 public static void main(String args[])
 {
     cbdemo r=new cbdemo();
 }
}


