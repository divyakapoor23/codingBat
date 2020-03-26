/*
* Given 2 int values, return whichever value is nearest to 
* the value 10, or return 0 in the event of a tie. 
* Note that Math.abs(n) returns the absolute value of a 
* number.
* close10(8, 13) -> 8
* close10(13, 8) -> 8
* close10(13, 7) -> 0
*/
public class Close10 {
   public static void main(String[] args) {
      int a;
      int b;
      close10(a, b);
   }
   public static int close10(int a, int b) {
      int diffA = Math.abs(10 - a);
      int diffB = Math.abs(10 - b);
      if (diffA < diffB) {
         return a;
      }
      else if (diffB < diffA) {
         return b;
      }
      else {
         return 0;
      }
   }
}