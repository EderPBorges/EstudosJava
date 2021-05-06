package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Sonata;

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

        System.out.println("A velocidade maxima do sonata é " + sonata.VELOCIDADE_MAXIMA);
        System.out.println("A velocidade maxima da ferrari é " + ferrari.VELOCIDADE_MAXIMA);
    }
}
