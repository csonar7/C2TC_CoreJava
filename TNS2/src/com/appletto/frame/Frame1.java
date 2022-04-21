package com.appletto.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 extends Frame implements ActionListener{
	
	
		Button b1,b2,b3;
		TextField t;
		public Frame1()
		{
			setLayout(new FlowLayout());
			add(b1 = new Button("Click"));
			add(t = new TextField(15));
			add(b3 =new Button("ready"));
			add(b2 = new Button("Cancel"));
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
				
			});
			setSize(40,400);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			
			Object o = e.getSource();
			if(o.equals(b1))
				t.setText("Hello Mam...!");
			if(o.equals(b2))
				t.setText(" ");
			if(o.equals(b3))
				t.setText("Ready...!");
			
		}

	

public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Frame1();

	}
}
