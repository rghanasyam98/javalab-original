//program to implement basic operation of deque
import java.util.*;

class e8p5{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            Deque<String> dq=new ArrayDeque<String>();//delcaring a array deque
            System.out.println("___ArrayDeque Operations___\n");
            System.out.println("1.ADD FIRST\n2.ADD LAST\n3.DELETE FIRST\n4.DELETE LAST\n5.DISPLAY\n6.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add at first");
                              String str=s.next();
                              dq.addFirst(str);//adding an item first
                    }
                    else if(ch==2){
                             /*System.out.println("Enter item to Remove");
                             String str2=s.next();
                             dq.remove(str2);//removing an item*/
                            
                              System.out.println("Enter item to add at last");
                              String str1=s.next();
                              dq.addLast(str1);//adding an item last
                             
                   }
                   else if(ch==3){
                             dq.removeFirst();//removing from first
                   }
                  else if(ch==4){
                             dq.removeLast();//removing from last
                   }
                    else if(ch==5){
                             System.out.println("DEQUE: "+dq);
                             
                     }
                      else{System.out.println("Exiting..");break;}
 
     }
  }

}
/*
___ArrayDeque Operations___

1.ADD FIRST
2.ADD LAST
3.DELETE FIRST
4.DELETE LAST
5.DISPLAY
6.EXIT

Enter your Option
1
Enter item to add at first
shyam
Enter your Option
1
Enter item to add at first
arya
Enter your Option
2
Enter item to add at last
surya
Enter your Option
2
Enter item to add at last
tom
Enter your Option
5
DEQUE: [arya, shyam, surya, tom]
Enter your Option
3
Enter your Option
5
DEQUE: [shyam, surya, tom]
Enter your Option
4
Enter your Option
5
DEQUE: [shyam, surya]
Enter your Option
6
Exiting..


*/
