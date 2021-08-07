import java.util.*;
public class keypadCombination {
    public static void main(String[] args) {
        String str = "23";
        System.out.println(combinations(str));
      }
    
      static String[] codes = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
      public static ArrayList<String> combinations(String str) {
    
        if (str.length() == 0) {
          ArrayList<String> bres = new ArrayList<>();
          bres.add("");
          return bres;
        }
    
        char ch = str.charAt(0);
        String ros = str.substring(1);
    
        ArrayList<String> rres = combinations(ros);
        ArrayList<String> mres = new ArrayList<>();
    
        String letters = codes[ch - '0'];
        for (int i = 0; i < letters.length(); i++) {
          char chcode = letters.charAt(i);
          for (String rstr : rres) {
            mres.add(chcode + rstr);
          }
        }
        return mres;
      }
}
