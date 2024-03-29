package Lambdas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
         1. A patir do produto calcular o preco real (com desconto)
         2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
         3. Frete: >= 3000 (100)/ < 3000 (50)
         4. Arredondar: Deixar duas casas decimais
         5. Formatar: RS1234,56
         */
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.00", dfs);
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(df.format(preco));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preco final é " + preco);

    }
}
