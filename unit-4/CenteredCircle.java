import java.applet.*; 
import java.awt.*; 
/*<applet code = "CenteredCircle.class" width = "700" height = "700"></applet> */ 
public class CenteredCircle extends Applet{
    public void paint(Graphics g){
        Dimension d = getSize();         
        int x = d.width / 2; 
        int y = d.height / 2;
        int r = (int) (d.width * 0.4);  
        g.drawOval(x-r,y-r,2*r,2*r); 
 
    }
}


