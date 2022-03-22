//Write a program in Java to display the cube of the number up to a given 
//integer
import java.util.*;//IMPORTING CLASS FOR USER INPUT
class p2{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
             System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter Limit of Number: ");
             System.out.print("\n");
            
            int n=s.nextInt();//TAKING USER INPUT
            System.out.print("OUTPUT\n");
             System.out.print("______ \n");
              System.out.print("\n");
             System.out.print("The Cubes of numbers upto the range are \n");
              
            
            for(int i=1;i<=n;i++)//LOOP TO ITERATE IN THE RANGE
            {

            System.out.println(i+" cube: "+(i*i*i));//PRINTING CUBE
            }
         }
}

/*
INPUT
_____

Enter Limit of Number: 3

OUTPUT
______

The Cubes of numbers upto the range are

1 cube: 1
2 cube: 8
3 cube: 27
*/