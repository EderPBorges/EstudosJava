package oo.heranca.desafio;

public class Carro {
    int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    int frear = velocidadeAtual;
    int delta = 5;

    Carro (int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar (Carro carro, int acelerar){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            carro.velocidadeAtual += acelerar;
        }
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
