// Circle divided in 6 equal parts 
import java.applet.*;
import java.awt.*;
/*<applet code="CircleDiv" width=400 height=400></applet>*/
public class CircleDiv extends Applet {
 
    public void paint(Graphics g){ 
        g.drawOval(60,50,200,200); 
        g.drawLine(100,70,220,235);
        g.drawLine(260,150,60,150);
        g.drawLine(200,58,120,240);
    }
}
