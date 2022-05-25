//program to implement basic operation of linked hash set
import java.util.*;

class e8p6{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            LinkedHashSet<String> hset=new LinkedHashSet<String>();//delcaring a stack
            System.out.println("___LinkedHasSet Operations___\n");
            System.out.println("1.ADD\n2.DELETE\n3.DISPLAY\n4.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              hset.add(str);//adding an item
                    }
                    else if(ch==2){
                             System.out.println("Enter item to Remove");
                             String str2=s.next();
                             hset.remove(str2);//removing an item
                   }
                   else if(ch==3){
                             System.out.println("LinkedHashSet :");
                             Iterator<String> itr=hset.iterator();
                             while(itr.hasNext()){
                                     System.out.println(itr.next());}
                   }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }
     }
  }

}

/*
___LinkedHasSet Operations___

1.ADD
2.DELETE
3.DISPLAY
4.EXIT

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
midun
Enter your Option
3
LinkedHashSet :
shyam
arya
midun
Enter your Option
2
Enter item to Remove
midun
Enter your Option
3
LinkedHashSet :
shyam
arya
Enter your Option
4
Exiting...

*/
