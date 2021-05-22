package Streams;

public class Cliente {
    final String nome;
    final String tipoConta;
    final double saldo;
    final String nomeBanco;

    public Cliente(String nome, String tipoConta, double saldo, String nomeBanco) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }
}
