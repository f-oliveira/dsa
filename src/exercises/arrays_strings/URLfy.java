package exercises.arrays_strings;

import java.util.Hashtable;

/**
    1.3 URLify: Write a method to replace all spaces in a string with '%20'. 
    You may assume that the string has sufficient space at the end to hold the 
    additional characters, and that you are given the "true" length of the string. 
    (Note: If implementing in Java, please use a character array so that you can 
    perform this operation in place.)
*/

public class URLfy {
  public String replace(String str) {
    StringBuilder ch1 = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
            ch1.append("%20");
        } else {
            ch1.append(str.charAt(i));
        }
    }

    return ch1.toString();
  }
}