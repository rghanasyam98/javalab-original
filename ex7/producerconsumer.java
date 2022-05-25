import java.util.*;
class Q{

   int n;
   boolean valueset=false;

   synchronized int get(){

   while(!valueset)
    try
    {
      wait();

    }
    catch(InterruptedException e)
    {
      System.out.println("InteruptedException caught");

    }
    System.out.println("Got : " +n);
    valueset=false;
    notify();
    return n;
}

    synchronized void put(int n){

      while(valueset)
      
        try
        {
          wait();
        }

        catch(InterruptedException e)
         {
             System.out.println("InteruptedException caught");

          }
  this.n=n;
  valueset=true;
  System.out.println("put : "+n);
  notify();
}
} 

class producer implements Runnable{

    Q q;
    Thread t;

   producer(Q q){
    this.q=q;
    t=new Thread(this,"producer");

  }
   
   public void run(){

     int i=0;

      while(true){

          q.put(i++);
 
   }

 }

}

class consumer implements Runnable{

  Q q;
   Thread t;

  consumer(Q q){
   this.q=q;
   t=new Thread(this,"consumer");

 }

  public void run(){

    while(true){
      q.get();

  }

 }

 }


class producerconsumer{

    public static void main(String args[]){

     Q q=new Q();
     producer p=new producer(q);
     consumer c=new consumer(q);

   //start the threads

   p.t.start();
   c.t.start();

   System.out.println("press control + z to stop ");

}

}
/*
put : 17744
Got : 17744
put : 17745
Got : 17745
put : 17746
Got : 17746
put : 17747
Got : 17747
put : 17748
Got : 17748
put : 17749
Got : 17749
^Zput : 17750


*/














































