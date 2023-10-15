package Arrays;

import java.util.Objects;

public class User {
        private String firstName;
        private String lastName;

        private static int count;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String output () {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
        if (showLastName) {
            return output();
        }
        return firstName;
    }

    //TOSTRING
    public String toString() {
        return "User {" +
                "firstName=" + firstName + "," +
                "lastName+" + lastName;
    }

    //STATIC -> pertence a classe e nao a um objeto isolado
    //metodos estaticos podem chamar metodos estaticos
    //this. se refere a um objeto vivo e dinamico
    public void setCount(int count) {
        this.count = this.count + count;
    }
    public int getCount() {
        return count;
    }

    //HASH N EQUALS
    //shift shift -> equals() e hashcode()
    // clico ali, delet o padrao e reescrevo o q eu quero em cima
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

