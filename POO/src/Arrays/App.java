package Arrays;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //quando eu defino um ArrayList nao preciso especificar o tamanho pq ele aloca espaco dinamicamente pra mim
        List<User> users = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            User actual = new User("Nome " + i, "Sobrenome " + i);
            users.add(actual);
            i++;
        }

        System.out.println(users.get(9).getFirstName());
        System.out.println(users.get(9).getLastName());

        //botei 10, qdo chego no 10, consigo adicionar mais
            User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }
}
