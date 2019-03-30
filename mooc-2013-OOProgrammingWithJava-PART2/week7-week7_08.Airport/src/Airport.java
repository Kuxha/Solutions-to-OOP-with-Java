
import java.util.Scanner;

public class Airport {
    
    Planes plane;
    private Scanner reader;
    
    public Airport(Scanner reader) {
        this.plane = new Planes();
        this.reader = reader;
    }

    public void start() {
        
        this.airport();
        this.flight();
        
    }
    
    public void airport() {
        System.out.println("Airport panel\n" +
"--------------------\n");
        
        OUTER:
        while (true) {
            System.out.println("Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit");
            char operation = this.reader.next(".").charAt(0);
            switch (operation) {
                case '1': {
                    System.out.print("Give plane ID: ");
                    String id = this.reader.next();
                    System.out.print("Give plane capacity: ");
                    int capacity = this.reader.nextInt();
                    this.plane.addPlanes(id, capacity);
                    
                    break;
                }
                case '2': {
                    System.out.print("Give plane ID: ");
                    String id = this.reader.next();
                    System.out.print("Give departure airport code: ");
                    String dep = this.reader.next();
                    System.out.print("Give destination airport code: ");
                    String des = this.reader.next();
                    plane.addFlights(id, dep, des);
                    break;
                }
                case 'x':
                    break OUTER;
                default:
                    break;
            }
        }
    }
    
    public void flight() {
        
        System.out.println("\nFlight service\n"
                + "------------\n");
        OUTER:
        while (true) {
            
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            
            char operation = this.reader.next(".").charAt(0);
            
            switch (operation) {
                case '1': {
                    this.plane.printPlanes();
                    break;
                    
                }
                case '2': {
                    this.plane.printFlights();
                    break;
                }
                case '3': {
                    System.out.print("Give plane ID: ");
                    String id = this.reader.next();
                    System.out.println(this.plane.printPlaneInfo(id));
                    break;
                }
                case 'x':
                    break OUTER;
                default:
                    break;
            }
            
        }
        
    }
    
}
