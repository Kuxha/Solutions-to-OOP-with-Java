package phonebook;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private Set<String> numbers;
    private String address;

    public Person(String name) {
        this.address = "nopes";
        this.name = name;
        this.numbers = new HashSet<String>();
    }

    public void add(String address, String number) {

        this.address = address;
        this.numbers.add(number);

    }

    public void addNumber(String number) {

        this.numbers.add(number);

    }

    public void addAddress(String address) {

        this.address = address;

    }

    public Set<String> getNumbers() {
        return this.numbers;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

}
