//BILLING PROGRAM
import java.util.*;

interface BillGen{//INTERFACE
  public int calculate();
}

 class productB implements BillGen{//class implementing interface

   String name;
   int prod_id,quantity,unit_price,total;
   productB(String a,int b, int c, int d){//constructor
        name=a;
        prod_id=b;
        quantity=c;
        unit_price=d;
   }
   
   public int calculate(){
      total=unit_price*quantity;
      return total;
   }

}

class Bill{
 
  public static void main(String args[]){
      int N,m,b,c,d=0,sum=0,tamnt=0;
  String A,ch;
   
   
   
   
     Scanner s=new Scanner(System.in);
  while(true){
     Date date=java.util.Calendar.getInstance().getTime();
     d=d+1;
     System.out.println("Enter Number of products purchased: ");
     N=s.nextInt();
     productB obj[]=new productB[N];//array of object
     for(int i=0;i<N;i++){
        
       System.out.println("Enter Details of product:"+(i+1));//reading values
     System.out.println("Enter product Name : ");
     A=s.next();
     System.out.println("Enter product ID : ");
     m=s.nextInt();
     System.out.println("Enter Quantity purchased : ");
     b=s.nextInt();
     System.out.println("Enter price of 1 Unit : ");
     c=s.nextInt();  
     obj[i]=new productB(A,m,b,c); 
     }
     System.out.println("                      __________Bill Information___________ ");//printing bill
     System.out.println("Order No : "+d);
      System.out.println("Date : "+date);
      System.out.println(".......................................................................................");
       System.out.println("Product ID "+"\t "+" Name"+"\t    "+"Quantity"+"\t    "+"Unit Price"+"\t       "+"Total ");
     System.out.println("........................................................................................");
     for(int i=0;i<N;i++){
      System.out.print(obj[i].prod_id+"\t\t  "+obj[i].name+"\t\t"+obj[i].quantity+"\t \t"+obj[i].unit_price+"\t\t"+ obj[i].calculate());
     sum=sum+obj[i].calculate();
      System.out.println("\n");
     }
     System.out.println("........................................................................................");
     System.out.println("Net Amount : "+sum);
     tamnt=tamnt+sum;
     sum=0;
  System.out.println("\n\nAre You Closing Shop(Y/N)");
   ch=s.next();
   if(ch.equals("Y")){
         System.out.println("\n\nShop closed....");
         break;
        }
          
   
   }
    System.out.println("\n\nYOUR FINAL COLLECTION TODAY IS : "+ tamnt);
  }                      
}


/*
Enter Number of products purchased: 
1
Enter Details of product:1
Enter product Name : 
pen
Enter product ID : 
100
Enter Quantity purchased : 
2
Enter price of 1 Unit : 
10
                      __________Bill Information___________ 
Order No : 1
Date : Fri May 06 10:45:30 IST 2022
.......................................................................................
Product ID 	  Name	    Quantity	    Unit Price	       Total 
........................................................................................
100		  pen		2	 	10		20

........................................................................................
Net Amount : 20


Are You Closing Shop(Y/N)
N
Enter Number of products purchased: 
1
Enter Details of product:1
Enter product Name : 
BAG
Enter product ID : 
111
Enter Quantity purchased : 
1
Enter price of 1 Unit : 
1000
                      __________Bill Information___________ 
Order No : 2
Date : Fri May 06 10:45:45 IST 2022
.......................................................................................
Product ID 	  Name	    Quantity	    Unit Price	       Total 
........................................................................................
111		  BAG		1	 	1000		1000

........................................................................................
Net Amount : 1000


Are You Closing Shop(Y/N)
Y


Shop closed....


YOUR FINAL COLLECTION TODAY IS : 1020

*/

