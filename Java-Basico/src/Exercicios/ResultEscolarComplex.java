package Exercicios;
public class ResultEscolarComplex{
    public static void main(String[] args) {
        // cond encadeadas
        int nota = 8;

        if(nota >= 7)
            System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação!");

        else
        System.out.println("Reprovado!");
    }
}