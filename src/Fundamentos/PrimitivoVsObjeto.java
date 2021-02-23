package Fundamentos;

public class PrimitivoVsObjeto {
    public PrimitivoVsObjeto() {
    }

    public static void main(String[] args) {
        String s = new String("Texto");
        s.toUpperCase();
        System.out.println(s);
        int a = 123;
        System.out.println(a);
    }

}
