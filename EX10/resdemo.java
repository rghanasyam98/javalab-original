//program to draw shapes according to user choice
import java.awt.*;
import java.awt.event.*;

public class resdemo extends Frame implements ActionListener {//implementing ItemListener for item click event
    Button res;
    int f=0,sum,k=0;
    String str="";
    float per;
    TextField n1,n2,n3,n4,n5;
    public resdemo() {

     // Use a flow layout.
     setLayout(new FlowLayout());
      // Create  button
     res = new Button("GET RESULT"); 
 
     
       Label one = new Label("Enter Marks of Maths"); 
       Label two = new Label("Enter Marks of CS"); 
       
       Label three = new Label("Enter Marks of Physics"); 
       Label four = new Label("Enter Marks of Chemistry"); 
       Label five = new Label("Enter Marks of English");

        n1 = new TextField(10);
        n2=new TextField(10);
        n3=new TextField(10); 
         n4 = new TextField(10);
        n5=new TextField(10);
     //adding items to frame
    
       add(one);
       add(n1);
       add(two);
       add(n2);
       add(three);
       add(n3);
       add(four);
       add(n4);
         add(five);
         add(n5);
      add(res);
     
   
    // Add action listeners for the buttons.
         res.addActionListener(this);
         
        addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
         System.exit(0);
             }
           });
 }

         public void actionPerformed(ActionEvent ae) {
          k=1;
         int a=Integer.parseInt(n1.getText()); 
         int b=Integer.parseInt(n2.getText()); 
         
         int c=Integer.parseInt(n3.getText()); 
         int d=Integer.parseInt(n4.getText()); 
         
         int e=Integer.parseInt(n5.getText()); 
         
         sum=(a+b+c+d+e);
         per=(float)(sum*0.2);

         if(sum<250){
              f=1;
              str="Better Luck Next Time";
               repaint();
            }

        else if(sum>=250){
              str="Eligible For Higher Studies";
              f=2;
              repaint();
            }
          else{}

         

      }

             

     public void paint(Graphics g) {
    

          if(k==1){
               g.setColor(Color.yellow);
          g.fillOval(400,100,140,140);//drawing circle
              g.setColor(Color.black);
          g.fillOval(430,150,20,20);//drawing circle
         g.fillOval(480,150,20,20);
         // Draw Arcs
       
        if(f==1){
         g.drawArc(440, 180, 60, 60, 0, 180);

                     g.setColor(Color.blue);
          g.drawString(str,250,250);
            }
         
          else if(f==2)
           {
              g.drawArc(440, 158, 60, 60, 180, 180);

                     g.setColor(Color.blue);
          g.drawString(str,280,250);

            }
            else{}
           //g.drawString(Integer.toString(sum),250,300);
           g.drawString("You got "+Float.toString(per)+"%",350,270);
          
      }
     }

     public static void main(String[] args) {
      resdemo appwin = new resdemo();
      //setting frame properties
    appwin.setSize(new Dimension(500, 500));
    appwin.setTitle("Maximam Of 3");
    appwin.setVisible(true);
  }
}



