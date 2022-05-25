//program to implement basic operation of priority queue
import java.util.*;

class e8p4{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            PriorityQueue<String> pq=new PriorityQueue<String>();//delcaring a array deque
            System.out.println("___Priority Queue Operations___\n");
            System.out.println("1.ADD \n2.DELETE\n3.DISPLAY\n4.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add ");
                              String str=s.next();
                              pq.add(str);//adding an item first
                    }
                    
                   
                   else if(ch==2){
                             System.out.println("Enter item to Remove");
                             String str2=s.next();
                             pq.remove(str2);//removing from first
                   }
                 
                    else if(ch==3){
                             System.out.println("Priority Queue: "+pq);
                             
                     }
                      else{System.out.println("Exiting..");break;}
 
     }
  }

}

/*
___Priority Queue Operations___

1.ADD 
2.DELETE
3.DISPLAY
4.EXIT

Enter your Option
1
Enter item to add 
a
Enter your Option
1
Enter item to add 
b
Enter your Option
1
Enter item to add 
d
Enter your Option
1
Enter item to add 
f
Enter your Option
1
Enter item to add 
x
Enter your Option
1
Enter item to add 
z
Enter your Option
3
Priority Queue: [a, b, d, f, x, z]
Enter your Option


*/
