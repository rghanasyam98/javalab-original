package Graphics;
import java.util.*;
interface figure{
  public void area(int a,int b);
}

class Rectangle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF RECTANGLE : "+ (a*b));
  }

}

 class Square implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF SQUARE : "+  (a*a));
  }

}

 class Triangle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF TRIANGLE : "+  (a*b*0.5));
  }

}

 class Circle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF CIRCLE : "+  (a*a*3.14));
  }

}
