import java.util.Random;

public class TemperatureSensor extends Sensor{

    @Override
    public double getValue(){
        Random random = new Random();
        return random.nextDouble()*1.3;
    }

}
