package Contorle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        // Domingo -> 1
        // quarta -> 4
        // terça -> 3
/*
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o dia da semana: ");

        String diasemana = entrada.next();

        if ("domingo".equals(diasemana.trim())) {
            System.out.println("Dia 1");
        } else if ("segunda".equals(diasemana.trim())) {
            System.out.println("Dia 2");
        } else if ("terça".equals(diasemana.trim())) {
            System.out.println("Dia 3");
        } else if ("quarta".equals(diasemana.trim())) {
            System.out.println("Dia 4");
        } else if ("quinta".equals(diasemana.trim())) {
            System.out.println("Dia 5");
        } else if ("sexta".equals(diasemana.trim())) {
            System.out.println("Dia 6");
        } else if ("sabado".equals(diasemana.trim())) {
            System.out.println("Dia 7");
        } else {
            System.out.println("Dia Invalido! ");
        }
  */ // meu exemplo (deu certo)

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do dia: ");

        String dia = entrada.next();

     //   if ("domingo".equals(dia.toLowerCase())) Tambêm poderia fazer assim
     //     System.out.println(1);

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(dia)
                || "terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(dia)
                || "sabado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido!");
        }
        entrada.close();


    }
}
