package exercises.window;

public class FindMaxSum {

  /**
    Problema Clássico: Maior Soma de Sub-array de tamanho $K$Vamos aplicar a Janela Fixa. Dado o array [2, 1, 5, 1, 3, 2] e $K=3$.
    
    Abordagem Ineficiente (Brute Force):
    
    Somar (2+1+5), depois (1+5+1), depois (5+1+3)... (Muitos cálculos repetidos).
    
    Abordagem Sliding Window (Otimizada):
    
    Calcula a soma inicial dos primeiros 3: $2 + 1 + 5 = 8$.
    
    Desloca a janela: Adiciona o 1 (próximo) e subtrai o 2 (que saiu). Nova soma: $8 + 1 - 2 = 7$.
    Desloca de novo: Adiciona o 3 e subtrai o 1. Nova soma: $7 + 3 - 1 = 9$.
  */
  
  public static int findMaxSum(int[] arr, int k) {
      int maxSum = 0;
      int windowSum = 0;

      // 1. Criar a primeira janela
      for (int i = 0; i < k; i++) {
          windowSum += arr[i];
      }
      maxSum = windowSum;

      // 2. Deslizar a janela até o fim do array
      for (int i = k; i < arr.length; i++) {
          // Adiciona o elemento atual (i) e remove o que ficou pra trás (i - k)
          windowSum += arr[i] - arr[i - k];
          maxSum = Math.max(maxSum, windowSum);
      }

      return maxSum;
  }

  public static void main(String[] args) {
    findMaxSum(new int[] {2, 1, 5, 1, 3, 2}, 3);
  }
}