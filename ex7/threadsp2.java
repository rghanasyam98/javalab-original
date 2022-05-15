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
              
              
          
        
        
 
     }

}

class sample2 extends Thread//extending thread class
{

   int n;
 
   sample2(int k){
       n=k;
  }


 public void run()
     {

              
            
          
              int f=0;
             Scanner s=new Scanner(System.in);
             
             System.out.println("___Prime numbers upto "+ n+"_____\n\n");
             for(int i=2;i<=n;i++)
             {   f=0;
                for(int j=2;j<=(i/2);j++)
                {
                     if((i%j)==0){f=1;break;}
                 }
               if(f==0){System.out.println("Prime Number : "+i);}
              }

              
              
 
     }

}


class threadsp2 
{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         
     System.out.println("\n\nEnter Limt:");
             int n=s.nextInt();
     sample1 t1=new sample1();//creating object for class sample1
     
     sample2 t2=new sample2(n);//creating object for class sample2
      t1.start();//using that object starting thread
     t2.start();//starting thread by using this object
    
       
     
     
     
   }
}

/*

Enter Limt:
20
___multiplication table 5 ___


___Prime numbers upto 20_____


Prime Number : 2
1*5=5
Prime Number : 3
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
Prime Number : 5
Prime Number : 7
Prime Number : 11
Prime Number : 13
Prime Number : 17
7*5=35
8*5=40
Prime Number : 19
9*5=45
10*5=50


*/

