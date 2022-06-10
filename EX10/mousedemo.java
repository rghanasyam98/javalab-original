//program for handling mouse events

import java.awt.*;
import java.awt.event.*;

public class mousedemo extends Frame implements MouseListener,MouseMotionListener{

           String msg="";

            int x=250,y=250;
        public mousedemo(){

              addMouseListener(this);
              addMouseMotionListener(this);
              addWindowListener(new WindowAdapter() {
                 public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                  });
         }

           public void mouseClicked(MouseEvent me){
                     msg=msg+"A Mouse Click";
                    repaint();
            }

          public void mouseEntered(MouseEvent me){
                    
                   msg=msg+"A Mouse Enter";

                    repaint();
            }

         public void mouseExited(MouseEvent me){
                    msg=msg+"A Mouse Exit";
                    repaint();
            }

         public void mouseDragged(MouseEvent me){
                     x=me.getX(); 
                     y=me.getY();
                    msg="Mouse Dragged"+"("+x+","+y+") ";
                    repaint();
            }


           public void mouseMoved(MouseEvent me){
                      x=me.getX(); 
                     y=me.getY();
                    msg="Mouse Moved"+"("+x+","+y+") ";
                    repaint();
            }
          public void mousePressed(MouseEvent me){
                    x=me.getX(); 
                     y=me.getY();
                    msg="Mouse Pressed"+"("+x+","+y+") ";
                    repaint();
            }
           public void mouseReleased(MouseEvent me){
                        x=me.getX(); 
                     y=me.getY();
                    msg="Mouse Released"+"("+x+","+y+") ";
                    repaint();
            }
 
             public void paint(Graphics g){
                g.drawString(msg,x,y);
            }

           public static void main(String[] args) {
               mousedemo appwin = new mousedemo();

                 appwin.setSize(new Dimension(300, 300));
                  appwin.setTitle("MouseEventDemo");
                    appwin.setVisible(true);
}
}















