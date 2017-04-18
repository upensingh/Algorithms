package strings;

/**
 * A look and say sequence looks like
 * 1,11,21,1211,111221,312211....
 * 1, one 1, two 1s, one 2 one 1, so on
 * given n find the nth term in this sequence
 * @author upendrasingh
 *
 */
public class lookSaySequence {

	public static void main(String[] args) {
		final int n=6;
		String s = lookAndSay(n);
		assert(s.equalsIgnoreCase("312211"));
	}

	
	private static String lookAndSay(int n) {
		String s = "1";
		for(int i=1;i<n;i++){
			s = getNextTerm(s);
		}
		return s;
	}

	private static String getNextTerm(String s) {
		String ret = "";
		for(int i=0;i<s.length();i++){
			int count = 1;
			while(i+1<s.length() && s.charAt(i) == s.charAt(i+1)){
				++i;
				++count;
			}
			ret += count+""+s.charAt(i);
		}
		return ret;
	}

}
