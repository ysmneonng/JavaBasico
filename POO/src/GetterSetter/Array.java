package GetterSetter;

public class Array {
    public static void main(String[] args) {
        //User[] nome = new User[quantidadeNomes]
        // |x|x|x|x|x|
        // 0 a 9
        User[] users = new User[10];


        for(int i = 0; i < users.length; i++) {
            User actual = new User();
            actual.setFirstName("Nome" + i);
            actual.setLastName("Sobrenome" + i);
            users[i] = actual;
            //criei um objeto (actual), defini ele e depois armarzenei dentro da minha colecao
            // baseado no indice que esta sendo feito o looping
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
        //colecoes sao trabalgadas dessa forma
        //acesso ao max do valor (.lenght)
    }
}
