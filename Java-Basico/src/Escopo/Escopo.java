package Escopo;

public class Escopo {
    public static void main(String[] args) {
        //ESCOPO DE VARIAVEIS
        // Variavel local - so fica viva dentro do bloco de codigo
        if (true) {
            int x = 10;
        } else {
            int x = 2;
        }
        //System.out.println(x); // aponta erro

    }
}
