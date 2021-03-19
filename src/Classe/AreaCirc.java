package Classe;

public class AreaCirc {

    double raio; // variavel de instancia
     final static double PI = 3.1415; // com static vira variavel de classe

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio){ // metodo de classe (não precisa criar instancia)
        return PI * Math.pow(raio, 2);
    }
}
