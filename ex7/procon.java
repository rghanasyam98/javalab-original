import java.util.*;
class Q{

   int num;
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
    System.out.println("Got : " +num);
    valueset=false;
    notify();
    return num;
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
  num=n;
  valueset=true;
  System.out.println("put : "+num);
  notify();
}
} 

class producer extends Thread{

    Q q;
    

   producer(Q ob){
    q=ob;
    

  }
   
   public void run(){

     int i=0;

      while(true){

          q.put(i++);
 
   }

 }

}

class consumer extends Thread{

  Q q;
   

  consumer(Q ob){
   q=ob;
   
 }

  public void run(){

    while(true){
      q.get();

  }

 }

 }


class procon{

    public static void main(String args[]){

     Q ob=new Q();
     producer p=new producer(ob);
     consumer c=new consumer(ob);

   //start the threads

   p.start();
   c.start();

   System.out.println("press control + z to stop ");

}

}