package com.appletto.frame;

import java.awt.Button;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame9 extends Frame{
	
		TextField t1,t2,t3;
		Label l;
		Button b;
		public Frame9() {
			setLayout(new FlowLayout());
			add(t1 = new TextField(5));
			add(l = new Label("+"));
			add(t2 = new TextField(5));
			add(b = new Button("="));
			add(t3 = new TextField(5));
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(250, 350);
			setVisible(true);
		}
		public boolean action(Event e, Object o) {
			if(e.target.equals(b)) {
				String s1 = t1.getText();
				int i = Integer.parseInt(s1);
				String s2 = t2.getText();
				int j = Integer.parseInt(s2);
				int k = i+j;
				String s3 = String.valueOf(k);
				t3.setText(s3);
			}
			return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame9();
	}

}
