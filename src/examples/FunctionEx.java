package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> dobrarNumeros = numeros.stream().map( num -> num * 2).toList();

        dobrarNumeros.forEach(System.out::println);
    }
}
