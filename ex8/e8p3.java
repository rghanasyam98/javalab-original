//program to implement basic operation of stack
import java.util.*;

class e8p3{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            Stack<String> stk=new Stack<String>();//delcaring a stack
            System.out.println("___Stack Operations___\n");
            System.out.println("1.PUSH\n2.DELETE BY INDEX\n3.DISPLAY\n4.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              stk.push(str);//adding an item
                    }
                    else if(ch==2){
                             System.out.println("Enter index position to remove");
                             int i=s.nextInt();
                             stk.removeElementAt(i);//removing element at index i
                   }
                   else if(ch==3){
                             System.out.println("STACK :"+stk);
                   }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }
     }
  }

}

/*
___Stack Operations___

1.PUSH
2.DELETE BY INDEX
3.DISPLAY
4.EXIT

Enter your Option
1
Enter item to add
shyam
Enter your Option
1
Enter item to add
tom
Enter your Option
1
Enter item to add
abi
Enter your Option
3
STACK :[shyam, tom, abi]
Enter your Option
2
Enter index position to remove
1
Enter your Option
3
STACK :[shyam, abi]
Enter your Option
4
Exiting...


*/

