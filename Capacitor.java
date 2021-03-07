// ----------Source Code (Capacitor.java)---------------- 

package MyProject.Capacitor;

import javax.swing.*;
import java.awt.event.*;

public class Capacitor{

	public static void main(String []args){

		JFrame window = new JFrame("Cermaic Capacitor");

		JLabel cap_lab,cap_op;
		cap_lab=new JLabel("   Capacitor Code : ");
	    cap_op=new JLabel("      0 pF"); 
	    cap_lab.setBounds(30,225,120,30);
	    cap_op.setBounds(270,225,100,30);
	    window.add(cap_lab);window.add(cap_op);

	    JTextField cap_field;
		cap_field = new JTextField();
		cap_field.setBounds(150,231,50,20);
		window.add(cap_field);

		JButton close_b,cap_img,convert_img;
		close_b =new JButton("Close");
		close_b.setBounds(160,300,80, 20);
		cap_img =new JButton(new ImageIcon("Images\\cap_img.jpg"));
		cap_img.setBounds(20,20,340,180);
		convert_img =new JButton(new ImageIcon("Images\\Convert.png"));
		convert_img.setBounds(220,229,25, 25);
		window.add(convert_img);window.add(close_b);window.add(cap_img);

		convert_img.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
				int code = Integer.parseInt(cap_field.getText());
				if(code>0 && code<999){
					int last_digit = code%10;
					double rem = code/10;
					if(last_digit>=0 && last_digit<=6){
						rem =rem*Math.pow(10,last_digit);
						int res = (int)rem;
						cap_op.setText(res + " pF");
					}
					else{
						cap_op.setText("Invalid");
					}
				}else{
						cap_op.setText("Invalid");
				}
			}catch(Exception a){
				cap_op.setText("Invalid");
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

		window.setSize(400,400);  
		window.setLayout(null); 
		window.setVisible(true); 
	}
}