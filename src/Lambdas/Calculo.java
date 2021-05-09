package Lambdas;

@FunctionalInterface
public interface Calculo {

    double executar (double a, double b); // unico metodo abstrato

    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }

}
