package exercises.arrays_strings;

import java.util.Hashtable;
import java.util.Arrays;


// 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 

public class CheckPermutation {
  // Example O(n log n)
  public boolean check(String str1, String str2) {

    int n1 = str1.length(); 
    int n2 = str2.length(); 

    if (n1 != n2) 
    return false; 
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();

    Arrays.sort(ch1); 
    Arrays.sort(ch2); 

    for (int i = 0; i < n1; i++) 
    if (ch1[i] != ch2[i]) 
        return false; 

    return true; 
  }

  // Example O(n)
  public boolean checkPermutation(String str1, String str2) {
      if (str1.length() != str2.length()) return false;

      // Vamos assumir ASCII estendido (256 chars). Se só minúsculas, use 26.
      int[] count = new int[256];

      for (char c : str1.toCharArray()) {
          count[c]++;  // conta ocorrência em str1
      }

      for (char c : str2.toCharArray()) {
          count[c]--;  // remove ocorrência ao ver em str2
          if (count[c] < 0) return false; // apareceu mais em str2 que em str1
      }

      return true; // todas contagens zeraram
  }

}