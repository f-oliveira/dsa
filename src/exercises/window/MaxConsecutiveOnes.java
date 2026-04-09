package exercises.window;

public class MaxConsecutiveOnes {
    /*
        Dado um array binário nums (apenas 0s e 1s) e um inteiro k, você pode inverter no máximo k zeros para torná-los uns. 
        Retorne o comprimento máximo de um sub-array que contém apenas 1s após essas inversões.

        Input: nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0], k = 2

        Output: 6

        Explicação: Se você inverter os dois zeros nos índices 4 e 5, o array fica [1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0].
        A maior sequência de 1s tem tamanho 6.

        Dica: O right vai andando e contando quantos zeros você já encontrou. 
        Se o contador de zeros passar de k, o left precisa andar até "expulsar" um zero da janela para recuperar o crédito.
    */
    public static int maxConsecutiveOne(int[] arr, int k) {
        int maxLength = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < arr.length;right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--; // Recuperamos 1 crédito porque esse zero saiu da janela
                }
                left++;
            }

            int currentWindow = right - left + 1;
            maxLength = Math.max(maxLength, currentWindow);
        }


        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOne(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 2));
    }
}
