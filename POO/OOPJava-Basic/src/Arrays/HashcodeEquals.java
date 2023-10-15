package Arrays;

public class HashcodeEquals {
    public static void main(String[] args) {
        User userY = new User("Yasmine", "Oenning");
        User userZ = new User("Lucas", "Tomazzoni");
        User userW = userY;
        User userM = new User("Lucas", "Tomazzoni");

        //HASHCODE -> identificador unico (sequencia de caracteres) que identifica o objeto
        System.out.println(userY); // -> HashcodeY
        System.out.println(userZ); // -> HashcodeZ
        //aponta mesmo hashcode que o user Y pq é o mesmo objeto
        System.out.println(userW); // -> HashcodeY
        System.out.println(userZ.equals(userM)); //aponta false pq é hashcode diferente.
        //EQUALS USA O HASHCODE PRA COMPARAR

        //Reescrevo o meu .equals no meu user
        //Agora a comparacao vai dar true
        //Uso o hashcode equals pra comparar estruturas identicas

    }
}
