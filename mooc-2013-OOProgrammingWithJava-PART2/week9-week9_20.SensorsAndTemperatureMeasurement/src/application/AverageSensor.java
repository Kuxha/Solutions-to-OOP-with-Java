package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {

        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor Additional) {

        this.sensors.add(Additional);

    }

    public List<Integer> readings() {

        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                return false;
            }

        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();

        }

    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();

        }
    }

    @Override
    public int measure() {
        if (this.isOn() == false || this.sensors.isEmpty()) {

            throw new IllegalStateException(" ");

        }

        int total = 0;
        for (Sensor sensor : this.sensors) {
            total = total + sensor.measure();

        }
        this.readings.add(total / this.sensors.size());
        return total / this.sensors.size();

    }

}
