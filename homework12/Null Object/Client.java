public class Client {
    
    public static void main(String[] args) {
        WarningLight[] lights = new WarningLight[3];
        lights[0] = new OilLevelLight();
        lights[1] = new BrakeFluidLight();
        lights[2] = new NullObjectLight(); // empty slot
        
        // No need to test for null...
        for (WarningLight currentLight : lights) {
            currentLight.turnOn();
            currentLight.turnOff();
            System.out.println(currentLight.isOn());
        }
    }
    
}