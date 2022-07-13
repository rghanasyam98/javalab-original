//program to implement bubblesort using generic method
import java.util.*;
import java.util.Arrays;

class genmethod{
    public static<T> T[] bsort(T[] words)
     {
          for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                  String s1=words[i].toString();
                  String s2=words[j].toString();
                if(s1.compareTo(s2) > 0)//words[j] is less than than words[i]
                {
                    T temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
   
     }




  public static void main(String args[])
  {
    String arr[]={"tom","arya","shyam","hasna","kiran","navya"};
    System.out.println("Before Sorting : "+Arrays.toString(arr));
    genmethod obj=new genmethod();
    String a[]=obj.<String>bsort(arr);
    System.out.println("After Sorting : "+Arrays.toString(a));
    Integer num[]={4,3,7,1,9,2};
    System.out.println("Before Sorting : "+Arrays.toString(num));
    Integer b[]=obj.<Integer>bsort(num);
   System.out.println("After Sorting : "+Arrays.toString(b));

  }

}
/*

C:\Users\GHANASYAM\Desktop\JAVALAB\EX9>java genmethod
Before Sorting : [tom, arya, shyam, hasna, kiran, navya]
After Sorting : [arya, hasna, kiran, navya, shyam, tom]
Before Sorting : [4, 3, 7, 1, 9, 2]
After Sorting : [1, 2, 3, 4, 7, 9]



*/












