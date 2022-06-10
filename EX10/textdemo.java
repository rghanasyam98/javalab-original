//program to draw shapes according to user choice
import java.awt.*;
import java.awt.event.*;

public class textdemo extends Frame implements ActionListener {//implementing ItemListener for item click event
    Button GetMax;
    String str="";
    TextField n1,n2,n3;
    public textdemo() {

     // Use a flow layout.
     setLayout(new FlowLayout());
      // Create  button
     GetMax = new Button("Getmax"); 

       Label one = new Label("Enter First Number"); 
       Label two = new Label("Enter Second Number"); 
       Label three = new Label("Enter Third Number"); 
     
        n1 = new TextField(10);
        n2=new TextField(10);
        n3=new TextField(10);     

     // Add labels to frame.
    add(one);
     add(n1); 
    add(two);
    add(n2); 
     add(three);
     add(n3); 

   add(GetMax);
      
         // Add action listeners for the buttons.
         GetMax.addActionListener(this);

            addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
         System.exit(0);
             }
           });
 }

        // Handle button action events. 
       public void actionPerformed(ActionEvent ae) {
       
         int a=Integer.parseInt(n1.getText()); 
         int b=Integer.parseInt(n2.getText()); 
         int c=Integer.parseInt(n3.getText());  
         if(a>b && a>c){
              str=Integer.toString(a);  
           }
         if(b>a && b>c){
              str=Integer.toString(b);  
           }
        if(c>a && c>b){
              str=Integer.toString(c);  
           }
          str="MAXIMAM IS "+str;
       repaint();

      }




public void paint(Graphics g) {
    
     g.drawString(str,200,200);
     str="";
    
}




   public static void main(String[] args) {
      textdemo appwin = new textdemo();
      //setting frame properties
    appwin.setSize(new Dimension(500, 500));
    appwin.setTitle("Maximam Of 3");
    appwin.setVisible(true);
  }
}
