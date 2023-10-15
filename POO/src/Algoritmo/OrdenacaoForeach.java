package Algoritmo;

import java.util.*;

public class OrdenacaoForeach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nome 3");
        names.add("Nome 5");
        names.add("Nome 4");
        names.add("Nome 1");
        names.add("Nome 2");

        //ORDENAR POR COLLECTIONS
        Collections.sort(names);
        //Foreach
        for (String name: names) {
            System.out.println(name);
            //ordena por nome
            //se for por numero, vai por numero, tem regra pra ordenar tb.
        }
    }
}
