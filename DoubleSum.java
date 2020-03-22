/*
* Given two int values, return their sum. 
* Unless the two values are the same, 
* then return double their sum.

* sumDouble(1, 2)  3
* sumDouble(3, 2)  5
* sumDouble(2, 2)  8
*/

public class DoubleSum {
   public static void main(String[] args) {
      int a;
      int b;
      sumDouble(1, 2);
      sumDouble(3, 2);
      sumDouble(2, 2);
   }
   public static int sumDouble(int a, int b) {
      int sum = a + b;
      if(a == b) {
         sum = 2 * sum;
      }
      System.out.println(sum);
      return sum;
   }
   

}