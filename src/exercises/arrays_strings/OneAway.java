package exercises.arrays_strings;

public class OneAway {

  /*
    1.5 One Away: There are three types of edits that can be performed on strings: 
    insert a character,
    remove a character, or replace a character. Given two strings, write a 
    function to check if they are
    one edit (or zero edits) away. 

    EXAMPLE
      pale,  ple  -> true
      pales, pale -> true
      pale,  bale -> true
      pale,  bake -> false 

    Hints:#23, #97, #130 
  */
  public boolean checkEdit(String str1, String str2) {

    // if the diferrence is more than one, we have two edits, so return false.
    if (str1.length() - str2.length() > 1) return false;

    if (str1.length() == str2.length()) {
       return checkDiference(str1, str2);
    } else if (str1.length() < str2.length()) {
      return checkSize(str1, str2);
    } else if (str1.length() > str2.length()) {
      return checkSize(str2, str1);
    }

    return true;
  }

  private boolean checkDiference(String str1, String str2) {
    int oddCount = 0;
    for (int i = 0;i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) oddCount++;
    }

    if (oddCount <= 1) return true;

    return false;
  }

  private boolean checkSize(String str1, String str2) {
    int index1 = 0;
    int index2 = 0;
    while (index1 < str1.length() && index2 < str2.length()){
      if (str1.charAt(index1) != str2.charAt(index2)) {
        if (index1 != index2) {
          return false;
        }
          index2++; // avança só o maior
        } else {
          index1++;
          index2++;
        }
      }
      return true;
  }
}