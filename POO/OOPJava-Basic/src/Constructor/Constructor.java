package Constructor;

public class Constructor {
        private String firstName;
        private String lastName;

    public Constructor(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }
    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

}

