package Strings;

import java.util.Scanner;

public class ComparandoStrings {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Digite a sua senha");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass));
        //System.out.println(password == pass); -> false
        //valor de memoria alocada de password = 001
        //valor do espaco de memoria alocada de pass = 002
        // == nao compara o conteudo, mas a referencia dos objetos
        // sao strings diferentes pq foram armazenadas em um local diferente
        //p ser igual teria que estar alocado no mesmo espaco de memoria com o mesmo conteudo

        String x = new String("123456");
        String y = new String("123456");
        System.out.println(x == y);
        //da false pq objetos armazenados em locais de memoria diferentes

        String z = "123456";
        String w = "123456";
        System.out.println(z == w);
        //retorna true pq ta no mesmo lugar de memoria

    }
}
