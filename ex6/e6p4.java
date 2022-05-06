import java.util.*;
import Graphics.*;//importing graphics package
class e6p4
{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);
    while(true){
    System.out.println("1.Rectangle\n2.Square\n3.Triangle\n4.Circle\n5.EXIT\n\nEnter choice : ");
    int ch=s.nextInt();
    if(ch==5){System.out.println("EXITING... ");break;}
    switch(ch)
    {
       case 1:System.out.println("Enter Length and breadth of Rectangle:");
              a=s.nextInt();
              b=s.nextInt();
              Rectangle obj1=new Rectangle();//creating objest for class in package
               obj1.area(a,b);
              break;
       case 2:System.out.println("Enter Length of Square:");
              c=s.nextInt();
              Square obj2=new Square();
 
              obj2.area(c,1);
              break;
       case 3:System.out.println("Enter base and height of Triangle : ");
              x=s.nextInt();
              y=s.nextInt();
              Triangle obj3=new Triangle();
              obj3.area(x,y);
              break;
       case 4:System.out.println("Enter Radius of Circle :");
               r=s.nextInt();
              Circle obj4=new Circle();
              obj4.area(r,1);
              break;
      
       default:System.out.println("INVALID OPTION...");
    } 
    }
  } 

}


/*
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
1
Enter Length and breadth of Rectangle:
2 3
AREA OF RECTANGLE : 6
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
2
Enter Length of Square:
5
AREA OF SQUARE : 25
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
3
Enter base and height of Triangle : 
4 5
AREA OF TRIANGLE : 10.0
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
4
Enter Radius of Circle :
3
AREA OF CIRCLE : 28.26
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
5
EXITING... 




*/
