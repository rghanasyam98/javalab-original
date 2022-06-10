//program to draw shapes according to user choice
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {//implementing ItemListener for item click event
    Choice shapes;
    String str="";

    public ChoiceDemo() {

     // Use a flow layout.
     setLayout(new FlowLayout());
      // Create choice lists.
     shapes = new Choice();//instantiating choice object
     

    // Add items to os list.
    shapes.add("Rectangle");
    shapes.add("Square");
    shapes.add("Triangle");
     shapes.add("Circle");

     add(shapes);

       // Add item listeners.
       shapes.addItemListener(this);

            addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
         System.exit(0);
             }
           });
 }

        public void itemStateChanged(ItemEvent ie) {
                 str=shapes.getSelectedItem();
             repaint();
}



public void paint(Graphics g) {
    if(str.equals("Rectangle")){
              g.setColor(Color.green);
           g.fillRect(400,100,300,200);//drawing rectangle

    }
   else if(str.equals("Square")){
               g.setColor(Color.blue);
                  
                g.fillRect(400,100,250,250);//drawing square

   }
  else if(str.equals("Triangle")){
         int xpoints[]={100,690,380};
                 int ypoints[]={400,400,300};

                   int num=3;
                    g.setColor(Color.pink);
                    g.fillPolygon(xpoints,ypoints,num);//drawing triangle

   }
  else if(str.equals("Circle")){
          g.setColor(Color.yellow);
          g.fillOval(400,100,140,140);//drawing circle

   }
 else{}

}




   public static void main(String[] args) {
      ChoiceDemo appwin = new ChoiceDemo();
      //setting frame properties
    appwin.setSize(new Dimension(500, 500));
    appwin.setTitle("ChoiceDemo");
    appwin.setVisible(true);
  }
}
