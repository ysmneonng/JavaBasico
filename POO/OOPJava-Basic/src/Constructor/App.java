package Constructor;

public class App {

    public static void main(String[] args) {
        Constructor[] constructors = new Constructor[] {
                new Constructor("Yasmine","Oenning"),
                new Constructor("lucas","Tomate")
        };

        System.out.println(constructors[1].getFirstName());
    }
}
