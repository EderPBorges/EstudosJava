package Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        // modo de trabalhar com operador ternario
        // String resultadoparcial = ;
        // String resultadofinal = media >= 7.0 ?
        // "aprovado." : media >= 5.0 ?
        // "em recuperação" : "reprovado";

        String resultadoFinal = media >= 7.0 ?
                "aprovado." : "em recuperação";

        System.out.println("O Aluno está " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("Tem desconto? %s", resultado);


    }
}
