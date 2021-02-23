package Fundamentos;

import java.util.Scanner;

/*
nesse desafio a partir do scanner, devera ser pego 3 strings usando nextline e essas strigs
vão receber salarios, devera ser calculado a media dos ultimos 3 salarios
o funcionario pode separar as casas decimais com virgula ou ponto
- converter string em valor numerico e usar no scanner ou next ou nextline
*/
public class DesafioConversao {

    public static void main(String[] args) {
        /* NÃO DEU CERTO
        String salario1, salario2, salario3;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu 3° ultimo salario: ");
        salario1 = leitor.nextLine();
        System.out.print("Informe seu 2° ultimo salario: ");
        salario2 = leitor.nextLine();
        System.out.print("Informe seu ultimo salario: ");
        salario3 = leitor.nextLine();

        double sal1 = Double.parseDouble(salario1);
        // testando System.out.println(sal1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);
        double resultado = sal1 + sal2 + sal3 / 3;

        double mediasalario = Double.parseDouble(salario1 + salario2 + salario3);
        mediasalario = mediasalario / 3;
        System.out.println("Média é:" + resultado);
        */

        // RESPOSTA

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro salario :");
        String valor1 = entrada.next().replace(",",".");

        System.out.println("Informe o segundo salario :");
        String valor2 = entrada.next().replace(",",".");

        System.out.println("Informe o terceiro salario :");
        String valor3 = entrada.next().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A media dos salarios é: " + media);

        entrada.close();

    }


}
