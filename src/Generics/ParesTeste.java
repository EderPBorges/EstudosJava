package Generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoCOncurso = new Pares<>();

        resultadoCOncurso.adicionar(1, "Maria");
        resultadoCOncurso.adicionar(2, "Pedro");
        resultadoCOncurso.adicionar(3, "Gui");
        resultadoCOncurso.adicionar(4, "Ana");
        resultadoCOncurso.adicionar(2, "Rebeca");

        System.out.println(resultadoCOncurso.getValor(1));
        System.out.println(resultadoCOncurso.getValor(4));
        System.out.println(resultadoCOncurso.getValor(2));
    }
}
