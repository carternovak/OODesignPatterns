public class OilLevelLight implements WarningLight {
    
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Oil level light ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Oil level light OFF");
    }
    
    public boolean isOn() {
        return on;
    }
    
}