package Fundamentos;

public class Temperatura {
    public static void main(String[] args)
    {
        final double fahrenheit = 100;
        final double FATOR = 5.0 /9.0;
        final double ajuste = 32;
        double celcius = (fahrenheit - ajuste) * FATOR;
        // System.out.println("O resultado é " + celcius + "C.");

        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_854_223L;

        // Tipo Numerico reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.1;

        // Tipo Boleano
        boolean estaDeFerias = false; //true

        // tipo caractere
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ":Ganha -> " + salario);
        System.out.println("Ferias?" + estaDeFerias);
        System.out.println("Status: " + status);

    }

}
