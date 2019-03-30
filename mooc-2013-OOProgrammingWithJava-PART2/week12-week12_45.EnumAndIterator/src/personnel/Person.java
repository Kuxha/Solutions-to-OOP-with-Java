package personnel;

public class Person {

    private String name;
    private Education qualification;

    public Person(String name, Education qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public Education getEducation() {
        return this.qualification;

    }

    @Override
    public String toString() {
        return name + ", " + qualification;

    }

}
