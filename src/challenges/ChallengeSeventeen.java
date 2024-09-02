/*
Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ChallengeSeventeen {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .mapToInt(Integer::intValue)
                .filter(numero -> {
                    if (numero <= 1) return false;
                    return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                            .allMatch(n -> numero % n != 0);
                })
                .boxed()
                .toList();

        System.out.println("Números primos: " + numerosPrimos);
    }
}