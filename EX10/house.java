import java.awt.*;
import java.awt.event.*;

public class house extends Frame  implements MouseListener, MouseMotionListener{

    int f=0;
    String msg = "";
   public house(){

            addMouseListener(this);
            addMouseMotionListener(this);
            addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent we){
                            System.exit(0);
             }
        });
     
   }

   public void mouseClicked(MouseEvent me) {
      msg=msg+"Mouse Clicked";
       f=1;
       repaint();
    }

   public void mouseEntered(MouseEvent me) {

  }

   public void mouseExited(MouseEvent me) {
   }

  public void mousePressed(MouseEvent me) {
  }
  public void mouseReleased(MouseEvent me) {

  }
  public void mouseDragged(MouseEvent me) {
   }

  public void mouseMoved(MouseEvent me) {
  }

 public void paint(Graphics g){
                g.setColor(Color.yellow);
             g.fillRect(150,400,500,300);
                if(f==0){
                 g.setColor(Color.blue);
              g.fillRect(370,539,70,160);
                }
             else{
                       g.setColor(Color.red);
              g.fillRect(370,539,70,160);
                f=0;

               }
                 int xpoints[]={100,690,380};
                 int ypoints[]={400,400,300};

                   int num=3;
                    g.setColor(Color.pink);
                    g.fillPolygon(xpoints,ypoints,num);
    }
 
  public static void main(String args[]){

   house win=new house();
    win.setSize(800,800);
   win.setTitle("Shapes...");
    win.setVisible(true);


}

 
}
