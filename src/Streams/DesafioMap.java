package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
/*
  1. Numero para string binaria... 6 => "110"
  2. Inverter a string... "110" => "001"
  3. Converter de volta para inteiro => "011" => 3
  Integer. << dica
*/
public class DesafioMap {

    public static void main(String[] args) {

        Consumer<Integer> println = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2); // se o segundo parametro for o 2, o java entende que você esta passando uma string binaria (ele espera um decimal)

        nums.stream()
                .map(Integer::toBinaryString) // nem precisou criar uma função
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);

    }
}
