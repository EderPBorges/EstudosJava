package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        // offer e add -> adicionam elementos na fila
        // a diferença é o comportamento quando a fila esta cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("GUi");

        // Peek e Element -> obter o proximo elemento da fila ( sem remover)
        // Diferença é o comportamento quando a fila esta vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());


        // Pool e Remove -> obter o proximo elemento da fila e remove
        // Diferença é o comportamento quando a fila esta vazia!
        System.out.println(fila.poll()); // retorna ja removendo
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //fila.size()
        //fila.clear()
        //fila.isEmpty
        //fila.contains(...)

    }
}
