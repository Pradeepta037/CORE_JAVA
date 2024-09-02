public class PD{
   public static void main(String[] args) {
    //   String str = "madam";
    //     String reversedStr = new StringBuilder(str).reverse().toString();
        // boolean isPalindrome = str.equals(reversedStr);
        // System.out.println("Is palindrome: " + isPalindrome);
      StringBuffer sb = new StringBuffer("madam");
      StringBuffer sb1 = sb.reverse();
      // System.out.println(sb);
      if(sb==sb1){
         System.out.println("Same");
      }else{
         System.out.println("Not Same");
      }
   }
}