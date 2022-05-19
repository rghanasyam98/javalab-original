//program to implement basic operation of linked list
import java.util.*;

class e8p2{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            LinkedList<String> ll=new LinkedList<String>();//delcaring a linked list
            System.out.println("___Linked List Operations___\n");
            System.out.println("1.ADD\n2.ADD FIRST\n3.DISPLAY\n4.CLEAR\n5.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              ll.add(str);//adding an item
                    }
                    else if(ch==2){
                             System.out.println("Enter item to Add");
                             String str2=s.next();
                             ll.addFirst(str2);//adding an item first
                   }
                   else if(ch==3){
                             System.out.println("Linked List :"+ll);
                   }
                    else if(ch==4){
                            ll.clear();//removing all
                            System.out.println("All Item Cleared");
                   }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }
     }
  }

}


/*
___Linked List Operations___

1.ADD
2.ADD FIRST
3.DISPLAY
4.CLEAR
5.EXIT

Enter your Option
1
Enter item to add
shyam
Enter your Option
1
Enter item to add
arya
Enter your Option
1
Enter item to add
athira
Enter your Option
1
Enter item to add
tom
Enter your Option
3
Linked List :[shyam, arya, athira, tom]
Enter your Option
2
Enter item to Add
abi
Enter your Option
3
Linked List :[abi, shyam, arya, athira, tom]
Enter your Option
4
All Item Cleared
Enter your Option
3
Linked List :[]
Enter your Option
5
Exiting...




*/
