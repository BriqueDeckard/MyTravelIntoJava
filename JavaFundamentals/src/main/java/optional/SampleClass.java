package optional;

import java.util.Optional;

public class SampleClass {
    private Optional<String> firstName;
    private String lastName;
    private int age;

    public SampleClass(String firstName, String lastName, int age) {
        this.firstName = Optional.ofNullable(firstName);
        this.lastName = lastName;
        this.age = age;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Optional.ofNullable(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
