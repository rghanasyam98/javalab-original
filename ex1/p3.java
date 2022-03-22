/*Write a Java program to find the number of days in a month for a given year. 
Check Leap year also. */
import java.util.*;
class p3{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
            System.out.print("INPUT\n");
             System.out.print("_____\n");
              System.out.print("\n");
            System.out.print("Enter a year: ");
            
            int y=s.nextInt();//TAKING USER INPUT YEAR
            System.out.print("Enter a Month: ");
            String m=s.next();//TAKING USER INPUT MONTH
            
             System.out.print("\n");
              System.out.print("OUTPUT\n");
             System.out.print("______ \n");
              System.out.print("\n");
             
              
            int f=0;//SETTING FLAG VARIABLE 0
            if(y%4==0)//CHECKING DIVISIBLE BY 4 OR NOT
            {
              if(y%100==0)//CHECKING DIVISIBLE BY 100 OR NOT
                 {
                    if(y%400==0){//CHECKING DIVISIBLE BY 400 OR NOT
                     System.out.print("You Entered A Leap Year...\n");
                         f=1;//SETTING F 1 WHEN YEAR IS LEAP
                    }

                  }
              else
              {
                  System.out.print("You Entered  a Leap Year...\n");
                   f=1;//SETTING F 1 WHEN YEAR IS LEAP
                        
               }
              }
               else
              {
                  System.out.print("You Entered Not a Leap Year...\n");
                        
               }
             
          
   //SWITCH TO MULTIWAY BRANCH THROUGH 12 MONTHS        
     switch(m){
     case "january":System.out.print("Number of days: 31\n");
                     break;
//IF F 1 YEAR WILL BE LEAP AND FEB HAVE 29 DAYS
case "february":if(f==1){
                    System.out.print("Number of days: 29\n");
                     break;
                    }
                 else
                 {
                   System.out.print("Number of days: 28\n");
                     break;
                 }
       
case "march":System.out.print("Number of days: 31\n");
                     break;
       
case "april":System.out.print("Number of days: 30\n");
                     break;
       
case "may":System.out.print("Number of days: 31\n");
                     break;
       
case "june":System.out.print("Number of days: 30\n");
                     break;
       
case "july":System.out.print("Number of days: 31\n");
                     break;
       
case "august":System.out.print("Number of days: 31\n");
                     break;
       case "september":System.out.print("Number of days: 31\n");
                     break;
       
case "october":System.out.print("Number of days: 31\n");
                     break;
case "november":System.out.print("Number of days: 30\n");
                     break;
case "december":System.out.print("Number of days: 31\n");
                     break;

default: System.out.print("Invaild Input!!!\n");      
}      
}
}



/*
INPUT
_____

Enter a year: 2020
Enter a Month: february

OUTPUT
______

You Entered  a Leap Year...
Number of days: 29


INPUT
_____

Enter a year: 2021
Enter a Month: february

OUTPUT
______

You Entered Not a Leap Year...
Number of days: 28
*/








