package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

         /*
         Consumer<Integer> imprime = numero -> {
             if (numero % 2 == 0) {
                 System.out.println(numero);
             }
         };
          */

        numeros.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
