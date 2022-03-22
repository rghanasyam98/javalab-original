/*Write a Java program to read a floating-point number and if the number is zero 
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the 
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000
*/
import java.util.*;//IMPORTING SCANNER CLASS
import java.lang.Math;//IMPORTING CLASSES FOR MATH OPERATIONS
class p1{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING NEW SCANNER CLASS OBJECT
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter a Number: ");
            
            float a=s.nextFloat();//TAKING A FLOATING POINT VALUE
           
             System.out.print("\n");
             System.out.print("OUTPUT\n");
             System.out.print("______ \n");
              System.out.print("\n");
            
            if(a==0)
            {
              System.out.print("You Entered A Zero... \n");
             
              
            } 
           if(a>0)
           {
                
                if (a<1){
                 System.out.print("SMALL POSITIVE... \n");}
                else if (a>100000){
                 System.out.print("LARGE POSITIVE... \n");}
                 else{
                System.out.print("You Entered a Positive Number... \n");}
              
           }
           else
          {  
            float b=Math.abs(a);//TAKING ABSOLUTE VALUE
           if (b<1){
                 System.out.print("SMALL NEGATIVE... \n");}
                else if (b>100000){
                 System.out.print("LARGE NEGATIVE... \n");}
                 else{
                System.out.print("You Entered a Negative Number... \n");}
          }
         }
}





/*
INPUT
_____

Enter a Number: -0.5

OUTPUT
______

SMALL NEGATIVE...


INPUT
_____

Enter a Number: -5555555

OUTPUT
______

LARGE NEGATIVE...
INPUT
_____

Enter a Number: 1.5

OUTPUT
______

You Entered a Positive Number...


INPUT
_____

Enter a Number: 0.5

OUTPUT
______

SMALL POSITIVE...


INPUT
_____

Enter a Number: 8888888

OUTPUT
______

LARGE POSITIVE...
*/
