package Loops;

import java.util.Random;

public class Megasena {
//geracao de senhas para megasena
    public static void main(String[] args) {
        Random generate = new Random();


        // while (true) -> looping infinito
        // while (i < 60) -> looping com saida
//        int i = 0;
//        while (i < 6) {
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            i++;
           // i = i + 1 ==  i++

        // for(;;) -> while(true)
        for (int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }
}
