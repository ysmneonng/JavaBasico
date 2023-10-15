package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreenchendoArrays {
    public static void main(String[] args) {
        //ARRAY FIXO -> String[] nome
        String[] names1 = new String[10];
        System.out.println(Arrays.toString(names1));
        //imprime 10 espacos de memoria

        Arrays.fill(names1, "Desconhecido");
        //comecando com valor padrao ja.

        //ARRAYLIST - tamanhos dinamicos
        List<String> names2 = new ArrayList<>();

        //adicionando os elementos no array
        names2.add("Nome 1");
        names2.add("Nome 2");
        names2.add("Nome 3");
        names2.add("Nome 4");
        names2.add("Nome 5");

        //.size -> objeto, funcao do java q retorna o numero de elementos de uma lista
        for (int i = 0; i < names2.size(); i++) {
            System.out.println(names2.get(i));
            //imprime todos os numeros
        }

        //passar o elemento pra descobrir o indice
        int index = names2.indexOf("Nome 2");
        System.out.println(index);

        //descobrir o tamanho da lista -> isEmpty
        System.out.println(names2.isEmpty());

        //descobrir se a lista contem algum elemento -> contains
        System.out.println(names2.contains("Nome 10"));

        //verificar o tamanho da lista
        System.out.println(names2.size());

        //limpar a lista (remover todos os elementos sem ter que tirar o objeto de vida)
        names2.clear();
        //é um void, nao retorna valor. primeiro limpa depois imprime
        System.out.println(names2.isEmpty()); //vai retornar true pq limpamos

    }
}
