package Intro;

public class App {
    public static void main(String[] args) {
        //declaracao do novo tipo USER - novo objeto usuario
        User user1 = new User();
        user1.firtsName = "Yasmine";
        user1.lastName = "Oenning";
        user1.setLogged(true);

        User user2 = new User();
        user2.firtsName = "Lucas";
        user2.lastName = "Tomazzoni";
        String fullName = user2.getFullName();

        System.out.println(user1.firtsName);
        System.out.println(fullName);

        Guitar fender = new Guitar();
        fender.name = "Fender";
        fender.chords = 6;

        Guitar ibanez = new Guitar();
        ibanez.name = "Ibanez";
        ibanez.chords = 6;





    }
}
