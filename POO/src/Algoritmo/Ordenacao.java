package Algoritmo;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 30, 4, 3, 5, 1, 2, 3, 10};
        Arrays.sort(numbers);
        System.out.println(numbers); //<- hackcode int[] (identificador)
        //retorna um hashcode - codigo hach pra identificar o objeto
        // precisa fazer uma interacao na colecao pra imprimir cada elemento pelo indice

        System.out.println(Arrays.toString(numbers));
        // aqui imprime cada um.
    }
}
