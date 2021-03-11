package Classe;

public class Data {

    int Dia;
    String Mes;
    int Ano;

    String obterDataFormatada(){
        return String.format("%d/%s/%d", Dia, Mes , Ano);
    }

    // \/ não é muito bom ( não funciona em outros ambientes/aplicaçoes )
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}
