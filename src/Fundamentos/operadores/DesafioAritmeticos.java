package Fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        /* Exemplo
        int a =  3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        double c =  Math.pow(a, 3);

        System.out.println(b);
        System.out.println(c);
        */

        /*
        double a = Math.pow( 6 * (3+2) / 3 * 2, 2);
        double b = Math.pow( ( 1 - 5) * (2 - 7) / 2, 2);
        double c = Math.pow( a - b , 3);
        double resultado = c / Math.pow( 10 , 3);
        System.out.println(resultado); // = 27000.0
        */ // Minha versão (ERREI FEIO)



        // TENTANDO NOVAMENTE: //
        /*
        double a = Math.pow(6 * (3 + 2) , 2);
        double b = a / 3*2;

        double c = Math.pow((1 - 5) * (2 - 7), 2);
        double d = c / 2;

        double e = Math.pow(b - d, 3);
        double resultado = e / Math.pow(10, 3);

        System.out.println(resultado); // 64000.0
        // ERREI FEIO DNV
        */

        // RESPOSTA

        double numA = Math.pow(6 * ( 3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB , 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado é " + resultado);

    }



}
