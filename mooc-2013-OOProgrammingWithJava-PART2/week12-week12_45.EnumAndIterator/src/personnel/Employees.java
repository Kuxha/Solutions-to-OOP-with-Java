package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);

    }

    public void add(List<Person> persons) {
        for (Person person : persons) {

            this.employees.add(person);

        }

    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    public void print(Education education) {
       Iterator<Person> iterator = this.employees.iterator();
       while(iterator.hasNext()){
           Person person = iterator.next();
       
        if (person.getEducation() == education) {
                System.out.println(person); 
                
                // we can't use iterator next here ok .since we dont want it to iterate again . i guess. dunno

            }
       
       }
    }

    public void fire(Education education) {

        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {

            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }

        }

    }
}
