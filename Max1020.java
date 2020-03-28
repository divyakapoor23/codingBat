/* 
* Given 2 positive int values, return the larger value 
* that is in the range 10..20 inclusive, or return 0 
* if neither is in that range.
* max1020(11, 19) -> 19
* max1020(19, 11) -> 19
* max1020(11, 9) -> 11
*/
public class Max1020 {
   public static void main(String[] args) {
      int a;
      int b;
      max1020(a, b);
   }
   public static int max1020(int a, int b) {
      int temp;
      if(a < b) {
         temp = a;
         a = b;
         b = temp;
      }
      else {
         temp = a;
      }
      if (a >= 10 && a <=20) {
         return a;
      }
      else if (b >= 10 && b <=20) {
         return b;
      }
      else {
         return 0;
      }
   }
}