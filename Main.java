// ----------Source Code (Main.java)---------------- 

package MyProject;

import MyProject.Converter.*;
import MyProject.Resistor.*;
import MyProject.Capacitor.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		JFrame window=new JFrame("Lab Basic Tool");

		JButton converter_b,resistor_b,capacitor_b,exit_b;

		converter_b = new JButton("Base Converter");
	    converter_b.setBounds(50,50,150,40);  

		resistor_b = new JButton("Resistor ColorCode");
	    resistor_b.setBounds(50,100,150, 40);

		capacitor_b = new JButton("Ceramic Capacitor");
	    capacitor_b.setBounds(50,150,150, 40);

		exit_b = new JButton("Exit");
	    exit_b.setBounds(100,250,60,20);

	    window.add(converter_b);window.add(resistor_b);window.add(capacitor_b);window.add(exit_b);

		window.setSize(260,350);
		window.setLayout(null);
		window.setVisible(true);

	    converter_b.addActionListener(new ActionListener(){ 
	    		public void actionPerformed(ActionEvent e){ 
						Converter.main(null);
	    		} 
		});

		resistor_b.addActionListener(new ActionListener(){ 
	    		public void actionPerformed(ActionEvent e){ 
						Resistor.main(null);
	    		} 
		});

		capacitor_b.addActionListener(new ActionListener(){ 
	    		public void actionPerformed(ActionEvent e){ 
						Capacitor.main(null);
	    		} 
		});

		exit_b.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
					window.setVisible(false);
					window.dispose();
					System.exit(0);
			} 
		});
		scan.nextInt();
		System.exit(0);
	}

}