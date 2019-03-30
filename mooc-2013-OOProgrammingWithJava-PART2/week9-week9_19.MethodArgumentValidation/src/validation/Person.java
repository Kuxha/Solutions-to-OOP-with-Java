package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if(name == null || name.isEmpty() || name.length()>40){
        throw new IllegalArgumentException("enter a  Name which is  not null, empty, or longer than 40 characters ");
        }
        
        if(age>120 || age<0){
        throw new IllegalArgumentException("enter a  age between 0-120 ");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
