package AppContaBanco;

public class Account {

    //AG, CONTA, NOME
    private static final int MAX_LENGHT = 12; //constante com valor maximo de 12 caracteres.
    private String ag;
    private String cc;
    private String name;

    //DEPOSITO E SAQUE
    private double balance;

    //MESSAGE
    private Log logger;

    //AG, CONTA, NOME
    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGHT) {
            this.name = name.substring(0, MAX_LENGHT);
        } else {
            this.name = name;
        }
    }

    //DEPOSITO E SAQUE
    public void cashIn(double value) {
        balance = balance + value;
        logger.out("DEPOSITO - R$:" + value + "Seu saldo é de R$: " + balance);
    }

    public boolean cashOut(double value) {
        if (balance < value) {
            logger.out("SAQUE - R$:" + value + " Saldo insuficiente! Seu saldo é de R$: " + balance);
            return false;
        } else {
            balance = balance - value;
            logger.out("SAQUE - R$:" + value + " Seu saldo é de R$: " + balance);
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    //EXTRATO
    @Override
    public String toString() {
        return "A conta " + this.name + " " + this.ag + " | " + this.cc + " possui saldo de: R$: " + balance;
    }
}
