package exercises.arrays_strings;

public class TwoSum2 {

  // Imagine que você tem um array ordenado: [1, 2, 4, 6, 8, 11] e eu te peço para
  // encontrar dois números que somam 10.

  public static void isSum(int[] array) {
    int left = 0;
    int right = array.length - 1;
    int target = 10;

    while (left < right) {
      int currentSum = array[left] + array[right];

      if (currentSum == target) {
        System.out.println(array[left] + " + " + array[right] + " = " + target);
        return;
      } else if (currentSum < target) {
        left++;
      } else {
        right--;
      }
    }
  }

  public static void main(String[] args) {
    isSum(new int[] { 1, 2, 4, 6, 8, 11 });
  }
}