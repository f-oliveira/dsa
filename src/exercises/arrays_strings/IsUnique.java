package exercises.arrays_strings;

import java.util.Hashtable;

/** 
  1.1 Is Unique: Implement an algorithm to determine if a string has all unique 
  characters. What if you cannot use additional data structures?
  */

public class IsUnique {

  // Example O(n)
  public boolean isUniqueChars(String str) {
    int checker = 0;
    for (int i = 0; i < str.length(); ++i) {
      int val = str.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0)
        return false;
      checker |= (1 << val);
    }
    return true;
  }

  // Example O(n^2)
  public boolean isUniqueChars2(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; i < str.length(); j++) {
        if (i == j)
          return false;
      }
    }
    return true;
  }

  public boolean isUniqueChars3(String str) {
    Hashtable<Character, Boolean> hash = new Hashtable<Character, Boolean>();

    for (int i = 0; i < str.length(); i++) {
      if (hash.containsKey(str.charAt(i)))
        return false;
      hash.put(str.charAt(i), true);
    }
    return true;
  }
}