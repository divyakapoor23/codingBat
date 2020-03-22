/* 
* Given a string, return a new string where the first and 
* last characters have been exchanged.
* frontBack("code') -> "edoc"
* frontBack("a") -> "a"
* frontBack("ab") -> "ba"
*/
public class FrontBack {
   public static void main(String[] args) {
      String str;
      frontBack("code");
      frontBack("s");
      frontBack("hell");
   }
   public static String frontBack(String str) {
      if(str.length() <= 1) {
         System.out.println(str);
         return str;
      }
      else {
         String mid = str.substring(1, str.length() - 1);
         //last + mid + first
         String reverse = str.charAt(str.length() - 1) + mid + str.charAt(0);
         System.out.println(reverse);
         return reverse;
      }
   }
}