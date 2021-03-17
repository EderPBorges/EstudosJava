package Classe;

public class Data {

    int Dia;
    String Mes;
    int Ano;


    Data (){
        Dia = 01;
        Mes = "Janeiro";
        Ano = 1970;
    }

    Data (int diaInformado, String mesInformado, int anoInformado){
        Dia = diaInformado;
        Mes = mesInformado;
        Ano = anoInformado;
    }


    String obterDataFormatada(){
        return String.format("%d/%s/%d", Dia, Mes , Ano);
    }

    // \/ não é muito bom ( não funciona em outros ambientes/aplicaçoes )
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}
