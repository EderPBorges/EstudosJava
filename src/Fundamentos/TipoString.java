package Fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá Pessoal".charAt(5));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        String nome = "Pedro";
        String sobrenome = "Santos";
        int idade = 33;
        double salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n";
        System.out.println(maisUmaFrase);


        //   System.out.println("Nome: " + nome + "Sobrenome" + sobrenome);
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        System.out.println(frase);


        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(0, 7));

    }






}
