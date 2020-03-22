/*
* Given an int n, return the absolute difference between n and 21, 
* except return double the absolute difference if n is over 21.
* diff21(19) -> 2
* diff21(10) -> 11
* diff21(21) -> 0
*/


public class Difference {
   public static void main(String[] args) {
      int n;
      diff21(19);
      diff21(10);
      diff21(21);
   }
   public static int diff21(int n) {
      int diff;
      if(n > 21) {
         diff = (n - 21) * 2;
          System.out.println(diff);
         return diff;
      }
      else {
         diff = 21 - n;
         System.out.println(diff);
         return diff;
      }
   }
}