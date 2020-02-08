// PROGRAM - 5
import java.applet.*; 
import java.awt.*; 
/*<applet code = "Drawing.class" width = "400" height = "400"></applet> */ 
public class Drawing extends Applet{
    public void paint(Graphics g){
        g.drawLine(20,20,320,20); 
        g.drawRect(25,80,360,80); 

        g.setColor(Color.pink); 
        g.fillOval(30,200,150,150);

    }
}
