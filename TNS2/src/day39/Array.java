package day39;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Array extends Frame {
	int[] x;
	int[] y;
	int i;
	public Array()
	{
		x=new int[7];
		y=new int[7];
		for(i=0;i<x.length;i++)
		{
			x[i]= (int) (Math.random());
			y[i]=(int) (Math.random());
		}
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,600);
		setVisible(true);
	}
	public void paint(Graphics g, Object brue)
	{
		g.drawPolygon(x, y, 5);
		g.setColor((Color) brue);
	}
	
	public static void main(String[] args) {
		new Array();

	}

}
