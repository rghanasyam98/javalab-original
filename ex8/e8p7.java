//program to implement comparison of  hash set
import java.util.*;

class e8p7{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            HashSet<String> hset1=new HashSet<String>();//delcaring a hashset
            HashSet<String> hset2=new HashSet<String>();
            System.out.println("___HasSet Comparison___\n");
            //System.out.println("1.ADD\n2.DELETE\n3.DISPLAY\n4.EXIT\n");
           
                      //System.out.println("Enter your Option");
                    
                   
                              System.out.println("\n... hashset 1 operations...");
                              System.out.println("1.ADD\n2.DISPLAY\n3.EXIT\n");
                              while(true){
                              System.out.println("Enter your Option");
                              int ch=s.nextInt();
                              if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              hset1.add(str);//adding an item
                             }
                              else if(ch==2){
                             System.out.println(hset1);//displaying
                              }
                             
                           else{
                              //System.out.println("Exiting...");
                              break;    
                              }
                             }
                    
                     
                             
                              System.out.println("\n... hashset 2 operations....");
                               System.out.println("1.ADD\n2.DISPLAY\n3.EXIT\n");
                              while(true){
                              System.out.println("Enter your Option");
                                int ch1=s.nextInt();
                              if(ch1==1){
                              System.out.println("Enter item to add");
                              String str1=s.next();
                              hset2.add(str1);//adding an item
                             }
                              else if(ch1==2){
                             System.out.println(hset2);//displaying
                              }
                             
                           else{
                              //System.out.println("Exiting...");
                              break;    
                              }
                             }
                     if(hset1.equals(hset2))//comparing by equals method
                     {
                               System.out.println("\nBOTH HASHSETS ARE SAME...");
                      }
                    else
                    {
                                   System.out.println("\nBOTH HASHSETS ARE NOT SAME...");
                    }
                   
                  
                            /* System.out.println("LinkedHashSet :");
                             Iterator<String> itr=hset.iterator();
                             while(itr.hasNext()){
                                     System.out.println(itr.next());}*/
                  
                             
                     
     }
  }

/*
___HasSet Comparison___


... hashset 1 operations...
1.ADD
2.DISPLAY
3.EXIT

Enter your Option
1
Enter item to add
shyam
Enter your Option
1
Enter item to add
arya
Enter your Option
3

... hashset 2 operations....
1.ADD
2.DISPLAY
3.EXIT

Enter your Option
1
Enter item to add
shyam
Enter your Option
1
Enter item to add
tom
Enter your Option
3

BOTH HASHSETS ARE NOT SAME...

.........................................................

___HasSet Comparison___


... hashset 1 operations...
1.ADD
2.DISPLAY
3.EXIT

Enter your Option
1
Enter item to add
shyam
Enter your Option
1
Enter item to add
tom
Enter your Option
3

... hashset 2 operations....
1.ADD
2.DISPLAY
3.EXIT

Enter your Option
1
Enter item to add
tom
Enter your Option
1
Enter item to add
shyam
Enter your Option
3

BOTH HASHSETS ARE SAME...




*/

