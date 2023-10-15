package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SobrecargaMetodos {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //ADD String element
        nomes.add("Nome 1");
        nomes.add("Nome 2");
        nomes.add("Nome 3");
        nomes.add("Nome 4");

        //ADD int index, String element
        //mesmo comportamento mas faz de forma diferente.
        //P criar uma sobrecarga de metodos, precisamos criar um objeto User
        //Atirbuir classe a ele

        User userX = new User("Yasmine", "Oenning");
        System.out.println(userX.output());
        System.out.println(userX.output(false));

        //TO STRING
        //todo objeto criado tem um metodo oculto
        //imprimrindo o tostring imprime o nome da classe e o hashcode
        System.out.println(userX.toString());
        //se eu quiser formatar isso, posso reescrever esse metodo la no user.
        //mudei la, ta preformatado e vai retornar as infos de Usuario
        //output poderia ser substituido por tostring
    }

}
