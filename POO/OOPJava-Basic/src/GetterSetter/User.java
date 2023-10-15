package GetterSetter;

public class User {
    private String firstName;
    private String lastName;

    //SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
        //this. -> acessa a propriedade de campo desse objeto e armazena dentro dela esse parametro
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //GETTER
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
