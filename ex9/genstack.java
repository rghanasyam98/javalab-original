import java.util.*;

 class Stack<T> {

   private ArrayList<T> stk;
   public Stack(){
       stk=new ArrayList<T>();
   }

   public void push(T item){
      stk.add(item);
     // System.out.println("STACK :"+stk);
   }

   public T pop(){ 
      return  stk.remove(stk.size()-1);
      
    }
   public void dis(){
           System.out.println("STACK :"+stk);
 }
}

class genstack{

            public static void main(String args[]){

                 Scanner s=new Scanner(System.in);
                  System.out.println("___Integer Stack___\n");
                      Stack<Integer> obj1=new <Integer>Stack(); 
                           System.out.println("___Stack Operations___\n");
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n"); 

                    
                  while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item of Type Integer to add");
                               int k=s.nextInt();
                               obj1.push(k);   
                        }
                     else if(ch==2){
                             
                             int x=obj1.pop();
                             System.out.println("POPED ITEM IS: "+x);
                   }
                   else if(ch==3){
                            obj1.dis();
                   }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }                 

                 }
               /* else if(ch==2){
                       Stack<String> obj1=new <String>Stack();
                }
               else if(ch==3){
                        Stack<float> obj1=new <float>Stack();
              }
             else{System.out.println("Invalid Choice...");}

        */
                  System.out.println("\n\n___String Stack___\n");
                      Stack<String> obj2=new <String>Stack(); 
                           System.out.println("___Stack Operations___\n");
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n"); 

                    
                  while(true){
                      System.out.println("Enter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item of Type String to add");
                               String str=s.next();
                               obj2.push(str);   
                        }
                     else if(ch==2){
                             
                             String z=obj2.pop();
                             System.out.println("POPED ITEM IS: "+z);
                   }
                   else if(ch==3){
                            obj2.dis();
                   }
                    else{
                             System.out.println("Exiting...");
                             break;
                     }                 

                 }
     
     }

}


/*
___Integer Stack___

___Stack Operations___

1.PUSH
2.POP
3.DISPLAY
4.EXIT

Enter your Option
1
Enter item of Type Integer to add
1
Enter your Option
1
Enter item of Type Integer to add
2
Enter your Option
1
Enter item of Type Integer to add
3
Enter your Option
3
STACK :[1, 2, 3]
Enter your Option
2
POPED ITEM IS: 3
Enter your Option
4
Exiting...


___String Stack___

___Stack Operations___

1.PUSH
2.POP
3.DISPLAY
4.EXIT

Enter your Option
1
Enter item of Type Integer to add
tom
Enter your Option
1
Enter item of Type Integer to add
shyam
Enter your Option
1
Enter item of Type Integer to add
hasna
Enter your Option
3
STACK :[tom, shyam, hasna]
Enter your Option
2
POPED ITEM IS: hasna
Enter your Option
3
STACK :[tom, shyam]
Enter your Option



*/





















