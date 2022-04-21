package com.appletto.frame;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame3 extends Frame{

		Button b1,b2;
		TextField t;
		
		public Frame3()
		{
			setLayout(new FlowLayout());
			add(b1=new Button("click"));
			add(t=new TextField(15));
			add(b2=new Button("Clear"));
			b1.addActionListener(new A());
			b2.addActionListener(new B());
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			setSize(200,400);
			setVisible(true);
		}

		class A implements ActionListener
		{
			public void actionPerformed(ActionEvent e) {
				t.setText("Hello EveryOne...!!");
				
			}
			
		}
		class B implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				t.setText(" ");
			}
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame3();
	}

}
