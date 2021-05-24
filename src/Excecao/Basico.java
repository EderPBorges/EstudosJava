package Excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirALuno(a1);
        }catch(Exception excecao){
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }


        System.out.println("Fim :");
    }

    public static void imprimirALuno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
