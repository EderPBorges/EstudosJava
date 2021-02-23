package Fundamentos;

public class Notacaoponto {

    public static void main (String[] args)
    {
        double b = 2.3;
        String s = "Bom dia X";

        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        //   System.out.println(s);

        String x = "Leo".toUpperCase();
        //   System.out.println(x);

        String y = "Bom dia X".replace("X", "GUI").toUpperCase().concat("!!!");
        System.out.println(y);

        // tipos primitivos  não tem o operador "."
        int a = 3;
        System.out.println(a);


    }


}
