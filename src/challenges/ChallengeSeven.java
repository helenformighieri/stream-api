/*
Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeSeven {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
            .sorted((n1, n2) -> Integer.compare(n2, n1))
            .skip(1)
            .findFirst()
            .get();

        System.out.println(segundoMaior);
    }
}
