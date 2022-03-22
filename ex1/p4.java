/*Write a program that accepts three numbers from the user and prints 
"increasing" if the numbers are in increasing order, "decreasing" if the 
numbers are in decreasing order, and "Neither increasing or decreasing order" 
otherwise.*/

import java.util.*;
class p4{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter 3 Numbers: ");
            //TAKING 3 NUMBERS FROM USER
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
             System.out.print("\n");
             System.out.print("OUTPUT\n");
             System.out.print("________\n");
              System.out.print("\n");
            
            if(a>b && b>c)// CHECKING A>B>C
            {
              System.out.print("The Numbers are in decreasing order... \n");
             
              
            } 
           else if(a<b && b<c)//CHECKING A<B<C
           {
            System.out.print("The Numbers are in increasing order... \n");
              
           }
           else
          {
           System.out.print("The Numbers are neither in increasing or decreasing order... \n");
          }
         }
}
/*
INPUT
_____

Enter 3 Numbers: 1 2 3

OUTPUT
________

The Numbers are in increasing order...

INPUT
_____

Enter 3 Numbers: 3 2 1

OUTPUT
________

The Numbers are in decreasing order...


INPUT
_____

Enter 3 Numbers: 1 3 2

OUTPUT
________

The Numbers are neither in increasing or decreasing order...

*/