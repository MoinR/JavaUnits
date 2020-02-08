// PROGRAM - 7 
import java.applet.*; 
import java.awt.*; 
/*<applet code = "a.java" width = "320" height = "120">
  <param name="n1" value=10> </param> 
  <param name="n2" value=20> </param> 
 </applet>*/ 
public class ParamApplet extends Applet{
    public void paint(Graphics g){
      g.drawString ("Hello World", 25, 50);
      int x = Integer.parseInt(getParameter("n1")) ; 
      int y = Integer.parseInt(getParameter("n2")) ; 
      int sum = x + y; 
      int avg = sum / 2; 
      g.drawString("Sum of numbers : "+sum + "\n Average : "+avg, 0,75); 

    }
}
