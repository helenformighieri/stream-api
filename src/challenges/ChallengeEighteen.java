/*
Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeEighteen {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));

        System.out.println(todosIguais);
    }
}
