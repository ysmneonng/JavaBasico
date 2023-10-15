package ErrosProgramacao;

public class erros {
    public static void main(String[] args) {
        // 2 TIPOS DE ERROS: 

        // 1- ERRO DE COMPILAÇÃO
        // escrever o nome do tipo errado, esquecer o ; ex:
        // doube number1 = 10.45;
        double number1 = 10.45;
        System.out.println(number1);

        // 2- ERRO DE EXECUCAO:
        // Vai compilar tranquilamente, pq nao tem erro de sintaxe, 
        // mas nao vai rodar pq vai dar uma excessao (nao esperado pelo programa)
        int x = 10;
        int y = 0;
        System.out.println(x / y);

        // erro de compilacao: erro de escrita ou tipo de variavel.
        // erro de execucao: algo inesperado acontece - exeption
    }


}