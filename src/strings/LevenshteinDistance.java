/**
 * 
 */
package strings;

/**
 * @author upendrasingh
 * https://en.wikipedia.org/wiki/Wagner%E2%80%93Fischer_algorithm
 * The Wagner–Fischer algorithm to compute LevenshteinDistance between two strings
 */
public class LevenshteinDistance {

   public static void main(String[] args) {
      assert(levenshteinDistance("Sunday", "Sunday")==0);
      assert(levenshteinDistance("Kitten", "Sitting")==3);
      assert(levenshteinDistance("", "abc")==3);
      assert(levenshteinDistance("abcdf", "")==5);
      assert(levenshteinDistance("abcdef", "pqrstu")==6);
      assert(levenshteinDistance("abcdefg", "abcdq")==3);
   }
   
   public static int levenshteinDistance (String s, String t) {
      //Using full matrix
      if(s == t)
         return 0;
      if (s.length() == 0)
         return t.length();
      if (t.length() == 0)
         return s.length();
      
      int m = s.length();
      int n = t.length();
      
      int d[][] = new int[m+1][n+1];
      //Initialize
      for(int i=0;i<=m;i++)
         d[i][0] = i;
      for(int i=0;i<=n;i++)
         d[0][i]=i;
      
      for(int i=1;i<=m;i++){
         for(int j=1;j<=n;j++) {
            if (s.charAt(i-1) == t.charAt(j-1)) {
               d[i][j] = d[i-1][j-1];
            }
            else {
               int temp = Math.min(d[i-1][j], d[i][j-1]);
               temp = Math.min(temp, d[i-1][j-1]);
               d[i][j] = temp+1;
            }
         }
      }
      return d[m][n];
   }

}
