/*
Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ChallengeFourteen {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        IntPredicate isPrimo = numero -> {
            if (numero <= 1) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                    .allMatch(n -> numero % n != 0);
        };

        Integer maiorNumeroPrimo = numeros.stream()
                .mapToInt(Integer::intValue)
                .filter(isPrimo)
                .max()
                .orElse(0);

        System.out.println(maiorNumeroPrimo);
    }
}
