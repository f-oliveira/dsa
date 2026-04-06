package exercises.arrays_strings;

public class IsPalindrome {
  public boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right))
        return false;

      left++;
      right--;
    }

    return true;
  }

  public void main(String[] args) {
    isPalindrome("arara");
  }
}
