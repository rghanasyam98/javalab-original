import java.util.*;



class invalidexp  extends Exception  //user defined exception
{  
    public invalidexp(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  



public class avgexp 
{  
  
        
      

      
  
    // main method  
    public static void main(String args[])  
    {  
           Scanner s=new Scanner(System.in);
               float sum=0;
     
           System.out.println("Enter the limit : "); 
          int n=s.nextInt();
        int i=1,k;
     while(i<=n){
       
        try  //block may have exception
        {    

            
             System.out.println("Enter number "+(i));
             k=s.nextInt();
         if(k<0){
                   
                   throw new invalidexp("Negative Numbers are not allowed");//throwing exception
          }

        else
       {
                sum=sum+k;
                i=i+1;
                 if(i==(n+1))System.out.println("AVERAGE="+(sum/n));
           } 


 
     
    
     }
         
        catch(invalidexp ex)  //handling exception
        {  
            System.out.println("Caught the exception");  
    
             
            System.out.println("Exception occured: " + ex);  
        }  
  
        }   
    }  
} 






/*
Enter the limit :
5
Enter number 1
2
Enter number 2
3
Enter number 3
5
Enter number 4
-1
Caught the exception
Exception occured: invalidexp: Negative Numbers are not allowed
Enter number 4
1
Enter number 5
6
AVERAGE=3.4


*/