public class StartHi {
   public static void main(String[] args) {
      String str;
      startHi("hi there");
      startHi("a");
      startHi("hello hi");
   }
   public static boolean startHi(String str) {
      if (str.length() < 2) {
         System.out.println("Hi I am less than 2 letters");
         return false;
      }
      String firstEquals = str.substring(0,2);
      if (firstEquals.equals("hi")) {
         System.out.println("hi hi");
         return true;
      }
      else {
         System.out.println("I am else");
         return false;
      }
   }
}