public class HasTeen {
   public static void main(String[] args) {
      int a;
      int b;
      int c;
      hasTeen(13, 20, 10);
   }
   public static boolean hasTeen(int a, int b, int c) {
      if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)|| (c >= 13 && b <= 19)) {
         return true;
       }
       return false;
   }
}