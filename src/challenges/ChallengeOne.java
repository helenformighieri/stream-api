/*
Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*/

package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().sorted().forEach(System.out::println);
    }
}
