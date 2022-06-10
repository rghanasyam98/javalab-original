//program for drawing shapes
import java.awt.*;
import java.awt.event.*;

public class colordemo extends Frame{

   public colordemo(){
            addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent we){
                            System.exit(0);
             }
        });
     
   }
//draw in different colors
public void paint(Graphics g){
  Color c1=new Color(255,100,100);
  Color c2=new Color(100,255,100);
  Color c3=new Color(100,100,255);

  g.setColor(c1);
  g.drawLine(100,10,400,10);
  g.setColor(c2);
  g.drawLine(100,20,400,20);
  
  //
  //g.drawLine(10,45,250,180);
   //g.drawLine(10,90,400,400);
 
  //g.setColor(c3);
  //g.drawLine(10,150,400,40);
  //g.drawLine(10,290,80,19);

  g.setColor(Color.green);
  g.drawOval(200,140,250,100);
  g.fillOval(200,250,140,140);

  
  g.setColor(Color.red);
  g.drawOval(230,40,90,60);
  g.drawRect(255,500,55,50);

   g.setColor(Color.cyan);
   g.fillRect(250,400,60,70);
    g.drawRoundRect(250,580,60,60,15,15);
  }

 public static void main(String args[]){

   colordemo win=new colordemo();
    win.setSize(800,800);
   win.setTitle("Shapes...");
    win.setVisible(true);


}
}
