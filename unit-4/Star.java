/* Write a program to draw star using java   */
import java.applet.*;
import java.awt.*;

/*<applet code= "Star.java" width=700 height=900></applet>*/
public class Star extends Applet{
    public void paint(Graphics g){
        g.drawLine(350,30,150,500); 
        g.drawLine(350,30,500,500); 
        g.drawLine(600,200,150,500); 
        g.drawLine(50,200,500,500); 
        g.drawLine(50,200,600,200); 
    }
}
