//Teacher information using inhertence
import java.util.*;

class employee//super class
{

int empid,sal;
String ename,addr;
    void employee(int a,int b,String c,String d)//employee class constructor
      {
          empid=a;
          sal=b;
          ename=c;
          addr=d;
      }

 }  

class teacher extends employee //subclass
{
    String dpt,sub;
     teacher(String x,String y, int id, int sa,String name,String add)//teacher class constructor
     {
       dpt=x;
       sub=y;
        empid=id;
          sal=sa;
          ename=name;
          addr=add;
       
         }
     void display(int i)
     {
       System.out.println("______TEACHER INFORMATIONS OF TEACHER "+(i+1)+"_____\n\n");
       System.out.println("EMPLOYEE ID :"+empid);
       System.out.println("EMPLOYEE NAME :"+ename);
       System.out.println("ADDRESS :"+addr);
       System.out.println("DEPARTMENT :"+dpt);
       System.out.println("SUBJECT :"+sub);
       System.out.println("SALARY :"+sal);
       System.out.println("\n\n");
     }

}


class e5p1 
{

      public static void main(String args[])
      {
           int j,i;
          int empid,sal;
          String ename,addr,dpt,sub;
          
            Scanner s=new Scanner(System.in);
          System.out.print("Enter Number of Teachers: ");
             int n=s.nextInt();
          teacher obj[]=new teacher[n];//declaring an array of objects
         /* for( j=0;j<n;j++)//to allocate memory for each objects
             obj[j]=new employee();*/
           for( i=0;i<n;i++)
          {
            System.out.print("_____Enter Informations of Teacher "+(i+1)+"_____ \n");
              System.out.println(" Enter EMPLOYEE ID :");
              empid=s.nextInt();
              System.out.println(" Enter EMPLOYEE NAME :");
              ename=s.next();
             System.out.println("Enter ADDRESS :");
             addr=s.next();
             System.out.println("Enter DEPARTMENT :");
             dpt=s.next();
             System.out.println("Enter SUBJECT :");
            sub=s.next();
             System.out.println("Enter SALARY :");
             sal=s.nextInt();
              obj[i]=new teacher(dpt,sub,empid,sal,ename,addr);//constructor invokation
          }
          
           for( i=0;i<n;i++)
          {
           obj[i].display(i);//display invocation
          }
      }



}




/*
Enter Number of Teachers: 2
_____Enter Informations of Teacher 1_____ 
 Enter EMPLOYEE ID :
100
 Enter EMPLOYEE NAME :
shyam
Enter ADDRESS :
tmsy
Enter DEPARTMENT :
cs
Enter SUBJECT :
maths
Enter SALARY :
10000
_____Enter Informations of Teacher 2_____ 
 Enter EMPLOYEE ID :
101
 Enter EMPLOYEE NAME :
tom
Enter ADDRESS :
mkm
Enter DEPARTMENT :
cs
Enter SUBJECT :
java
Enter SALARY :
10000
______TEACHER INFORMATIONS OF TEACHER 1_____
EMPLOYEE ID :100
EMPLOYEE NAME :shyam
ADDRESS :tmsy
DEPARTMENT :cs
SUBJECT :maths
SALARY :10000
______TEACHER INFORMATIONS OF TEACHER 2_____
EMPLOYEE ID :101
EMPLOYEE NAME :tom
ADDRESS :mkm
DEPARTMENT :cs
SUBJECT :java
SALARY :10000
*/
