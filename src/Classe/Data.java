package Classe;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Data {

    int dia;
    int mes;
    int ano;


    Data() {
        //  dia = 01;
        //  mes = 01;
        //  ano = 1970;
        this(1, 1, 1970); // chamar um construtor atravez de outro
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }

    // \/ não é muito bom ( não funciona em outros ambientes/aplicaçoes )
    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }


}
