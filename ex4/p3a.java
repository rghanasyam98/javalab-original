import java.util.*;
class p3a{
      public static void main(String args[]){

      System.out.println("\n____STRING MANIPULATIONS____\n");
     //new string using new
     char chs[]={'w','e','l','c','o','m','e'};
     String newStr=new String(chs);
     System.out.println("New string from char[] using new String: "+newStr);

     byte asciis[]={65,66,67,68,69,70};
     newStr=new String(asciis);
      System.out.println("New string from byte[] using new String: "+newStr);

      String s1="Happy";
       String s2="Journey";
      //string length
      System.out.println("\nLENGTH\n_____");
     System.out.println("String length of 'Happy': "+s1.length());
      //to uppercase and lowercase
      System.out.println("\nCASE CONVERSION\n_______________");
      System.out.println("Upper Case : "+s1.toUpperCase());
      System.out.println("Lower Case : "+s2.toLowerCase());
      //concatenation
      System.out.println("\nCONCATENATON\n_____________");
      System.out.println("Concated string using concat() : "+s1.concat(" "+s2));
     System.out.println("Concated string using '+' operator : "+s1+" "+s2);
 
     //character extracton
      System.out.println("\nEXTRACTION\n_______________");
     System.out.println("Character at 3rd position of "+s1+" :"+s1.charAt(3));
      char c[]=new char[5];
      s1.getChars(2,4,c,0);
      System.out.println("Character between 2 and 4 of "+s1+" :"+ new String(c));
       //comparison
      System.out.println("\nCOMPARISON\n_______________");
       s1="Happy";
       s2="HAPPY";
       System.out.println(s1+" Equals "+s2 +": "+s1.equals(s2) );
       System.out.println(s1+" EqualsIgnoreCase "+s2 +": "+s1.equalsIgnoreCase(s2) );

       System.out.println(s1+" compareTo "+s2 +": "+s1.compareTo(s2) );
       System.out.println(s1+" compareToIgnoreCase "+s2 +": "+s1.compareToIgnoreCase(s2) );

      System.out.println(s1+" starts with H " +" : "+s1.startsWith("H") );
      System.out.println(s1+" ends with y " +" : "+s1.endsWith("y")+"\n" );

     System.out.println("SEARCH SUBSTRING\n________________" );
     s1="have a nice day";
    System.out.println("index of nice in "+ s1 +" : "+s1.indexOf("nice") ); 
     System.out.println( "'nice' in "+s1+" Replaced  with 'good' " +" : "+s1.replace("nice","good") +"\n");

      System.out.println("______Using valueOf()_______\n" );
     float n=15.3f;
     System.out.println(n+" is converted to  " +String.valueOf(n) );

}



}
