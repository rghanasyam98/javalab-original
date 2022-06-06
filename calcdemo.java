//program to draw shapes according to user choice
import java.awt.*;
import java.awt.event.*;

public class calcdemo extends Frame implements ActionListener {//implementing ItemListener for item click event
    Button sum,diff,pro,div;
    String str="";
    int res;
    TextField n1,n2,n3;
    public calcdemo() {

     // Use a flow layout.
     setLayout(new FlowLayout());
      // Create  button
     sum = new Button("SUM"); 
    diff = new Button("DIFFERENCE"); 
   pro = new Button("PRODUCT"); 
   div = new Button("QUOTIENT"); 

       Label one = new Label("Enter First Number"); 
       Label two = new Label("Enter Second Number"); 
       Label three = new Label("RESULT"); 
     
        n1 = new TextField();
        n2=new TextField();
        n3=new TextField();     

     //adding items to frame
    add(one);
    add(n1);
    add(two);
    add(n2);
     add(sum);
       add(diff);
        add(pro);
        add(div);
       add(n3);

    // Add action listeners for the buttons.
         sum.addActionListener(this);
         diff.addActionListener(this);
         pro.addActionListener(this);
         div.addActionListener(this);

            addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
         System.exit(0);
             }
           });
 }

        public void actionPerformed(ActionEvent ae) {
       
         int a=Integer.parseInt(n1.getText()); 
         int b=Integer.parseInt(n2.getText()); 
        String str = ae.getActionCommand(); 
         if(str.equals("SUM")) { 
           res=a+b; 
           } 
         else if(str.equals("DIFFERENCE")) { 
          res=a-b; 
          } 
        else if(str.equals("PRODUCT")){ 
               res=a*b; 
         }  
         else if(str.equals("QUOTIENT")){ 
                res=a/b; 
         }  
        n3.setText(Integer.toString(res));
       repaint();

      }


    public void paint(Graphics g) {
    
        
      }

     public static void main(String[] args) {
      calcdemo appwin = new calcdemo();
      //setting frame properties
    appwin.setSize(new Dimension(500, 500));
    appwin.setTitle("Maximam Of 3");
    appwin.setVisible(true);
  }
}




















