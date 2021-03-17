package Classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // construtor padrão
    Produto () {

    }

    // construtor recebendo todos os parametros
    Produto (String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }


}
