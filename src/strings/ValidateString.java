/**
 * 
 */
package strings;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author upendrasingh
 * Validate String that consists of following types of brackets
 * [], {}, (), <>
 * For the string to be valid The brackets must close in the correct order,
 *  "()" and "()[]{}" are all valid but "(]" and "([)]" are not. 
 */
public class ValidateString {

   public static void main(String[] args) {
      assert(isValid(""));
      assert(isValid("(kjhdf(jkdf))[lkjs]{s[sd]}<sdf(f)>"));
      assert(!isValid("(kjhdf(jkdf))[lkjs]{s[sd]}<sdf(f>"));
      assert(!isValid("()(){}{}[}"));
      assert(isValid("[](){}<>[]"));
   }
   
   public static boolean isValid(String x) {
      Stack<Character> s = new Stack<Character>();
      HashMap<Character,Character> brackets = new HashMap<>();
      brackets.put('(', ')');
      brackets.put('{', '}');
      brackets.put('[', ']');
      brackets.put('<', '>');
      Character temp;
      for(Character c : x.toCharArray()){
         if(brackets.containsKey(c)){
            s.push(c);
         }
         else if(brackets.containsValue(c)){
            try{
               temp = s.pop();
            }catch(EmptyStackException e){
               return false;
            }
            if(brackets.get(temp)!=c)
               return false;
         }
      }
      return s.isEmpty();
   }
}
