// average of n numbers using exception
import java.util.*;



class invalidexp  extends Exception  //user defined exception
{  
    public invalidexp(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  


    
// class that uses custom exception InvalidAgeException  
public class avgnum  
{  
  
    // method to check the age  
    static void validate (int n) throws invalidexp{ // function to check exception and find average
       int k,f=1;
         float sum=0;
      Scanner s=new Scanner(System.in);
       
      

      for(int i=0;i<n;i++){
             System.out.println("Enter number "+(i+1));
             k=s.nextInt();
         if(k<0){
                   f=0;
                   throw new invalidexp("Negative Numbers are not allowed");//throwing exception
          }

        else
       {
                sum=sum+k;
           } 


 
      }
            if(f==1)
           {
              System.out.println("Average of Numbers :"+(sum/n));
             }
    
     }
  
    // main method  
    public static void main(String args[])  
    {  
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the limit : "); 
          int n=s.nextInt();
        
     
       
        try  //block may have exception
        {  
            // calling the method   
            validate(n);  
        }  
        catch(invalidexp ex)  //handling exception
        {  
            System.out.println("Caught the exception");  
    
             
            System.out.println("Exception occured: " + ex);  
        }  
  
           
    }  
} 



/*
Enter the limit : 
5
Enter number 1
1
Enter number 2
5
Enter number 3
7
Enter number 4
9
Enter number 5
4
Average of Numbers :5.2

...........................................

Enter the limit : 
3
Enter number 1
1 
Enter number 2
-2
Caught the exception
Exception occured: invalidexp: Negative Numbers are not allowed




*/
