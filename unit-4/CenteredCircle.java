import java.applet.*; 
import java.awt.*; 
/*<applet code = "CenteredCircle.class" width = "700" height = "700"></applet> */ 
public class CenteredCircle extends Applet{
    public void paint(Graphics g){
        g.drawOval(0,0,250,250); 
        g.drawLine(0,125,250,125); // x1,y1, x2,y2 
        g.drawLine(125,0,125,250); 
        g.drawLine(125,0,125,250); 
        // g.drawLine(); 
    }
}


