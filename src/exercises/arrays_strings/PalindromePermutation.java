package exercises.arrays_strings;

import java.util.Hashtable;
import java.util.Map;

/*
1.4 Palindrome Permutation: Given a string, write a function to check if it is a
permutation of a palindrome. A palindrome is a word or phrase that is the same
forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.) 

Hints: #106, #121, #134, #136 
*/

/*
Para uma String desorganizada poder ser considera um palindromo, ela deve ter no 
maximo um caracter que nao se repete.

Casos:

1. Se o total de letras for PAR, todos os caracteres devem se repetir 2 vezes.
2. Se o total de letrar for IMPAR, um caracter nao pode se repetir e outros devem 
se repetir 2 vezes.

Exemplo par:

aabbccdd - todas as letras se repetem 2 vezes.

Exemplo impar: aabbc - a e b se repetem 2 vezes, c nao se repete.

*/

public class PalindromePermutation {
  public boolean isPalindrome(String str) {
    Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();  
    String strLower = str.toLowerCase();

    int c = 0;

    for (int i = 0; i < str.length();i++) {
      if (strLower.charAt(i) == ' ') continue;
      if (hash.containsValue(3)) return false;
      if (hash.containsKey(strLower.charAt(i))) {
        hash.put(strLower.charAt(i), hash.getOrDefault(strLower.charAt(i), 0) + 1);
      } else {
        hash.put(strLower.charAt(i), 1);
      }
    }

    if (strLower.length() % 2 == 0 && !hash.containsValue(1)) {
      return true;
    } else {
      for (Map.Entry<Character, Integer> entrada : hash.entrySet()){
        if (entrada.getValue() == 1) {
          c++;
        }
      }

      if (c > 1) return false;
    }

    
    return true;
  }

  // O(n)
  public boolean isPalindrome2(String str) {
    Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();  
    String strLower = str.toLowerCase();

    for(char c : strLower.toCharArray()) {
      if (c == ' ') continue;

      hash.put(c, hash.getOrDefault(c, 0) + 1);
    }

    int oddCount = 0;
    for (int count : hash.values()) {
      if (count % 2 != 0) {
        oddCount++;
      }
    }
    return oddCount <= 1;
  }

  // Estudar depois
  public boolean isPermutationOfPalindromeOptimized(String str) {
    int bitVector = 0;
    String strLower = str.toLowerCase();

    for (char c : strLower.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            int mask = 1 << (c - 'a');
            // Se o bit já estiver ligado, o XOR o desliga (par).
            // Se estiver desligado, o XOR o liga (ímpar).
            bitVector ^= mask;
        }
    }

    // Se o bitVector for 0, todas as contagens foram pares.
    // Se tiver apenas um bit ligado, é uma potência de 2.
    return bitVector == 0 || (bitVector & (bitVector - 1)) == 0;
  }
}