package Variaveis;

import java.util.Scanner;

public class ConverterPrimitivos {
    public static void main(String[] args) {
        //CONVERTER TIPOS PRIMITIVOS
        // CASTING

        double dd = 10.10;
        short ss = 32;
        //tipos diferentes, como fazer uma divisao disso?
        //converter em float - definir o tipo q quero, botar entre parenteses p o q quero converter
        float x = (float) dd / ss;

        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();
        //conversao do decimal para inteiro


        System.out.println(dd / ss);
        System.out.println(x);
        System.out.println(z);
    }
}
