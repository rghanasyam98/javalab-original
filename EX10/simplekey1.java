import java.awt.*;
import java.awt.event.*;

public class simplekey1 extends Frame implements KeyListener{

        String msg="";
        String keystate="";
        public simplekey1(){
                   addKeyListener(this);
                   //addWindowListener(new MyWindowAdapter());
                  
                       addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent we){
                            System.exit(0);
             }
        });

           }

      //handle a key press
      public void keyPressed(KeyEvent ke){
                 keystate="key pressed";
                 repaint();
        }

      //handle a key release
      public void keyReleased(KeyEvent ke){
             keystate="key released";
              repaint();
            }

         //handle a key typed
          public void keyTyped(KeyEvent ke){
                   msg=msg+ke.getKeyChar();
                   repaint();
             }
              
         //display keystroke
          public void paint(Graphics g){

                   g.drawString(msg,20,100);
                   g.drawString(keystate,20,50);
             }

         public static void main(String args[]){
             
                  simplekey1 appwin=new simplekey1();
             
                appwin.setSize(new Dimension(300,300));
                appwin.setTitle("Mouse Events");
                appwin.setVisible(true);
          }

      }

/*class MyWindowAdapter extends WindowAdapter{
              public void windowClosing(WindowEvent we){
                  System.exit(0);
}

}*/






















     
