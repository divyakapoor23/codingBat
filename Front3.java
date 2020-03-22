/* 
* Given a string, we'll say that the front is the first 3 chars 
* of the string. If the string length is less than 3, 
* the front is whatever is there. Return a new string which 
* is 3 copies of the front.
* front3("Java") -> "JavJavJav"
* front3("Chocolate") -> "ChoChoCho"
* front3("abc") -> "abcabcabc"
*/
public class Front3 {
   public static void main(String[] args) {
      String str;
      front3("Java");
      front3("si");
   }
   
   public static String front3(String str) {
      if(str.length() < 3) {
         System.out.println(str + str + str);
         return str + str + str;
      
      }
      else {
         String front = str.substring(0, 3);
         String sumFront = front + front + front;
         System.out.println(sumFront);
         return sumFront;
      }
   }
}