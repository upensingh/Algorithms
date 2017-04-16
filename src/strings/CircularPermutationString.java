package strings;

/**
 * Program to find out if a string str1 is a circular permutation of string str2
 * e.g str1 = "aba" is a circular permutation of str2 = "baa"
 */
class CircularPermutationString {
   public static boolean isCircularPerm(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return false;
      }
      if (str1.concat(str1).contains(str2)) {
         return true;
      }
      return false;
   }

   public static void main(String[] args) {
      assert (isCircularPerm("aba", "baa"));
      assert (!isCircularPerm("abc", "bcc"));
      assert (!isCircularPerm("abcd", "asd"));
      assert (isCircularPerm("", ""));
   }
}