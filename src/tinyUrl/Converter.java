package tinyUrl;

class Converter {

	private static final char[] map = {
		'0','1','2','3','4','5','6','7','8','9',
		'A','B','C','D','E','F','G','H','I','J',
		'K','L','M','N','O','P','Q','R','S','T',
		'U','V','W','X','Y','Z','a','b','c','d',
		'e','f','g','h','i','j','k','l','m','n',
		'o','p','q','r','s','t','u','v','w','x',
		'y','z'
	};

	private static int UPPER_OFFSET = 55;
	private static int LOWER_OFFSET = 61;

	public static String decToBase62(int num) {
		StringBuilder sb = new StringBuilder();
		while(num != 0) {
			int rem = num%62;
			sb.append(map[rem]);
			num /= 62;
		}
		return sb.reverse().toString();
	}

	public static int base62ToDecimal(String str) {
		if(str==null)
			return -1;
		int mul = 1;
		int res = 0;
		for(int i=str.length()-1;i>=0;i--){
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				res=res+mul*(c-'0');
			}else if(c>= 'A' && c<='Z') {
				res=res+mul*((int)c-UPPER_OFFSET);
			}else if(c>='a' && c<= 'z') {
				res=res+mul*((int)c-LOWER_OFFSET);
			}
			mul*=62;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num=1234354;

		String str = Converter.decToBase62(num);
		int res = Converter.base62ToDecimal(str);

		assert(str!=null);
		assert(res != -1);
		assert(res==num);
	}
}