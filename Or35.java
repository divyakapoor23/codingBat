/*
* Return true if the given non-negative number is a multiple 
* of 3 or a multiple of 5. Use the % "mod" operator
* or35(3) -> true
* or35(10) -> true
* or35(8) -> false
*/
public class Or35 {
   public static void main(String[] args) {
      int n;
      or35(10);
      or35(15);
      or35(8);
      or35(3);
   }
   public static boolean or35(int n) {
      if (n % 3 == 0 || n % 5 == 0) {
      System.out.println("true");
         return true;
      }
      System.out.println("false");
      return false;
   }
}