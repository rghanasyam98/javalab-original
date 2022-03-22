//program to check matrix is symmetric or not
import java.io.*;
import java.util.*;
class p2
{
 public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
            
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            //reading size of matrix
            System.out.print("Enter Number of rows and columns for matrix :\n ");
            int m=s.nextInt();
            int n=s.nextInt();
           //declaring input matrix
           int arr1[][]=new int[m][n];
           int arr2[][]=new int[m][n];
           
           int f=0;
          System.out.print("Enter Elements of Matrix :\n ");
          //reading matrix 
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                    arr1[i][j]=s.nextInt();
                 }    
            }
         
        System.out.print("\n");
              System.out.print("OUTPUT\n");
             System.out.print("______ \n");
             
          //comparing respective position elements
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                    if(arr1[i][j]!=arr1[j][i])
                     { 
                       f=1;//if violates setting flag 1
                      }
                }     
           }
            if(f==0)
                { 
                   System.out.print("You Entered A Symmetric Matrix \n");
                 }
            else
          {
              System.out.print("You Entered NOT a Symmetric Matrix \n");
          }
          
}
}

INPUT
_____

Enter Number of rows and columns for matrix :
 3 3
Enter Elements of Matrix :
 1 2 3
2 6 4
3 4 7

OUTPUT
______ 
You Entered A Symmetric Matrix 

INPUT
_____

Enter Number of rows and columns for matrix :
 3 3
Enter Elements of Matrix :
 1 2 3
4 5 6
7 8 9

OUTPUT
______ 
You Entered NOT a Symmetric Matrix

