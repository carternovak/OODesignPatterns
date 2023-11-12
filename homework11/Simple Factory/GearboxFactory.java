public class GearboxFactory {
    
    public enum Type {AUTOMATIC, MANUAL};
    
    public static Gearbox create(Type type) {
        if (type == Type.AUTOMATIC) {
            return new AutomaticGearbox();
        } else {
            return new ManualGearbox();
        }
    }
    
}