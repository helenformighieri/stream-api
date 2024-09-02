package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> sum = (numb1, numb2) -> numb1 + numb2;

        int resultado = numbers.stream()
            .reduce(0, sum);

        System.out.println("Resultado: " + resultado);
    }
}
