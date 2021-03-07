// ----------Source Code (Resistor.java)---------------- 

package MyProject.Resistor;

import javax.swing.*;
import java.awt.event.*;

public class Resistor{

	public static void main(String args[]){

		JFrame window = new JFrame("Resistor - Color code");

	    String colors[]={"0 Black","1 Brown","2 Red","3 Orange","4 Yellow","5 Green","6 Blue","7 Violet","8 Gray","9 White"};        
	    String tolerance[]={"None","Silver","Gold","Red","Brown"};        
	    
	    JComboBox<String> color_cb1 =new JComboBox<>(colors);    
	    JComboBox<String> color_cb2 =new JComboBox<>(colors);
	    JComboBox<String> color_cb3 =new JComboBox<>(colors);  
	    JComboBox<String> toler_cb1 =new JComboBox<>(tolerance);    
	    
	    color_cb1.setBounds(30,240,80,20);    
	    color_cb2.setBounds(130,240,80,20);	    
	    color_cb3.setBounds(220,240,80,20);
	    toler_cb1.setBounds(310,240,70,20);

	    window.add(color_cb1);window.add(color_cb2);window.add(color_cb3);window.add(toler_cb1);

	    JLabel resistor_op,toler_op;

	    resistor_op=new JLabel("0  Ohm");
	    toler_op=new JLabel("~ 0%");

	    resistor_op.setBounds(150,280, 100,30);
	    toler_op.setBounds(250,280,50,30);


	    window.add(resistor_op);window.add(toler_op);

	    JButton res_img,close_b;

	    res_img = new JButton(new ImageIcon("Images//res.png"));
	    res_img.setBounds(30,30,350,180);

	    close_b=new JButton("Close");
		close_b.setBounds(300,330,80, 20);

	    window.add(res_img);window.add(close_b);

		window.setSize(420,420);
		window.setLayout(null);
		window.setVisible(true);

	    color_cb1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
			String cb1 = color_cb1.getItemAt(color_cb1.getSelectedIndex());
	    	String cb2 = color_cb2.getItemAt(color_cb2.getSelectedIndex());
	    	String cb3 = color_cb3.getItemAt(color_cb3.getSelectedIndex());

	    	int first = Character.getNumericValue(cb1.charAt(0));
	    	int second = Character.getNumericValue(cb2.charAt(0));
	    	int third = Character.getNumericValue(cb3.charAt(0));
	    	double ans = second*(1*Math.pow(10,third));
			resistor_op.setText(first + "" + (int)ans  + " Ohm"  );
			}
		});

	    color_cb2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
			String cb1 = color_cb1.getItemAt(color_cb1.getSelectedIndex());
	    	String cb2 = color_cb2.getItemAt(color_cb2.getSelectedIndex());
	    	String cb3 = color_cb3.getItemAt(color_cb3.getSelectedIndex());

	    	int first = Character.getNumericValue(cb1.charAt(0));
	    	int second = Character.getNumericValue(cb2.charAt(0));
	    	int third = Character.getNumericValue(cb3.charAt(0));
	    	double ans = second*(1*Math.pow(10,third));
			resistor_op.setText(first + "" + (int)ans  + " Ohm"  );
			}
		});

	    color_cb3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
			String cb1 = color_cb1.getItemAt(color_cb1.getSelectedIndex());
	    	String cb2 = color_cb2.getItemAt(color_cb2.getSelectedIndex());
	    	String cb3 = color_cb3.getItemAt(color_cb3.getSelectedIndex());

	    	int first = Character.getNumericValue(cb1.charAt(0));
	    	int second = Character.getNumericValue(cb2.charAt(0));
	    	int third = Character.getNumericValue(cb3.charAt(0));
	    	double ans = second*(1*Math.pow(10,third));
			resistor_op.setText(first + "" + (int)ans  + " Ohm"  );
			}
		});
		
		toler_cb1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				String tr = toler_cb1.getItemAt(toler_cb1.getSelectedIndex());
				switch(tr){
					case "None":
						toler_op.setText("~ 20%");
						break;
					case "Silver":
						toler_op.setText("~ 10%");
						break;
					case "Gold":
						toler_op.setText("~ 5%");
						break;
					case "Red":
						toler_op.setText("~ 2%");
						break;
					case "Brown":
						toler_op.setText("~ 1%");
						break;
					default:
						toler_op.setText("~ 20%");
				}
			}
		});

	  	close_b.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
					window.setVisible(false);
					window.dispose();
					return;
			} 
		});
	}
}