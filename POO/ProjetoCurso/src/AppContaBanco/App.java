package AppContaBanco;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank YasmineBank = new Bank("0013");
        //C - Criar conta, E - Sair
        while (true){
            System.out.println("Digite o código da operação desejada: " +
                    "| C = Criar Conta" +
                    " | E = Sair ");
            String operation = scanner.nextLine();

            if (operation.equals("C")) {
                System.out.println("Digite o seu nome: ");
                String name = scanner.nextLine();
                Account account = YasmineBank.generateAccount(name);
                YasmineBank.insertAccount(account);

            }else if (operation.equals("E")) {
                break;
            } else {
                System.out.println("Comando invalido, tente novamente.");
            }
        }

        List<Account> accountList = YasmineBank.getAccounts();
        for (Account cc : accountList) {
            System.out.println(cc);
        }
        YasmineBank.outputTotal();

    }
    static void operateAccount(Account account) {
        Scanner scanner = new Scanner(System.in);

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
