/*
Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeNine {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoDistintos = numeros.stream().allMatch(n -> numeros.stream().filter(n2 -> n2.equals(n)).count() == 1);

        System.out.println(saoDistintos);
    }
}
