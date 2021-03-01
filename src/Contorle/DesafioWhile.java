package Contorle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        /*
        int contador = 0;
        double nota, notasomador = 0, resultado;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Informe a nota do aluno: ");
            nota = leitor.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida, informe uma nota entre 0 e 10");
            } else {
                contador++;
                notasomador = notasomador + nota;
            }

        } while (!"-1.0".equalsIgnoreCase(String.valueOf(nota)));
        resultado = notasomador / contador;
        System.out.println("a media das notas é " + resultado);
        */ //meu desafio (deu certo)

        // RESPOSTA!
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida!!!!  ;D");
            }

        }

        // calcular media
        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);
        entrada.close();
    }
}
