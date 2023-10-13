package Funcao;

public class funcao {
    public static void main(String[] args) {
        calc(10, 16); //Argumentos

    }

    static void calc(int x, int y) {
        // criando instrucao de soma, criando um bloco de codigo da qual podera ser chamado utilizando o nome sum
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);

    }
}
// Static Void -> DECLARACAO PADRAO
// calc -> NOME DA FUNCAO (poderia ser qqr coisa), GERALMENTE USA-SE VERBOS PARA DEFINIR O Q A FUNCAO FAZ
// () -> DEFINIR O QUE CHEGARA NA FUNCAO. (Tipo NomeDaVariavel)
// {} -> BLOCO DE CODIGO QUE SERA EXECUTADO
