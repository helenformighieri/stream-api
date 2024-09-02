/*
Agrupe os números em pares e ímpares:
Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e
outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeSixteen {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
