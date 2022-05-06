// username and password authetication
import java.util.*;



class invalidexp  extends Exception  //user defined exception
{  
    public invalidexp(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

 class up{
  String un,pw;
  up(String u,String p){
    un=u;
    pw=p;
   }
}


    
// class that uses custom exception InvalidAgeException  
public class TestCustomException1  
{  
  
    // method to check the age  
    static void validate (up ob[],int n) throws invalidexp{ // function to validate user name and password  
       int f=0,k=0;
      Scanner s=new Scanner(System.in);
       String uname,pass;
      System.out.println("Enter username ");
      uname=s.next();
       System.out.println("Enter password ");
       pass=s.next();

      for(int i=0;i<n;i++){
             if(uname.equals(ob[i].un) && pass.equals(ob[i].pw)){
                f=1;
                break;
                }
        }
      if(f==0){
          throw new invalidexp("invalid username or password");
    }
      if(f==1){
             System.out.println("username and password correct..");
 }
      
      }
    
     
  
    // main method  
    public static void main(String args[])  
    {  
           Scanner s=new Scanner(System.in);
           System.out.println("Enter number of users: "); 
          int n=s.nextInt();
        up obj[]=new up[n];
     System.out.println("_____USER REGISTRATION____\n\n ");
     for(int i=0;i<n;i++){
           String s1,s2;
      
           System.out.println("Enter username "+(i+1));
           s1=s.next();
           System.out.println("Enter password "+(i+1));
           s2=s.next();
           obj[i]=new up(s1,s2);
     }
     
       System.out.println("\n\n___Login page___\n\n");
        try  //block may have exception
        {  
            // calling the method   
            validate(obj,n);  
        }  
        catch(invalidexp ex)  //handling exception
        {  
            System.out.println("Caught the exception");  
    
             
            System.out.println("Exception occured: " + ex);  
        }  
  
           
    }  
} 


/*

Enter number of users: 
3
_____USER REGISTRATION____

 
Enter username 1
shyam
Enter password 1
1234
Enter username 2
tom
Enter password 2
11
Enter username 3
abi
Enter password 3
22


___Login page___


Enter username 
shyam
Enter password 
1234
username and password correct..
................................

Enter number of users: 
2   
_____USER REGISTRATION____

 
Enter username 1
hasan
Enter password 1
2
Enter username 2
arya
Enter password 2
3


___Login page___


Enter username 
arya
Enter password 
6
Caught the exception
Exception occured: invalidexp: invalid username or password




*/










 
