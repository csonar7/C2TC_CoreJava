// main class & one outer class

package com.appletto.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameOuter3 extends Frame implements ActionListener
{
	Button b1, b2;
	TextField t;
	
	public FrameOuter3()
	{
		setLayout(new FlowLayout());
		
		add(b1 = new Button(" Click "));
		add(t = new TextField(20));
		add(b2 = new Button(" Clear "));
		
		// register component buttons with listener
		b1.addActionListener(this);
		
		B b= new B(this);
		b2.addActionListener(b);
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameOuter3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText("Hello");
	}
}
class B implements ActionListener
{
	FrameOuter3 fo ;
	
	B(FrameOuter3 fo)
	{
		this.fo = fo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fo.t.setText(" ");
	}
}
