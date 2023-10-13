package Visibilidade;

public class User {
    public static void print() {
        System.out.println(Visibilidade.x);
        //consigo acessar pq estao na mesma estrutura de package. Se eu tentasse acessar
        //uma variavel de outra pasta, eu nao conseguiria.
    }
}
