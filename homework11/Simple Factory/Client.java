public class Client {
    
    public static void main(String[] args) {
        // Create an automatic gearbox
        Gearbox auto = GearboxFactory.create(GearboxFactory.Type.AUTOMATIC);

        // Create a manual gearbox
        Gearbox manual = GearboxFactory.create(GearboxFactory.Type.MANUAL);
    }
    
}