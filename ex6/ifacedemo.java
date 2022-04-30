//area of rectangle and circle using interface
import java.util.*;
interface shape{//defining interface
  //void input(int,int);
//defining abstract methods
 public void input();
  public void area();
 public  void perimeter();
}

class rectangle implements shape{//implementing

    int len,br;
    Scanner s=new Scanner(System.in);
  public   void input(){
       System.out.println("Enter length and breadth of rectangle:");
      len=s.nextInt();
       br=s.nextInt();
       
       
   }

  public  void area(){
     System.out.println("AREA OF SQUARE :"+(len*br));
    }

  public void perimeter(){
     System.out.println("PERIMETER OF SQUARE :"+(len+br)*2);
   }

}

class circle implements shape{//implementing

    int r;
    double pi=3.14;
    Scanner s=new Scanner(System.in);
 public   void input(){
         System.out.println("Enter radius of  circle:");
      r=s.nextInt();
       
   }

  public  void area(){
     System.out.println("AREA OF CIRCLE :"+(pi*r*r));
    }

  public void perimeter(){
     System.out.println("PERIMETER OF CIRCLE :"+(r*pi*2));
   }

}


class ifacedemo{
public static void main(String args[]){
    int a,b,r;
   Scanner s=new Scanner(System.in);
    System.out.println("1.RECTANGLE\n2.CIRCLE\nEnter choice:");
    int ch=s.nextInt();
    //create objects
    rectangle obj1=new rectangle();
    circle obj2=new circle();
   if(ch==1){
     
      obj1.input();
      obj1.area();
      obj1.perimeter();
    }
  else if(ch==2){
     
      obj2.input();
      obj2.area();
      obj2.perimeter();
    }
  else{System.out.println("INVALID OPTION.....");}
   

}

}

/*
1.RECTANGLE
2.CIRCLE
Enter choice:
1
Enter length and breadth of rectangle:
2 3
AREA OF SQUARE :6
PERIMETER OF SQUARE :10

1.RECTANGLE
2.CIRCLE
Enter choice:
2
Enter radius of  circle:
3
AREA OF CIRCLE :28.259999999999998
PERIMETER OF CIRCLE :18.84


*/




























