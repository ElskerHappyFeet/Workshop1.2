import java.util.UUID;

public class VentilationActuator extends Actuator {

    public VentilationActuator(String name, UUID id) {
        super(name, id);
    }

    @Override
    public void setValue(double value)
    {
        this.value=value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
