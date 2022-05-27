//program to covert  of hash map to tree map
import java.util.*;

class e9p2{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            HashMap<String,Integer> hm=new HashMap<String,Integer>();//delcaring hash map
            TreeMap<String,Integer> tm=new TreeMap<String,Integer>();//declaring a tree map
            System.out.println("___HashMap to TreeMap___\n");
            System.out.println("1.ADD\n2.DISPLAY HashMap\n3.Covert To TreeMap\n4.Display TreeMAp\n5.EXIT\n");
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
                            Set<Map.Entry<String,Integer>> set=hm.entrySet();//for displaying this is necessary
                           for(Map.Entry<String,Integer> me:set){
                              System.out.print(me.getKey()+" : ");//grtting value
                              System.out.println(me.getValue());//getting key
                     }
                     }

                  else if(ch==3){
                           tm.putAll(hm);
                             System.out.println("Successfully converted..\n");
                         


                  }


                   else if(ch==4){
                                  Set<Map.Entry<String,Integer>> set1=tm.entrySet();//for displaying this is necessary
                           for(Map.Entry<String,Integer> me:set1){
                              System.out.print(me.getKey()+" : ");//grtting value
                              System.out.println(me.getValue());//getting key
                            
                             }
                          }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }
        }
     }

 }

