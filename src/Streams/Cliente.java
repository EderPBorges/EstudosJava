package Streams;

public class Cliente {
    private String nome;
    private String tipoConta;
    private double saldo;
    private String contaBanco;

    public String getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(String contaBanco) {
        this.contaBanco = contaBanco;
    }

    public Cliente(String nome, String tipoConta, double saldo, String contaBanco) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.contaBanco = contaBanco;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
