package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

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

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);

        //filter
        Predicate<Cliente> contasDiferenciadas = c -> c.tipoConta == "Private";
        Predicate<Cliente> contasValiosas = c -> c.saldo >= 10000.00;

        Function<Cliente, String> contatarClientes =
                c -> "Atenção cliente " + c.nome +
                        " Você foi selecionado como cliente especial do nosso banco "
                + c.nomeBanco + "!!";

        clientes.stream()
                .filter(contasDiferenciadas)
                .filter(contasValiosas)
                .map(contatarClientes)
                .forEach(System.out::println);

    }
}
