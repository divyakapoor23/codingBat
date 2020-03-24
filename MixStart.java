/*
* Return true if the given string begins with "mix", except the 'm' 
* can be anything, so "pix", "9ix" .. all count.
* mixStart("mix snacks") -> true
* mixStart("pix snacks") -> true
* mixStart("piz snacks") -> false
*/
public class MixStart {
   public static void main(String[] args) {
      String str;
      mixStart("mix snacks");
   }
   public static boolean mixStart(String str) {
      if(str.length() < 3) {
         return false;
      }
      String match = str.substring(1, 3);
      if (match.equals("ix")) {
         return true;
      }
      else {
         return false;
      }
   }
}