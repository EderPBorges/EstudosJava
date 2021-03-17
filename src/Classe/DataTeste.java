package Classe;

public class DataTeste {

    public static void main(String[] args) {


        Data d1 = new Data(13, "Janeiro", 1998); // utilizando construtor
        Data d2 = new Data();

    //    d1.Dia = 13;
    //    d1.Mes = "Janeiro";
    //    d1.Ano = 1998;

        d2.Dia = 10;
        d2.Mes = "Março";
        d2.Ano = 2021;

        String dataFormatada1 = d1.obterDataFormatada();
        // System.out.printf("Nascimento: Dia %d de %s de %d\n", d1.Dia, d1.Mes, d1.Ano );
        System.out.println(dataFormatada1);
        // System.out.printf("Data atual: Dia %d de %s de %d", d2.Dia, d2.Mes, d2.Ano );
        System.out.println(d2.obterDataFormatada());

        // não é muito bom \/
        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }

}
