# Java EQUALS/CONTAINS One More Helpers
If you are using this: ```if (str.equals("string") || str.equals("integer") ...) ``` \
You won't wanna use using that above anymore with this methods that in this repo.
Methods (also in Main.java):

  ```java
    public static boolean equalsOneMore(Object query,Object... values) {
        return Arrays.toString(values).contains((CharSequence) query);
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
 ```
