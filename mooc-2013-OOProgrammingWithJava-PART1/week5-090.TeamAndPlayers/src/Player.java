
public class Player {
    private int goals;
    private String name;
    
    public Player(String name){
        this.name = name;
    }
    public Player(String name,int goals){
        this.name = name;
        this.goals = goals;
    }
    public String toString(){
        return "Player: " +this.name + ", goals " +this.goals ;
    }
    public int goals(){
        return this.goals;
    }
    
    public String getName(){
        return this.name;
    }
}
