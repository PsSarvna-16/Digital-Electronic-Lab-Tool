// ----------Source Code (Converter.java)---------------- 

package MyProject.Converter;

import javax.swing.*;
import java.awt.event.*;


public class Converter{
	public static void main(String []args){

		    JFrame window=new JFrame("Base Conveter");

		    JButton bin_b,oct_b,dec_b,hex_b,res_b,close_b;
		    bin_b=new JButton("Convert");
		    oct_b=new JButton("Convert");
		    dec_b=new JButton("Convert");
		    hex_b=new JButton("Convert");
		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
		    bin_b.setBounds(250,55,100,30);
		    oct_b.setBounds(250,105,100,30);
		    dec_b.setBounds(250,155,100,30);
		    hex_b.setBounds(250,205,100,30);
		    res_b.setBounds(130,260,80,30);
		    close_b.setBounds(260,260,80,30);
			window.add(bin_b);window.add(oct_b);window.add(dec_b);window.add(hex_b);window.add(res_b);window.add(close_b);  

			JTextField bin_field,oct_field,dec_field,hex_field;
			bin_field=new JTextField();
			oct_field=new JTextField();
			dec_field=new JTextField();
			hex_field=new JTextField();
			bin_field.setBounds(100,55, 140,30);
			oct_field.setBounds(100,105, 140,30);  
			dec_field.setBounds(100,155, 140,30);  
			hex_field.setBounds(100,205, 140,30);  
			window.add(bin_field); window.add(oct_field);  window.add(dec_field); window.add(hex_field); 
			
			JLabel bin_lab,oct_lab,dec_lab,hex_lab;
			bin_lab=new JLabel("Binary");
			oct_lab=new JLabel("Octal");
			dec_lab=new JLabel("Decimal");
			hex_lab=new JLabel("Hex"); 
		    bin_lab.setBounds(40,55, 100,30);
		    oct_lab.setBounds(40,105, 100,30);  
		    dec_lab.setBounds(40,155, 100,30);  
		    hex_lab.setBounds(40,205, 100,30); 
		    window.add(bin_lab);window.add(oct_lab);window.add(dec_lab);window.add(hex_lab);

			window.setSize(420,370);
			window.setLayout(null);
			window.setVisible(true);

		    bin_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){
		    			String bin = bin_field.getText();
		    			try{
							oct_field.setText(Integer.toString(Integer.parseInt(bin, 2),8));
							dec_field.setText(Integer.toString(Integer.parseInt(bin, 2),10));
							hex_field.setText(Integer.toString(Integer.parseInt(bin, 2),16));
						}catch(Exception a){
							oct_field.setText("Invalid input");
							dec_field.setText("Invalid input");
							hex_field.setText("Invalid input");
						}
				}
			});

		    oct_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
		    			String oct = oct_field.getText();
		    			try{
							bin_field.setText(Integer.toString(Integer.parseInt(oct, 8),2));
							dec_field.setText(Integer.toString(Integer.parseInt(oct, 8),10));
							hex_field.setText(Integer.toString(Integer.parseInt(oct, 8),16));
						}catch(Exception a){
							bin_field.setText("Invalid input");
							dec_field.setText("Invalid input");
							hex_field.setText("Invalid input");
						}
				} 
			});

		    dec_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
		    			String dec = dec_field.getText();
		    			try{
							bin_field.setText(Integer.toString(Integer.parseInt(dec, 10),2));
							oct_field.setText(Integer.toString(Integer.parseInt(dec, 10),8));
							hex_field.setText(Integer.toString(Integer.parseInt(dec, 10),16));
						}catch(Exception a){
							oct_field.setText("Invalid input");
							bin_field.setText("Invalid input");
							hex_field.setText("Invalid input");
						}
				} 
			});

		    hex_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
		    			String hex = hex_field.getText();
		    			try{
							bin_field.setText(Integer.toString(Integer.parseInt(hex, 16),2));
							oct_field.setText(Integer.toString(Integer.parseInt(hex, 16),8));
							dec_field.setText(Integer.toString(Integer.parseInt(hex, 16),10));
						}catch(Exception a){
							oct_field.setText("Invalid input");
							dec_field.setText("Invalid input");
							bin_field.setText("Invalid input");
						}
				} 
			}); 

		    res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin_field.setText("");
						hex_field.setText("");
						oct_field.setText("");
						dec_field.setText("");
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