package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "C#", "JavaScript", "Python", "Ruby");

        Predicate<String>maisQueCinco = palavra -> palavra.length() < 5;

        palavras.stream().filter(maisQueCinco).forEach(System.out::println);
    }
}
