//simple binary search

import java.util.*;
class p2b{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i;
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];//declaring array
               int k=0;
             System.out.print("Enter the elements in sorted order: ");
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
           
             int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
              if(a>arr[mid])//case of element is right of mid
               {
                 f=mid+1;
                 mid=(f+l)/2;
                }
               else if(a<arr[mid])//case of element is left of mid
              {
                 l=mid-1;
                 mid=(f+l)/2;
                 
               }
             else//case of match
              {
               System.out.print("ELEMENT FOUND AT INDEX "+mid);
              k=1;
                break;
                
               }


             }
             if(k==0)
             {
               System.out.print("ELEMENT NOT FOUND....  ");
              }
             



}
}

INPUT
_____

Enter Number of elements: 6
Enter the elements in sorted order: 11 22 33 44 55 66
Enter the element to search: 55

OUTPUT
______

ELEMENT FOUND AT INDEX 4
C:\Users\GHANASYAM\javalab\ex3>java p2b
INPUT
_____

Enter Number of elements: 5
Enter the elements in sorted order: 11 22 33 44 55
Enter the element to search: 66

OUTPUT
______

ELEMENT NOT FOUND....
 //Verified
