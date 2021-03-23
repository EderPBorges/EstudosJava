
package Classe;



public class ProdutoTeste {

    public static void main(String[] args) {

        // utilizando construtor
        Produto p1 = new Produto("Notebook", 4356.89);


        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50; // alterando o desconto do produto

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho é = R$%.2f.", mediaCarrinho);
    }

}