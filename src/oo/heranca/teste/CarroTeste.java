package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Sonata;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Sonata();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.ligarARr();
        c2.desligarAr();

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);




    }
}
