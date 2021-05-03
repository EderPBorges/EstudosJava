package oo.heranca.desafio;

public class Carro {
    int velocidadeAtual = 0;
    int frear = velocidadeAtual;

    boolean acelerar (Carro carro, int acelerar){
        carro.velocidadeAtual += acelerar;
        return true;
    }
    boolean desacelerar (Carro carro){
        if(carro.frear > 0){
            carro.frear -= 5;
        }
        return true;
    }

    public String toString(){
        return "A velocidade atual é " + velocidadeAtual + "Km/h";
    }
}
