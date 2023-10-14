package Strings;

public class ManipulandoStrings {
    public static void main(String[] args) {
        String x = "Ola mundo, esse é o novo mundo";
        System.out.println(x.length());
        // .length -> devolve a quantidade de caracteres que tem na variavel x
        System.out.println(x + " concatenada");
        // variavel x + parte adicionada
        System.out.println(x.contains("novo"));
        // .contains -> avalia se a frase em questao contem a palavra "novo"
        System.out.println(x.indexOf("mundo"));
        // .indexOf -> retorna onde que comeca a minha palavra "mundo" (ex. caracter 4)
        System.out.println(x.lastIndexOf("mundo"));
        // .lastIndexOf -> retorna a ultima sentenca da palavra mundo (caracter 25)
        System.out.println(x.toUpperCase());
        // .toUpperCase -> deixa tudo em maiusculo
        System.out.println(x.toLowerCase());
        // .toLowerCase -> deixa tudo em minusculo
        System.out.println(x.trim());
        // .trim -> remove espaços desnecessarios
        System.out.println(x.substring(9));
        // .substring(9) -> comeca a pegar a partir do caracter 9
        System.out.println(x.equals("ola"));
        // .equals() -> compara com algo
    }
}
