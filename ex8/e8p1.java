//program to implement basic operation of array list
import java.util.*;

class e8p1{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            ArrayList<String> al=new ArrayList<String>();//delcaring an array list
            System.out.println("___Array List Operations___\n");
            System.out.println("1.ADD\n2.REMOVE\n3.REMOVE ALL\n4.DISPLAY\n5.GET ITEM\n6.SIZE\n7.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              al.add(str);//adding an item
                    }
                    else if(ch==2){
                             System.out.println("Enter item to Remove");
                             String str2=s.next();
                             al.remove(str2);//removing an item
                   }
                    else if(ch==3){
                            al.clear();//removing all
                            System.out.println("All Item Cleared");
                   }
                   else if(ch==4){
                             System.out.println(al);//displaying
                   }
                  else if(ch==5){
                             System.out.println("Enter the index Position");
                             int i=s.nextInt();
                             System.out.println("Item at index "+i+" : "+al.get(i));//getting by index postion
                   }
                  else if(ch==6){
                             System.out.println("Size of ArrayList : "+al.size());//getting size
                   } 
                   else{
                           System.out.println("Exiting...");
                           break;    
                   }
          }
}
}

/*
___Array List Operations___

1.ADD
2.REMOVE
3.REMOVE ALL
4.DISPLAY
5.GET ITEM
6.SIZE
7.EXIT

Enter your Option
1
Enter item to add
abi
Enter your Option
1
Enter item to add
tom
Enter your Option
1
Enter item to add
shyam
Enter your Option
4
[abi, tom, shyam]
Enter your Option
6
Size of ArrayList : 3
Enter your Option
2
Enter item to Remove
tom
Enter your Option
4
[abi, shyam]
Enter your Option
5
Enter the index Position
0
Item at index 0 : abi
Enter your Option
3
All Item Cleared
Enter your Option
4
[]
Enter your Option
7
Exiting...



*/














