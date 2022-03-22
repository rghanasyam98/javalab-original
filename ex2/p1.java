//program to find sum of 2 matrices
import java.io.*;
import java.util.*;
class p1
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
           //declaring input matrix and output matrix
           int arr1[][]=new int[m][n];
           int arr2[][]=new int[m][n];
           int arr3[][]=new int[m][n];
           
          System.out.print("Enter Elements of Matrix 1:\n ");
          //reading first matrix 
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                    arr1[i][j]=s.nextInt();
                 }    
            }
          //reading second matrix
         System.out.print("Enter Elements of Matrix 2:\n ");
           
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                    arr2[i][j]=s.nextInt();
                }     
           }
        System.out.print("\n");
              System.out.print("OUTPUT\n");
             System.out.print("______ \n");
              System.out.print("\n");
              System.out.print("SUM OF MATRICES: \n");
          //finding sum
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }     
           }
          //printing output matrix
          for(int i=0;i<m;i++)
           {
              for(int j=0;j<n;j++)
                 {
                   System.out.print(" "+ arr3[i][j]);
                } 
             System.out.print("\n");    
           }
}
}


/*
INPUT
_____

Enter Number of rows and columns for matrix :
 3 3
Enter Elements of Matrix 1:
 1 2 3
4 5 6
6 7 8
Enter Elements of Matrix 2:
 1 2 3
4 5 6
6 7 8

OUTPUT
______ 

SUM OF MATRICES: 
 2 4 6
 8 10 12
 12 14 16

*/



















