package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // ler num 1;
        // ler num 2;
        // + - * / %;

        /*
        double num1, num2;
        double resultado;
        //char operador;
        String operador;
        System.out.println("Informe o primeiro numero: ");
        Scanner leitor = new Scanner(System.in);
        num1 = leitor.nextDouble();
        System.out.println("Informe o segundo numero: ");
        Scanner leitor2 = new Scanner(System.in);
        num2 = leitor2.nextDouble();
        System.out.println("Informe - + * / %");
        Scanner leitor3 = new Scanner(System.in);
        operador = leitor3.next();
        */
        /*
         System.out.println(resultado);
          double resultadoFinal = operador.equals('+') ?
                resultado = num1 + num2 :
                operador.equals('-') ? resultado = num1 - num2 :
                operador.equals('/') ? resultado = num1 / num2 :
                operador.equals('%')? resultado = num1 % num2 :
                resultado = num1 * num2;

        resultado = "+".equals(operador) ? resultado = num1 + num2 : 0;
        resultado = "-".equals(operador) ? resultado = num1 - num2 : resultado;
        resultado = "*".equals(operador) ? resultado = num1 * num2 : resultado;
        resultado = "/".equals(operador) ? resultado = num1 / num2 : resultado;
        resultado = "%".equals(operador) ? resultado = num1 % num2 : resultado;

        System.out.println("O Resultado é " + resultado);
       */  //meu exemplo : deu certo.

        // RESULTADO:

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        //Lógica
        double resultado = "+".equals(op) ? num1+num2 : 0;
        resultado = "-".equals(op) ? resultado = num1 - num2 : resultado;
        resultado = "*".equals(op) ? resultado = num1 * num2 : resultado;
        resultado = "/".equals(op) ? resultado = num1 / num2 : resultado;
        resultado = "%".equals(op) ? resultado = num1 % num2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f",
                num1, op, num2, resultado);
        entrada.close();


    }
}
