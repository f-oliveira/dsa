package exercises.window;

import java.util.HashMap;

public class FruitIntoBasket {
    /*
        Exercício 1: Fruit Into Baskets (O Problema das Duas Frutas)
        Este exercício é perfeito para praticar o uso de um HashMap para controlar a frequência de itens dentro da janela.

        Enunciado:
        Você está em um pomar e tem apenas duas cestas. Cada cesta pode carregar apenas um tipo de fruta, mas não há limite de quantidade. Você caminha da esquerda para a direita e deve pegar uma fruta de cada árvore. Se encontrar uma árvore com um terceiro tipo de fruta e não tiver cestas vazias, você deve parar.

        Qual o número máximo de frutas que você consegue colher consecutivamente?

        Input: fruits = [1, 2, 1, 2, 3]

        Output: 4 (A sequência [1, 2, 1, 2])

        Dica: Use um HashMap<Integer, Integer> para armazenar {TipoDaFruta: QuantidadeNaJanela}. Quando o tamanho do mapa for maior que 2, comece a encolher o left.
    */
public static int fruitIntoBasket(int[] fruits) {
    int maxLength = 0;
    int left = 0;
    // O nome 'counts' é melhor que 'set' porque estamos contando frequências
    HashMap<Integer, Integer> counts = new HashMap<>();

    for (int right = 0; right < fruits.length; right++) {
        // Adiciona ou incrementa a fruta atual
        counts.put(fruits[right], counts.getOrDefault(fruits[right], 0) + 1);

        // Enquanto tivermos mais de 2 tipos de frutas
        while (counts.size() > 2) {
            int leftFruit = fruits[left];
            // Diminuímos a contagem da fruta que está saindo pela esquerda
            counts.put(leftFruit, counts.get(leftFruit) - 1);

            // CRÍTICO: Se a contagem zerar, removemos o tipo do mapa
            if (counts.get(leftFruit) == 0) {
                counts.remove(leftFruit);
            }
            left++;
        }

        // O tamanho da janela atual é a quantidade de frutas colhidas
        int currentWindowSize = right - left + 1;
        maxLength = Math.max(maxLength, currentWindowSize);
    }

    return maxLength;
}

    public static void main(String args[]) {
        int result = fruitIntoBasket(new int[] {1, 2, 1, 2, 3});

        System.out.println(result);
    }
}
