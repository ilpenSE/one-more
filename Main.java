import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(equalsOneMore("hello","hi","world","hello"));
    System.out.println(containsOneMore("hello man","hi","world","hello"));
  }
  
  public static boolean equalsOneMore(Object query, Object... vals) { 
   return Arrays.toString(vals).contains((CharSequence) query);
  }
  
  public static boolean containsOneMore(String query,String... values) {
        int i = 0;
        for (String s : values) {
            i += query.contains(s) ? 1 : 0;
        }
        return i > 0;
    }
}
