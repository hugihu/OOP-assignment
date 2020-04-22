/*
 * Author: Hugh O'Carroll-Macri
 * Date: 22/04/2020
 * C17316046
 * Naive Bayes classifier
 */
package com.ca.test;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class CA extends JFrame implements ActionListener 
{
	public static JComboBox		c1, c2, c3, c4, c5;
	private static JPanel 		panel;
	private static JLabel 		t, a, cough, sthroat, dz; 
	public static JButton		b1;
	public static String user1, user2, user3, user4, user5;
  
      
  
// constructor
   CA(String title) 
   {
  
	   super(title);
	   setSize(700,700);
	   setLayout(new GridLayout(5,2));
	   
       String s1[] = { "1)Select", "Normal", "Cool", "Hot" }; 
       String s2[] = {"2)Select", "Yes", "No"};
       String s3[] = {"3)Select", "Yes", "No"};
       String s4[] = {"4)Select", "Yes", "No"};
       String s5[] = {"5)Select", "Yes", "No"};
       String s6[] = {"Press for Results"};
 
	   
	   // create GUI comboboxs 
	   c1 	= new JComboBox(s1);
	   c2 	= new JComboBox(s2);
	   c3 	= new JComboBox(s3);
	   c4 	= new JComboBox(s4);
	   c5 	= new JComboBox(s5);
	   //add jbutton
	   b1	= new JButton("Submit");
	   //add action listener for the button press 
	   ActionListener filemanager = new FileManager();
	   b1.addActionListener(filemanager);
	   //Labels to show which boxes are are for which symptom 
       t = 			new JLabel("1) Select your temperature"); 
       a = 			new JLabel("2) Do you have aches?"); 
       cough = 		new JLabel("3) Do you have a cough"); 
       sthroat = 	new JLabel("4) Do you have a sore throat?"); 
       dz = 		new JLabel("5) Have you traveled from danger zone recently?"); 
       
       //Adding Gui components to panel
	   add(c1);
	   add(c2);
	   add(c3);
	   add(c4);
	   add(c5);
	   add(b1);

	   panel = new JPanel(new FlowLayout());
	   panel.add(t);
	   panel.add(a);
	   panel.add(cough);
	   panel.add(sthroat);
	   panel.add(dz);
	   panel.add(b1);
	   add(panel);

	   setVisible(true);
   }
		//Converting user entries to strings 
		public void actionPerformed(ActionEvent event) 
		{
		    if 	(event.getSource() == CA.b1)
		   	{
		    	user1 = (String) c1.getSelectedItem();
		    	user2 = (String) c2.getSelectedItem();
		    	user3 = (String) c3.getSelectedItem();
		    	user4 = (String) c4.getSelectedItem();
		    	user5 = (String) c5.getSelectedItem();
		    }
		}


}