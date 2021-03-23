package Classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.180);
        Comida c2 = new Comida("feijão", 0.3);

        Pessoa p = new Pessoa("João", 99.80);

        System.out.println(p.apresentar());
        p.Comer(c1);

        System.out.println(p.apresentar());
        p.Comer(c2);

        System.out.println(p.apresentar());
    }
}
