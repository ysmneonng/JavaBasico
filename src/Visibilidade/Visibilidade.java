package Visibilidade;

// padrao - default
// public - publica p/ todas as packages
// private - privada p/ todos os packages, apenas acessivel pela classe atual
// protected - POO

public class Visibilidade {
    static int x;

    public static void main(String[] args) {
        //o que é esse public?
        //VISIBILIDADE DE ESCOPO DO PROJETO!
        //int x; - aqui nao é visivel em outros blocos, tenho que declarar fora.

    }

    public static void sum (int a, int b){
        System.out.println(x);
    }
}
