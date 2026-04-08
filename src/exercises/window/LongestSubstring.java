package exercises.window;

import java.util.HashSet;

public class LongestSubstring {

    /**
        Problem: Given a string s, find the length of the Longest Substring without repeating characters.
        Example: s = "abcabcbb"

        Hint: Use a HashSet<Character> to keep track of characters in the current window. 
        
        If s.charAt(right) is already in the set, it's time for left to shrink the window!       
    */

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    
    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    
}
