package GetterSetter;

public class App {

    public static void main(String[] args) {
        User userA = new User();
        userA.setFirstName("Yasmine oenning");

        User userB = new User();
        userB.setFirstName("nome");
        userB.setLastName("nominho");

        System.out.println(userA.getFirstName());
        System.out.println(userB.getFirstName() + userB.getLastName());

    }

}
