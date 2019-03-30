
package application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean on ;
    public Thermometer(){
    
    this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        
        Random random = new Random();
        if(isOn()){
        
        return (random.nextInt(60)-30);
        }
        else {
            throw new IllegalStateException("Thermometer is off");
        }
        
    }
    
}
