package day37;
import java.applet.Applet;
import java.awt.event.*;  

public class Appletmouse2 extends Applet implements MouseListener,MouseMotionListener {    
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init()    
	  {    
	   addMouseListener(this);    
	   addMouseMotionListener(this);    
	  }    
	    
	  public void mouseClicked(MouseEvent e)    
	   {    
	    showStatus("mouse clicked : "+e.getX()+","+e.getY());    
	   }    
	     
	  public void mouseEntered(MouseEvent e)    
	   {    
	    showStatus("mouse entered : "+e.getX()+","+e.getY());    
	   
	   }    
	    
	  public void mouseExited(MouseEvent e)    
	   {    
	    showStatus("mouse exited : "+e.getX()+","+e.getY());    
	   }    
	    
	  public void mousePressed(MouseEvent e)    
	   {    
	    showStatus("mouse pressed : "+e.getX()+","+e.getY());    
	   }    
	    
	  public void mouseReleased(MouseEvent e)    
	   {       
	    showStatus("mouse released : "+e.getX()+","+e.getY());    
	   }    
	    
	  public void mouseMoved(MouseEvent e)    
	   {    
	    showStatus("mouse moved : "+e.getX()+","+e.getY());    
	   }    
	    
	  public void mouseDragged(MouseEvent e)    
	   {    
	    showStatus("mouse dragged : "+e.getX()+","+e.getY());    
	   }    
	}  

