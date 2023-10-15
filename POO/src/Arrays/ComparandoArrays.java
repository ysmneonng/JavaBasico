package Arrays;

import java.util.Arrays;

public class ComparandoArrays {
    public static void main(String[] args) {
        // COMPARANDO ARRAYS
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{1, 2, 3};
        int[] numbersC = numbersA;

        System.out.println(numbersA == numbersB);
        //retorna false - aponta o mesmo espaco de memoria, q é diferente
        System.out.println(numbersA.equals(numbersB));
        //tb falso
        System.out.println(numbersA + " " + numbersB);
        // hashcode -> objetos diferentes
        // toda vez q eu faco um new eu faco um apontamento de espaco de memoria.
        // mesmo q o conteudo seja igual o espaco de memoria é diferente
        System.out.println(numbersA == numbersC);
        //retorna igual pq retorna o mesmo espaco de memoria

        //imprime o conteudo e iguala ele - ARRAYS.EQUALS
        System.out.println(Arrays.equals(numbersA, numbersB));
    }
}
