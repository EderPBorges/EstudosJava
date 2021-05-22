package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class DesafioFilter {
    public static void main(String[] args) {

        Banco b1 = new Banco("Santander");
        Banco b2 = new Banco("Itau");
        Banco b3 = new Banco("Bradesco");

        Cliente c1 = new Cliente
                ("João", "Private", 55.00, "Santander");
        Cliente c2 = new Cliente
                ("Pedro", "Comum", 2.00,"Bradesco");
        Cliente c3 = new Cliente
                ("Paulo", "Comum", 36.70, "Itau");
        Cliente c4 = new Cliente
                ("Eder", "Private", 10000.00, "Santander");
        Cliente c5 = new Cliente
                ("Murilo", "Private", 85000.00, "Bradesco");
        Cliente c6 = new Cliente
                ("Larissa", "Comum", 500.00, "Itau");

        List<Banco> bancos = Arrays.asList(b1, b2, b3);
        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);


    }
}
