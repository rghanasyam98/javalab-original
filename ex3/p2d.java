//binary search using biSearch()
import java.util.*;//util.Arrays
class p2d{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];//declaring array
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

           int z=Arrays.binarySearch(arr,a);//invoking binarySearch()
           if(z> -1)//implies element found case
            System.out.println("The Element Found at Index:  "+z);
          else//not found case
             System.out.println("The Element Not Found   ");            



}
}
/*
INPUT
_____

Enter Number of elements: 6
Enter the elements in sorted order: 1 2 3 4 5 6
Enter the element to search: 5

OUTPUT
______

The Element Found at Index:  4

C:\Users\GHANASYAM\javalab\ex3>java p2d
INPUT
_____

Enter Number of elements: 4
Enter the elements in sorted order: 1 2 3 4
Enter the element to search: 5

OUTPUT
______

The Element Not Found
*/
Verified
