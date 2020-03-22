/*
*The parameter weekday is true if it is a weekday, 
*and the parameter vacation is true if we are on vacation. 
*We sleep in if it is not a weekday or we're on vacation. 
*Return true if we sleep in.

*sleepIn(false, false) → true
*sleepIn(true, false) → false
*sleepIn(false, true) → true
*/
public class Sleep {
   public static void main(String[] args) {
      boolean weekday = true;
      boolean vacation = true;
      sleepIn(weekday, vacation);
   }
   
   public static boolean sleepIn(boolean weekday, boolean vacation) {
      // we sleep in if it is not a weekday or we are on vacation
      if(!weekday || vacation) {
         return true;
      }
      return false;
      }
}