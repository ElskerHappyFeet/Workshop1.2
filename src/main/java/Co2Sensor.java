import java.util.Random;

public class Co2Sensor extends Sensor {

    //metode
    @Override
    public double getValue(){
        Random random = new Random();
        return random.nextDouble()*1.2;
    }

    @Override
    public String toString() {
        String temeperatur = "The temperature in current building is" +random.nextDouble()*1.2;
        return temeperatur;

    }
}
