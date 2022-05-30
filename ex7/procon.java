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


/*
press control + z to stop
put : 0
Got : 0
put : 1
Got : 1
put : 2
Got : 2
put : 3
Got : 3
put : 4
Got : 4
put : 5
Got : 5
put : 6
Got : 6
put : 7
Got : 7
put : 8
Got : 8
put : 9
Got : 9
put : 10
Got : 10
put : 11
Got : 11
put : 12
Got : 12
put : 13
Got : 13
put : 14
Got : 14
put : 15
Got : 15
put : 16
Got : 16
put : 17
Got : 17
put : 18
Got : 18
put : 19
Got : 19
put : 20
Got : 20


*/
