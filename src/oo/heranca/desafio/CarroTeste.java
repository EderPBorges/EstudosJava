package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro sonata = new Sonata();
        Carro ferrari = new Ferrari();

        sonata.acelerar(sonata, 5);
        sonata.acelerar(sonata, 5);
        sonata.acelerar(sonata, 5);
       // sonata.acelerar(sonata, 5);
       // sonata.desacelerar(sonata);

        ferrari.acelerar(ferrari, 15);
        ferrari.acelerar(ferrari, 15);
        ferrari.acelerar(ferrari, 15);
       // ferrari.acelerar(ferrari, 15);
       // ferrari.desacelerar(ferrari);

        System.out.println("A Velocidade atual do sonata é " + sonata.velocidadeAtual);
        System.out.println("A Velocidade atual da ferrari é " + ferrari.velocidadeAtual);
    }
}
