//program to implement basic operation of hash map
import java.util.*;

class e9p1{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            HashMap<String,Integer> hm=new HashMap<String,Integer>();//delcaring hash map
            
            System.out.println("___Map Operations___\n");
            System.out.println("1.ADD\n2.CHANGE\n3.DISPLAY\n4.REMOVE\n5.EXIT\n");
           while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter key:");
                              String str=s.next();
                              
                              System.out.println("Enter value:");
                              int k=s.nextInt();
                              hm.put(str,k);//adding an item
                    }
                    else if(ch==2){
                             System.out.println("Enter key for change information:");
                             String str2=s.next();
                             int t=hm.get(str2);
                             System.out.println("Enter the value you need to add to old value :");
                             int a=s.nextInt();
                             hm.put(str2,(t+a));//adding updated value
                   }

                  else if(ch==3){
                           Set<Map.Entry<String,Integer>> set=hm.entrySet();//for displaying this is necessary
                           for(Map.Entry<String,Integer> me:set){
                              System.out.print(me.getKey()+" : ");//grtting value
                              System.out.println(me.getValue());//getting key

                         }


                  }


                   else if(ch==4){
                             System.out.println("Enter key to remove :");
                             String b=s.next();
                             if(hm.containsKey(b)){//check that key present or not
                                   hm.remove(b);
                              }
                              else{
                                     System.out.println("INVALID KEY..!!!");
                               }
                       }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }
     }
  }

}

/*
___Map Operations___

1.ADD
2.CHANGE
3.DISPLAY
4.REMOVE
5.EXIT

Enter your Option
1
Enter key:
tm
Enter value:
90
Enter your Option
1
Enter key:
shyam
Enter value:
90
Enter your Option
4
Enter key to remove :
tom
INVALID KEY..!!!
Enter your Option
4
Enter key to remove :
tom
INVALID KEY..!!!
Enter your Option
4
Enter key to remove :
tm
Enter your Option
3
shyam : 90
Enter your Option
2
Enter key for change information:
shyam
Enter the value you need to add to old value :
10
Enter your Option
3
shyam : 100
Enter your Option
5
Exiting...


*/

