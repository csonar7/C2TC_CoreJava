package com.appletto.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame12 extends Frame{
		Button b1,b2;
		TextField t;
		
		public Frame12() {
			setLayout(new FlowLayout());
			add(b1 = new Button("Click"));
			add(t = new TextField(15));
			add(b2 = new Button("Clear"));
			b1.addFocusListener(new FocusAdapter() {
	            @Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					t.setText("Hello World");
				}
				
			});
			b2.addFocusListener(new FocusListener() {

				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					t.setText("");
				}

				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(400, 600);
			setVisible(true);
			
}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame12();
	}

}
