package Loops.For;

public class ExemploForArray {

    public static void main(String[] args) {

        // Em arrays o indice inicia em 0

     String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

     for (int x = 0; x < alunos.length; x++) {

        System.out.println("O aluno no indicie x = " + x + " é " + alunos[x]);
     }
    }
}
