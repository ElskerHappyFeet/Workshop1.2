import java.util.List;

public class Building {
    //Attributter
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    //Constructor
    public Building(List<Sensor> sensors, List<Actuator> actuators) {
        this.sensors = sensors;
        this.actuators = actuators;
    }

    //Metoder

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void setActuators(List<Actuator> actuators) {
        this.actuators = actuators;
    }

    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    public void removeActuator(Actuator actuator) {
        actuators.remove(actuator);
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void removeSensor(Sensor sensor) {
        sensors.remove(sensor);
    }

}
