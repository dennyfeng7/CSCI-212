/*
Name: Denny Feng
Task: Rainbow Drawing 
Description: Create a rainbow using JavaFX
*/


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

	public class Rainbow15347739 extends JPanel{
		//Customize sky blue and set difference between violent and indigo. 
		//RGB numbers received from Google. 
		final Color SKYBLUE = new Color(135, 206, 250);
		final Color VIOLET = new Color(238, 130, 238);
		final Color INDIGO = new Color(153, 50, 204);
		
		//Color order starting from bottom. The last two are CYAN to match the sky. 
		private Color rainbow[] = {SKYBLUE, SKYBLUE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

     
		public Rainbow15347739(){
			setBackground(SKYBLUE); 
		}
		
		public void paintComponent(Graphics graphics){
			super.paintComponent(graphics);

        int radius = 20;
        
        int middlexvalue = getWidth() / 2;
        int middleyvalue = getHeight() - 15;

        for (int count = rainbow.length; count > 0; count--) {
           graphics.setColor(rainbow[count - 1]);

           graphics.fillArc( middlexvalue - count * radius,
              middleyvalue - count * radius,
              count * radius * 2, count * radius * 2, 0, 180 );
        } 
     } 
	
		public static void main(String args[]){
			Rainbow15347739 showpicture = new Rainbow15347739();
			JFrame demo = new JFrame();

			demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			demo.add(showpicture);
			
			//Set Window to size 600, 300 
			demo.setSize(600, 300);
			
			//Makes application appear. 
			demo.setVisible(true);
		}
}