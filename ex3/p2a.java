//linear search
import java.util.*;
class p2a{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];//declaring array
             System.out.print("Enter the elements: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();//reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

             System.out.print("\n");
              System.out.print("OUTPUT\n");
             System.out.print("______ \n");
System.out.print("\n");             

              for( i=0;i<n;i++)
                {
                  if(a==arr[i])//comparing
                  {
                   System.out.print("ITEM FOUND AT INDEX "+i);
                   k=1;//setting flag
                    break;
                   }
          
                }
 if(k==0)
             {
               System.out.print("ELEMENT NOT FOUND....  ");
              }
             
}
}

/*
INPUT
_____

Enter Number of elements: 4
Enter the elements: 3 2 6 4
Enter the element to search: 3

OUTPUT
______

ITEM FOUND AT INDEX 0
C:\Users\GHANASYAM\javalab\ex3>java p2a
INPUT
_____

Enter Number of elements: 3
Enter the elements: 2 4 6
Enter the element to search: 1

OUTPUT
______

ELEMENT NOT FOUND....




*/











