package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double [] notasALunoA = new double[4];
        System.out.println(Arrays.toString(notasALunoA));

        notasALunoA [0] = 7.9;
        notasALunoA [1] = 8;
        notasALunoA [2] = 6.7;
        notasALunoA [3] = 9.7;

        System.out.println(Arrays.toString(notasALunoA));
        System.out.println(notasALunoA[0]);
        System.out.println(notasALunoA[notasALunoA.length - 1]);
        // System.out.println(notasALunoA[4]); ERRO!

        double totalAlunoA = 0;
        for (int i = 0; i < notasALunoA.length; i++){
            totalAlunoA += notasALunoA[i];
        }

        System.out.println(totalAlunoA / notasALunoA.length);

        final double notaArmazenada = 5.9;
        double [] notasAlunoB = {6.9, 8.9 ,notaArmazenada, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
