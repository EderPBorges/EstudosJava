package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {


        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.1234567888; // explícita (CAST)
        System.out.println(b);

        int c = 231;
        byte d = (byte) c; // explicita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // explicita (CAST)
        System.out.println(f);

    }









}
