package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); //criando a stream
        langs.forEach(print);

        String[] maisLangs = { "Pyton ", "Lisp ", "Perl ", "Go\n" }; //criando a stream

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs, 1, 4).forEach(print); // selecionando os elementos para impressão

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n"); //criando a stream
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); // imprimindo stream paralelo (dados não processados na ordem)

        // Stream.generate(() -> "a").forEach(print); // gerando stream de forma infinita (sem ordenação)
        // Stream.iterate(0, n -> n + 1).forEach(println); // gerando stream de forma infinita (ordenada)

    }
}
