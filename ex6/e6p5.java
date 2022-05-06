import java.util.*;
import Arithmetic.*;//importing arithmetic package
class e6p5
{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);
   while(true){
    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\n\nEnter choice : ");
    int ch=s.nextInt();
   if(ch==5){System.out.println("EXITING... ");break;}
     System.out.println("Enter 2 Numbers for operation:");
              a=s.nextInt();
              b=s.nextInt();
    switch(ch)
    {
       case 1:
              add obj1=new add();//creating object of class in package
               obj1.fucn(a,b);
              break;
       case 2:
               sub obj2=new sub();
 
              obj2.fucn(a,b);
              break;
       case 3:
              mul obj3=new mul();
              obj3.fucn(a,b);
              break;
       case 4:
               if(b==0){System.out.println("Division not possible...");}
               else{div obj4=new div();
              obj4.fucn(a,b);}
              break;
       default:System.out.println("INVALID OPTION...");
    } 
   }

  } 

}




/*
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
1
Enter 2 Numbers for operation:
2 2
SUM OF NUMBERS : 4
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
2
Enter 2 Numbers for operation:
2 2
DIFFERENCE OF NUMBERS : 0
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
3
Enter 2 Numbers for operation:
2 2
PRODUCT OF NUMBERS : 4
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
4
Enter 2 Numbers for operation:
2 2
QUOTIENT : 1
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
5
EXITING...

*/
