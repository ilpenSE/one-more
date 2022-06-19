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
  
  public static boolean equalsIgnoreCaseOneMore(Object query,Object... values) {
    return Arrays.toString(values).toLowerCase().contains(((CharSequence) query).toLowerCase());
  }
    
  public static boolean containsIgnoreCaseOneMore(String query,String... values) {
    int i = 0;
    for (String s : values) {
      i += query.toLowerCase().contains(s.toLowerCase()) ? 1 : 0;
    }
    return i > 0;
  }
}
