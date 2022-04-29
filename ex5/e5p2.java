//Teacher information using multi level inhertence and super()
import java.util.*;

class Person
{

int Age;
String Name,Gender,Address;
      Person(int age,String name,String gender,String address)//Person class constructor
      {
          Name=name;
          Gender=gender;
          Address=address;
          Age=age;
      }

 }  

class Employee extends Person //subclass of Person
{
    int Empid,salary;
    String company_name,qualification;
     Employee(int eid,int sal,String cn,String qua,int Age,String name,String Gender,String Address)//Employee class constructor
     {
       super( Age, name, Gender, Address);
       Empid=eid;
       salary=sal;
        company_name=cn;
          qualification=qua;
         
       
         }
}


class Teacher extends Employee //subclass of Employee
{
    int Teacher_id;
    String subject,department;
     Teacher(int p,String q,String r,int eid,int sal,String cn,String qua,int Age,String name,String Gender,String Address)//Teacher class constructor
     {
        super( eid, sal, cn, qua, Age, name, Gender, Address);
       Teacher_id=p;
       subject=q;
        department=r;
      }
     void display(int i)
     {
       System.out.println("______TEACHER INFORMATIONS OF TEACHER "+(i+1)+"_____\n\n");
       System.out.println("NAME :"+Name);
       System.out.println("GENDER :"+Gender);
       System.out.println("ADDRESS :"+Address);
       System.out.println("AGE :"+Age);
       System.out.println("EMPLOYEE ID :"+Empid);
       System.out.println("SALARY :"+salary);
      System.out.println("COMPANY NAME :"+company_name);
      System.out.println("QUALIFICATION :"+qualification);
       System.out.println("TEACHER ID :"+Teacher_id);
       System.out.println("SUBJECT :"+subject);
           System.out.println("DEPARTMENT :"+department);
       System.out.println("\n\n");
     }

}


class e5p2
{

      public static void main(String args[])
      {
           int Age,i;
           String Name,Gender,Address;
           int Empid,salary;
    String company_name,qualification;
           int Teacher_id;
    String subject,department;
          
            Scanner s=new Scanner(System.in);
          System.out.print("Enter Number of Teachers: ");
             int n=s.nextInt();
          Teacher obj[]=new Teacher[n];//declaring an array of objects
         
           for( i=0;i<n;i++)
          {
            System.out.print("_____Enter Informations of Teacher "+(i+1)+"_____ \n");
              System.out.println(" Enter NAME :");
              Name=s.next();
              System.out.println(" Enter GENDER :");
              Gender=s.next();
             System.out.println("Enter ADDRESS :");
             Address=s.next();
             System.out.println("Enter AGE :");
             Age=s.nextInt();
             System.out.println("Enter Empid :");
            Empid=s.nextInt();
             System.out.println("Enter SALARY :");
             salary=s.nextInt();
              
             System.out.println("Enter COMPANY NAME :");
             company_name=s.next();
               
             System.out.println("Enter QUALIFICATION :");
             qualification=s.next();

                
             System.out.println("Enter TEACHER ID :");
             Teacher_id=s.nextInt();
             
              
             System.out.println("Enter 	SUBJECT :");
             subject=s.next();

               
             System.out.println("Enter DEPARTMENT :");
             department=s.next();

              obj[i]=new Teacher(Teacher_id,subject,department,Empid,salary,company_name,qualification,Age,Name,Gender,Address);//constructor invokation
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
 Enter NAME :
tom     
 Enter GENDER :
m
Enter ADDRESS :
pazhoor
Enter AGE :
21
Enter Empid :
1
Enter SALARY :
10000
Enter COMPANY NAME :
tcs 
Enter QUALIFICATION :
mca
Enter TEACHER ID :
1
Enter 	SUBJECT :
cs
Enter DEPARTMENT :
cs
_____Enter Informations of Teacher 2_____ 
 Enter NAME :
abi
 Enter GENDER :
m
Enter ADDRESS :
mkm
Enter AGE :
22
Enter Empid :
2
Enter SALARY :
20000
Enter COMPANY NAME :
infosys
Enter QUALIFICATION :
bca
Enter TEACHER ID :
2
Enter 	SUBJECT :
maths
Enter DEPARTMENT :
maths
______TEACHER INFORMATIONS OF TEACHER 1_____


NAME :tom
GENDER :m
ADDRESS :pazhoor
AGE :21
EMPLOYEE ID :1
SALARY :10000
COMPANY NAME :tcs
QUALIFICATION :mca
TEACHER ID :1
SUBJECT :cs
DEPARTMENT :cs



______TEACHER INFORMATIONS OF TEACHER 2_____


NAME :abi
GENDER :m
ADDRESS :mkm
AGE :22
EMPLOYEE ID :2
SALARY :20000
COMPANY NAME :infosys
QUALIFICATION :bca
TEACHER ID :2
SUBJECT :maths
DEPARTMENT :maths


*/
