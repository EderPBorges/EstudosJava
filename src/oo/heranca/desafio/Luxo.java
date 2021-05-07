package oo.heranca.desafio;

public interface Luxo {
    void ligarARr();
    abstract void desligarAr();

    default int velocidadeDoAr(){
        return 1;
    }
}
