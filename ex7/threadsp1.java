//fibonacci and even number using thread
import java.util.*;

class sample1 implements Runnable//implementing runnable interface
{

        Scanner s=new Scanner(System.in);
      int n;
       sample1(int k){//constructor
          n=k;  
         }
     public void run()
     {

                       
             
              System.out.println("\n__Fibonacci series upto "+n+" terms___\n\n");           
             int a=0,b=1,c=0;
         
             for(int i=1;i<=n;i++)
             {
                  
                System.out.println(c);
               
               a=b;
               b=c;
               c=a+b;
            }
         
                  System.out.println("\n\nEnter range for even numbers:");
             int n1=s.nextInt();
              int n2=s.nextInt();

              
              sample2 th2=new sample2(n1,n2);//creating object of class sample2
              
              Thread t2=new Thread(th2);//creating thread object with the abve class object
             
              t2.start();//starting thread
         
    }

       

}



class sample2 implements Runnable
{
    int n1,n2;
     sample2(int x,int y){
       n1=x;
       n2=y; 
      
                
     }
        
     public void run()
     {

                       
                  Scanner s=new Scanner(System.in);
            
              System.out.println("\n__Even Numbers from "+n1+" to "+n2+"___\n\n");           
             
             for(int i=n1;i<=n2;i++)
             {
                  
                if(i%2==0){System.out.println(i);}
            }   




          }

     


}


class threadsp1
{
    public static void main(String args[])
    {

                   Scanner s=new Scanner(System.in);
             System.out.println("\n\nEnter Limt for fibonacci series:");
             int n=s.nextInt();
           
                   sample1 th1=new sample1(n);//creating object of class sample1
                   Thread t1=new Thread(th1);//creating thread object with the abve class object
                   t1.start();//starting thread
                 
        
    }



}

/*

Enter Limt for fibonacci series:
10

__Fibonacci series upto 10 terms___


0
1
1
2
3
5
8
13
21
34


Enter range for even numbers:
2 10

__Even Numbers from 2 to 10___


2
4
6
8
10




*/