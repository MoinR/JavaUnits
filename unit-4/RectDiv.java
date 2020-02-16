// Rectangle divided in 6 equal parts 
import java.applet.*;
import java.awt.*;
/*<applet code="RectDiv" width=400 height=400></applet>*/
public class RectDiv extends Applet {
 
    public void paint(Graphics g){ 
        g.drawRect(20,10,200,100);      
        g.drawLine(60,10,60,110);
        g.drawLine(100,10,100,110);    
        g.drawLine(140,10,140,110); 
        g.drawLine(180,10,180,110);       
        
    }
}
