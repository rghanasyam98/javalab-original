package Graphics;
import java.util.*;
interface figure{
  public void area(int a,int b);
}


public class Circle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF CIRCLE : "+  (a*a*3.14));
  }

}
