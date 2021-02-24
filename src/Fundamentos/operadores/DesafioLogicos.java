package Fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        // trabalho na terça (V OU F)
        // trabalho na quinta ( V OU F)

        /* Minha versão
        System.out.println("trabalho terca = false / trabalho quinta = true");
        boolean trabalhoterca = false;
        boolean trabalhoquinta = true;
        System.out.println("Sorvete + tv 32");

        System.out.println("trabalho terca = true / trabalho quinta = true");
        trabalhoquinta = true;
        trabalhoterca = true;
        System.out.println("Sorvete + tv 50");

        System.out.println("trabalho terca = false / trabalho quinta = false");
        trabalhoquinta = false;
        trabalhoterca = false;
        System.out.println("a familia esta mais saldavel pq não tem sorvete e não compraram nenhuma TV");
        */

        // RESPOSTAS

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // operador unario
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\" ?" + comprouTV50);
        System.out.println("Comprou TV 32\" ?" + comprouTV32);
        System.out.println("Comprou Sorvete?" + comprouSorvete);
        System.out.println("Mais saldavel?" + maisSaudavel);




    }

}
