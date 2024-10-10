package Problem3;

public class Person {
    private final String lastName;
    private final String firstName;
    private final Address home;

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public String toString() {
        return firstName + " " + lastName + " " + home.toString();

    }
}
