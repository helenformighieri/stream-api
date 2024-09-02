/*
Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeTwelve {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer produto = numeros.stream()
            .reduce(1, (a, b) -> a * b);

        System.out.println(produto);
    }
}
