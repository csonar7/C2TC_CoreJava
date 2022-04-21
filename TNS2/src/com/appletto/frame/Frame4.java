package com.appletto.frame;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame4 extends Frame{
	
		Button b1,b2;
		TextField t;
		public Frame4()
		{
			setLayout(new FlowLayout());
			add(b1=new Button("click"));
			add(t=new TextField(15));
			add(b2=new Button("Clear"));
			b1.addActionListener(new ActionListener() {//this is Anonymous method

				public void actionPerformed(ActionEvent e) {
					t.setText("We perform Anonymous Method");
					
				}
				
			});
			b2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					t.setText("");
				}
				
			});
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
					
				}
			});
			setSize(200,300);
			setVisible(true);
		}
		
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame4();
		
	}

}
