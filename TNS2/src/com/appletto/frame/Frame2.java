package com.appletto.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Frame2 extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t;
	public Frame2() 
	{
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Cancel"));
		b1.addActionListener(this);
		//A a=new A();
		b2.addActionListener(new A());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		t.setText("Hello...!!");
		
	}
		
		
class A implements ActionListener   //Inner class
	{ 
		public A()
		{
			b2.addActionListener(this);
		}
	
		public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				
			}
		}




	public static void main(String[] args) {
		
		new Frame2();
	}

}
