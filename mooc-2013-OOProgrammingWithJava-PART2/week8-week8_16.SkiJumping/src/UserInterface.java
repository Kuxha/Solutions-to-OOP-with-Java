
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;

public class UserInterface {

    private Scanner reader;
    private int round;
    private ArrayList<Player> participants;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.participants = new ArrayList<Player>();
        this.round = 0;
    }

    public void init() {

        System.out.println("Kumpula ski jumping week\n");
        this.add();

    }

    public void add() {

        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        boolean flag = true;
        while (flag) {

            System.out.print("  Participant name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                System.out.println("\nThe tournament begins!");

                
                
                this.rounds();
                flag  = false;

            } else {
                this.participants.add(new Player(name));
            }

        }

    }

    
    public void rounds() {
        
      
      while(true){  
          
          
          System.out.print("\nWrite \"jump\" to jump; otherwise you quit:  ");
                String com = reader.nextLine();
    
    if (com.equals("jump")) {
            
        

        System.out.println("\nRound " + (++this.round));

        System.out.println("\nJumping order: ");

        int j = 1;
        Collections.reverse(this.participants);
        
        for (Player participant : this.participants) {
            
            
            System.out.print("  " + j +  ". ");
            System.out.print(participant.name() + " ("
                    + participant.points() + " points)\n");

            j++;
             participant.jump();
            
            
        }
        
       
        Collections.sort(this.participants);
        System.out.println("\nResults of round " + this.round);

        for (Player participant : this.participants) {

            System.out.println("  " + participant.name());
            System.out.println("    length: " + participant.lengthOfJump());
            participant.judgeVotes();

        }
    }
    else if (com.equals("quit")) {

            this.results();
            break;
            
            
        }
      }
    }

    public void results() {

        System.out.println("\nThanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        
        Collections.sort(this.participants);
        
        int i = 1;
        for (Player participant : this.participants) {

            System.out.println(i + "           " + participant.name() + " ("
                    + participant.points() + " points)");
            participant.jumps();

            i++;
        }

    }

}
