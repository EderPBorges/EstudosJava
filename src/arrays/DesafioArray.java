package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        System.out.print("Quantas notas deseja informar? ");
        Scanner leitor = new Scanner(System.in);
        int contador = leitor.nextInt();

        double notas[] = new double[contador];

        for (int i = 0; i < contador; i++) {
            System.out.println("Informe a nota : " + (i + 1));
            notas[i] = leitor.nextDouble();
        }

        double media = 0;

        for (double soma : notas) {
            media = media + soma;
        }
        System.out.println("A media das notas é : " + media / contador);
        leitor.close();
    }
}


