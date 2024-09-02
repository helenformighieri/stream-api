/*
Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

package challenges;

import java.util.List;
import java.util.Arrays;

public class ChallengeFive {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = num.stream()
            .filter(n -> n > 5)
            .mapToInt(Integer::intValue)
            .average()
            .getAsDouble();

        System.out.println(media);

    }
}
