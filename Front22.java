/*
* Given a string, take the first 2 chars and 
* return the string with the 2 chars added at 
* both the front and back, so "kitten" yields"kikittenki". 
* If the string length is less than 2, use whatever chars 
* are there.
* front22("kitten") -> "kikittenki"
* front22("Ha") -> "HaHaHa"
* front22("abc") -> "ababcab"
*/
public class Front22 {
   public static void main(String[] args) {
      String str;
      front22("kitten");
      front22("a");
      front22("abc");
      front22("Ha");
   }
   public static String front22(String str) {
      String first;
      if(str.length() >= 2) {
         first = str.substring(0, 2); 
         System.out.println(first + str + first);
         return first + str + first;
       }
      System.out.println(str + str + str);
      return str + str + str;
   }
}