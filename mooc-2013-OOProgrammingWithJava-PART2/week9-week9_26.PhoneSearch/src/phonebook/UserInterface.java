package phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner reader;
    private Map<String, Person> person;
    private Map<String, Person> phone;
    
    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.person = new HashMap<String, Person>();
        this.phone = new HashMap<String, Person>();
    }
    
    public void init() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        
        this.command();
    }
    
    public void command() {
        
                while (true) {
            System.out.println("command: ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                this.case1();
            } else if (command.equals("2")) {
                this.case2();
            } else if (command.equals("3")) {
                this.case3();
            } else if (command.equals("4")) {
                this.case4();
            } else if (command.equals("5")) {
                this.case5();
            } else if (command.equals("6")) {
                this.case6();
            } else if (command.equals("7")) {
                this.case7();
            }
        }
        
//        while (true) {
//            System.out.print("\ncommand: ");
//            try {
//                int command = this.reader.nextInt();
//                switch (command) {
//                    case 1: {
//                        this.case1();
//                        break;
//                    }
//                    case 2: {
//                        this.case2();
//                        break;
//                    }
//                    case 3: {
//                        this.case3();
//                        break;
//                    }
//                    case 4: {
//                        this.case4();
//                        break;
//                    }
//                    case 5: {
//                        this.case5();
//                        break;
//                    }
//                    case 6: {
//                        this.case6();
//                        break;
//                    }
//                    case 7: {
//                        this.case7();
//                        break;
//                    }
//                    
//                    default:
//                        break;
//                }
//            } catch (Exception e) {
//                break;
//                
//            }
//            
//        }
        
    }
    
    public void case1() {
        
//        System.out.print("whose number: ");
//        String name = this.reader.next();
//        System.out.print("number: ");
//        String number = this.reader.next();
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String number = reader.nextLine();
        
        
        Person person = new Person(name);
        person.addNumber(number);
        if (this.person.containsKey(name)) {
            
            this.person.get(name).addNumber(number);
            this.phone.put(number, person);
            
            return;
            
        }

//        here we make the person object 
//        here we add the person and its name to our map of persons 
        this.person.put(name, person);

//        now we will add the person and its number to map of numbers
        this.phone.put(number, person);
        
    }
    
    public void case2() {
        
//        System.out.print("whose number: ");
//        String name = this.reader.next();
                System.out.println("whose number: ");
        String name = reader.nextLine();
        if (this.person.containsKey(name)) {
            
            for (String num : this.person.get(name).getNumbers()) {
                
                System.out.println(" " + num);
                
            }
            
        } else {
            
            System.out.println("  not found");
        }
        
    }
    
    public void case3() {
        
//        System.out.print("number: ");
//        String number = this.reader.next();
        System.out.println("number: ");
        String number = reader.nextLine();
        
        if (this.phone.containsKey(number)) {
            System.out.println(" " + this.phone.get(number).getName());
            
        } else {
            
            System.out.println("  not found");
        }
        
    }
    
    public void case4() {
        
//        System.out.print("whose address: ");
//        String name = this.reader.next();
//        System.out.print("street: ");
//        String street = this.reader.next();
//        System.out.print("city: ");
//        String city = this.reader.next();
        System.out.println("whose address: ");
        String name = reader.nextLine();
        System.out.println("street: ");
        String street = reader.nextLine();
        System.out.println("city: ");
        String city = reader.nextLine();
        
        String address = street + " " + city;
        if (this.person.containsKey(name)) {
            
            this.person.get(name).addAddress(address);
            
        } else {

//        here we make the person object 
            Person person = new Person(name);
            person.addAddress(address);
//        here we add the person and its name to our map of persons 
            this.person.put(name, person);
        }
    }
    
    public void case5() {
        
//        System.out.print("whose information: ");
//        String name = this.reader.next();
        System.out.println("whose information: ");
        String name = reader.nextLine();
        
        if (!this.person.containsKey(name)) {
            System.out.println("  not found");
            
        } else {
            
            if (this.person.get(name).getAddress() == "nopes") {
                System.out.println("  address unknown");
                
            } else {
                System.out.println("  address:" + this.person.get(name).getAddress());
                
            }
            
            if (!this.person.get(name).getNumbers().isEmpty()) {
                System.out.println("  phone numbers:");
                for (String num : this.person.get(name).getNumbers()) {
                    
                    System.out.println("   " + num);
                    
                }
                
            } else {
                
                System.out.println("  phone number not found");
            }
        }
    }
    
    public void case6() {
        
//        System.out.print("whose information: ");
//        String name = this.reader.next();
        System.out.println("whose information: ");
        String name = reader.nextLine();
        
        if(this.person.containsKey(name)){
        
                for (String num : this.person.get(name).getNumbers()) {
            
            this.phone.remove(num);
        }
        
        this.person.remove(name);
        
        }
        

        
    }
    
    public void case7() {
//        
//        System.out.print("keyword (if empty, all listed): ");
//        String key = this.reader.next();
        System.out.println("keyword (if empty, all listed): ");
        
        String key = reader.nextLine();
        
        
        
                   
        
        if (key.isEmpty()) {
            
 ArrayList<String> names = new ArrayList<String>();
            
            for (String name : this.person.keySet()) {
                
                names.add(name);
                
            }
            
            Collections.sort(names);
            
            for (String name : names) {
                
                this.printKeys(this.person.get(name));
                
            }
            
        } else {
            boolean keyFound = false;
             ArrayList<String> names = new ArrayList<String>();
            for (Person person : this.person.values()) {
                
                
                
                if (person.getName().contains(key) || person.getAddress().contains(key)) {
                    names.add(person.getName());
                  
                    
                    keyFound = true;
                    
                }
                
            }
            Collections.sort(names);
            
            for (String name : names) {
                
                this.printKeys(this.person.get(name));
                
            }
            
            
            
            if (keyFound == false) {
                System.out.println(" keyword not found");
            }
        }
    }
    
    public void printKeys(Person person) {
        
        System.out.println("\n");
        System.out.println(" " + person.getName());
        
        if (person.getAddress() == "nopes") {
            
            System.out.println("  address unknown");            
        } else {
            System.out.println("  address: " + person.getAddress());
            
        }
        
        if (person.getNumbers().isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String num : person.getNumbers()) {
                
                System.out.println("   " + num);
                
            }
        }
        
    }
}
