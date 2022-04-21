package com.appletto.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame13 extends Frame{
		public Frame13() {
			setLayout(new FlowLayout());
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(400, 600);
			setVisible(true);
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();
					
				}

			
			});
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
