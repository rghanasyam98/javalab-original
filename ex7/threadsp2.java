//multiplication taable and prime number by extending thread class

import java.util.*;

class sample1 extends Thread //inheriting thread class
{



 public void run()
     {
            
               System.out.println("___multiplication table 5 ___\n\n");           

             for(int i=1;i<=10;i++)
             {
                System.out.println(i +"*5="+(i*5));
                
                
              }
              
              
          
        sample2 t2=new sample2();//creating object for class sample2
     
     t2.start();//starting thread by using this object
        
 
     }

}

class sample2 extends Thread//extending thread class
{
 


 public void run()
     {

              
            
          
              int f=0;
             Scanner s=new Scanner(System.in);
             System.out.println("\n\nEnter Limt:");
             int n=s.nextInt();
             System.out.println("___Prime numbers upto "+ n+"_____\n\n");
             for(int i=2;i<=n;i++)
             {   f=0;
                for(int j=2;j<=(i/2);j++)
                {
                     if((i%j)==0){f=1;break;}
                 }
               if(f==0){System.out.println(i);}
              }

              
              
 
     }

}


class threadsp2 
{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         
     
     sample1 t1=new sample1();//creating object for class sample1
     
     
     t1.start();//using that object starting thread
       
     
     
     
   }
}

/*
___multiplication table 5 ___


1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50


Enter Limt:
20
___Prime numbers upto 20_____


2
3
5
7
11
13
17
19



*/

