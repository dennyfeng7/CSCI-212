/*
Name: Denny Feng
Task: Pyramid Drawing
Description: Draw a pyramid using JavaFX. 
*/




import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import javax.swing.JComponent; 
import java.awt.Canvas; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class Pyramid15347739 extends JPanel {

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;

	    
	    g2d.setColor(new Color(212, 212, 212));
	    
	    //Base or 12th Row
	    g2d.drawRect(80, 200, 30, 12);
	    g2d.drawRect(110, 200, 30, 12);
	    g2d.drawRect(140, 200, 30, 12);
	    g2d.drawRect(170, 200, 30, 12);
	    g2d.drawRect(200, 200, 30, 12);
	    g2d.drawRect(230, 200, 30, 12);
	    g2d.drawRect(260, 200, 30, 12);
	    g2d.drawRect(290, 200, 30, 12);
	    g2d.drawRect(320, 200, 30, 12);
	    g2d.drawRect(350, 200, 30, 12);
	    g2d.drawRect(380, 200, 30, 12);
	    g2d.drawRect(410, 200, 30, 12);
	    
	    //11th Row
	    g2d.drawRect(95, 188, 30, 12);
	    g2d.drawRect(125, 188, 30, 12);
	    g2d.drawRect(155, 188, 30, 12);
	    g2d.drawRect(185, 188, 30, 12);
	    g2d.drawRect(215, 188, 30, 12);
	    g2d.drawRect(245, 188, 30, 12);
	    g2d.drawRect(275, 188, 30, 12);
	    g2d.drawRect(305, 188, 30, 12);
	    g2d.drawRect(335, 188, 30, 12);
	    g2d.drawRect(365, 188, 30, 12);
	    g2d.drawRect(395, 188, 30, 12);
	    
	    //10th Row
	    g2d.drawRect(110, 176, 30, 12);
	    g2d.drawRect(140, 176, 30, 12);
	    g2d.drawRect(170, 176, 30, 12);
	    g2d.drawRect(200, 176, 30, 12);
	    g2d.drawRect(230, 176, 30, 12);
	    g2d.drawRect(260, 176, 30, 12);
	    g2d.drawRect(290, 176, 30, 12);
	    g2d.drawRect(320, 176, 30, 12);
	    g2d.drawRect(350, 176, 30, 12);
	    g2d.drawRect(380, 176, 30, 12);
	    
	    //9th Row
	    g2d.drawRect(125, 164, 30, 12);
	    g2d.drawRect(155, 164, 30, 12);
	    g2d.drawRect(185, 164, 30, 12);
	    g2d.drawRect(215, 164, 30, 12);
	    g2d.drawRect(245, 164, 30, 12);
	    g2d.drawRect(275, 164, 30, 12);
	    g2d.drawRect(305, 164, 30, 12);
	    g2d.drawRect(335, 164, 30, 12);
	    g2d.drawRect(365, 164, 30, 12);
	    
	    //8th Row
	    g2d.drawRect(140, 152, 30, 12);
	    g2d.drawRect(170, 152, 30, 12);
	    g2d.drawRect(200, 152, 30, 12);
	    g2d.drawRect(230, 152, 30, 12);
	    g2d.drawRect(260, 152, 30, 12);
	    g2d.drawRect(290, 152, 30, 12);
	    g2d.drawRect(320, 152, 30, 12);
	    g2d.drawRect(350, 152, 30, 12);
	    
	    //7th Row
	    g2d.drawRect(155, 140, 30, 12);
	    g2d.drawRect(185, 140, 30, 12);
	    g2d.drawRect(215, 140, 30, 12);
	    g2d.drawRect(245, 140, 30, 12);
	    g2d.drawRect(275, 140, 30, 12);
	    g2d.drawRect(305, 140, 30, 12);
	    g2d.drawRect(335, 140, 30, 12);
	    
	    //6th Row
	    g2d.drawRect(170, 128, 30, 12);
	    g2d.drawRect(200, 128, 30, 12);
	    g2d.drawRect(230, 128, 30, 12);
	    g2d.drawRect(260, 128, 30, 12);
	    g2d.drawRect(290, 128, 30, 12);
	    g2d.drawRect(320, 128, 30, 12);
	    
	    //5th Row
	    g2d.drawRect(185, 116, 30, 12);
	    g2d.drawRect(215, 116, 30, 12);
	    g2d.drawRect(245, 116, 30, 12);
	    g2d.drawRect(275, 116, 30, 12);
	    g2d.drawRect(305, 116, 30, 12);

	    
	    //4th Row
	    g2d.drawRect(200, 104, 30, 12);
	    g2d.drawRect(230, 104, 30, 12);
	    g2d.drawRect(260, 104, 30, 12);
	    g2d.drawRect(290, 104, 30, 12);
	    
	    //3rd Row
	    g2d.drawRect(215, 92, 30, 12);
	    g2d.drawRect(245, 92, 30, 12);
	    g2d.drawRect(275, 92, 30, 12);
	    
	    //2nd Row
	    g2d.drawRect(230, 80, 30, 12);
	    g2d.drawRect(260, 80, 30, 12);
	    
	    //1st Row
	    g2d.drawRect(245, 68, 30, 12);
	    


	    //g2d.setColor(new Color(31, 21, 1));
	    //g2d.fillRect(250, 195, 90, 60);

	  }

	  public static void main(String[] args) {
	    Pyramid15347739 rects = new Pyramid15347739();
	    JFrame frame = new JFrame("Rectangles");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(rects);
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	  }
	}