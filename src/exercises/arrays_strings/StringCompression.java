package exercises.arrays_strings;

import java.lang.StringBuilder;
import java.util.HashMap;

public class StringCompression {

  /**
    1.6 Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    Hints:#92, #110 
  */

  public String solution(String str) {
    // Verify string length can be compressed
    if (str == null || str.length() <= 2) return str;

    // declare de aux variables
    StringBuilder compressed = new StringBuilder();
    int count = 0;

    // Iterate de string
    for (int i = 0; i < str.length(); i++) {
      count++; // count the repeat letters

      // if i + 1 is bigger than length, we came to the end of string
      // if str[i] is different of str[i + 1] we change de character, so we need to build our string and reset de counter.
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressed.append(str.charAt(i));
        compressed.append(count);

        count = 0;
      }
    }

    return compressed.length() < str.length() ? compressed.toString() : str;
  }
  
  public String solutionIncorreta(String str) {
    StringBuilder result = new StringBuilder();
    HashMap<Character, Integer> map = new HashMap<>();
    char aux = str.charAt(0);

    for(int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }

    for(char key : map.keySet()) {
      result.append(key);
      result.append(map.get(key));
    }

    return result.toString();
  }
}