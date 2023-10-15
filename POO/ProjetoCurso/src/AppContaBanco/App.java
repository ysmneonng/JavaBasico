package AppContaBanco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("0001", "101510","Yasmine Oenning");

        while (true) {
            System.out.println("Digite o código da operação desejada: " +
                    "| D = Depositar" +
                    " | S = Sacar" +
                    " | E = Sair");
            //D - deposito, S - saque, E - sair
            String operation = scanner.nextLine();

            if (operation.equals("D")){
                System.out.println("Valor a ser depositado: R$");
                double value = scanner.nextDouble();
                account.cashIn(value);
            } else if (operation.equals("S")) {
                System.out.println("Valor de saque: R$");
                double value = scanner.nextDouble();
                if (!account.cashOut(value)) {
                    System.out.println("Operação falhou, seu saldo é insuficiente!");
                }
            } else if (operation.equals("E")){
                break;
            } else {
                System.out.println("Comando invalido, tente novamente.");
            }

            scanner = new Scanner(System.in);
            //cada loop um scanner diferente, evitando que fique repetindo.
        }
    }
}
