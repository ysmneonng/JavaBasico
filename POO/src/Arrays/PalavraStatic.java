package Arrays;

public class PalavraStatic {
    public static void main(String[] args) {
        //STATIC
        //Class é um molde responsavel por criar multiplos objetos
        User userG = new User("Yasmine", "Oenning");
        userG.setFirstName("Yas"); //só muda no userG
        User userH = new User("Lucas", "Tomazzoni");
        userH.setFirstName("Tomate");

        String firtsName = userG.getFirstName();
        String firtsNameUserH = userH.getFirstName();
        System.out.println(firtsName);
        System.out.println(firtsNameUserH);

        //QUANDO SE TEM UMA PROPRIEDADE STATIC, NAO ALTERA COMPORTAMENTO DO OBJETO VIVO
        User yasmine = new User("Yasmine", "Oenning");
        User tomazzoni = new User("Lucas", "Tomazzoni");

        //Qdo a variavel se torna STATIC, Ela incrementa em tudo e nao só em um objeto separado
        //antes de ser static ia retornar 3 e depois 6
        //quando é static o valor é compartilhado em todas as variaveis, entao retorna 9 e 9
        yasmine.setCount(1);
        yasmine.setCount(1);
        yasmine.setCount(1);
        tomazzoni.setCount(2);
        tomazzoni.setCount(2);
        tomazzoni.setCount(2);

        System.out.println(yasmine.getCount());
        System.out.println(tomazzoni.getCount());
    }



}
