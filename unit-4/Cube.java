import java.applet.Applet; 
import java.awt.*;

/*
<applet code="Cube.java" height=600 width=600 > </applet>
*/
public class Cube extends Applet{
    public void paint(Graphics g){
        g.drawRect(20, 20, 200, 200);
        g.drawRect(60, 60, 200, 200);

        g.drawLine(20, 20, 60, 60);
        g.drawLine(220,20, 260, 60);
        g.drawLine(20, 220, 60, 260);
        g.drawLine(220, 220, 260, 260);

    }
    
}