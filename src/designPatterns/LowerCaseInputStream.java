/**
Example for Decorator Pattern, LowerCaseInputStream extends FilterInputStream
and overrides read methods to convert all characters to lower case, 
basically decorates the InputStream
*/
public class LowerCaseInputStream extends FilterInputStream{
   
   public LowerCaseInputStream(InputStream in) {
      super(in);
   }
   
   public int read() throws IOException {
      int c = super.read();
      return c==-1?c:Character.toLowerCase((char)c);
   }
   
   public int read(byte[] b, int offset, int len) throws IOException {
      int result = super.read(b, offset, len);
      for(int i=offset; i<offset+result;i++) {
         b[i] = (byte) Character.toLowerCase((char)b[i]);
      }
      return result;
   }
}