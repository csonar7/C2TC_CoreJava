package day37;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AppletMouse extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	
	public void init ()
	{
		/*add(b1=new Button("Click"));
		b1.addMouseListener(null);*/
		
		addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseMoved(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				String i=String.valueOf(x);
				String j=String.valueOf(y);
				showStatus(i+","+j);
				
			}
		});
		
	}

}
