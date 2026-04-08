package exercises.window;

public class MinSubArrayLen {

      // Problema: Dado um array de números positivos, encontre o comprimento do menor sub-array cuja soma seja maior ou igual a 7.
  // Array: [2, 3, 1, 2, 4, 3]
  public static int minSubArrayLen(int target, int[] nums) {
      int left = 0;
      int currentSum = 0;
      int minLength = Integer.MAX_VALUE; // Começamos com o maior valor possível

      for (int right = 0; right < nums.length; right++) {
          // 1. Expandimos a janela adicionando o elemento da direita
          currentSum += nums[right];

          // 2. Enquanto a condição for aceitável (soma >= 7)
          while (currentSum >= target) {
              // Calculamos o tamanho atual da janela (right - left + 1)
              int currentWindowLength = right - left + 1;
              minLength = Math.min(minLength, currentWindowLength);

              // 3. Tentamos encolher a janela pela esquerda para achar um tamanho menor
              currentSum -= nums[left];
              left++;
          }
      }

      // Se o minLength nunca foi alterado, significa que nenhum sub-array soma 7
      return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
  }
    
}
