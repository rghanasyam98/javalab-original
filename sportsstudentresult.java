import java.util.*;
interface student
{
  final static int score=10;
  void displayscore();

}

interface sports
{
  final static int score=25;
  void displaysportsscore();

}

class result implements student,sports
{
  public void displayscore()
   {
     System.out.println("SCORE OF STUDENT IN ACADEMICS : "+student.score);
   }
   public void displaysportsscore()
   {
     System.out.println("SCORE OF STUDENT IN SPORTS : "+sports.score);
   }


}

class sportsstudentresult 
{
   public static void main(String args[])
   {
      System.out.println("_____STUDENT PROGRESS CARD_____\n");
     result obj=new result();
     obj.displayscore();
     obj.displaysportsscore();
   }

}

/*

_____STUDENT PROGRESS CARD_____

SCORE OF STUDENT IN ACADEMICS : 10
SCORE OF STUDENT IN SPORTS : 25



*/
