package oo.heranca.desafio;

public class Carro {
    public int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    protected int frear = velocidadeAtual;
    protected int delta = 5;

    protected Carro (int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar (Carro carro, int acelerar){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            carro.velocidadeAtual += acelerar;
        }
    }
    public boolean desacelerar (Carro carro){
        if(carro.frear > 0){
            carro.frear -= 5;
        }
        return true;
    }

    public String toString(){
        return "A velocidade atual é " + velocidadeAtual + "Km/h";
    }
}
