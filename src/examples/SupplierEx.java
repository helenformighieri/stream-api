package examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Welcome!";

        List<String> listaSaudacao = Stream.generate(saudacao).limit(7).toList();

        listaSaudacao.forEach(System.out::println);
    }
}
