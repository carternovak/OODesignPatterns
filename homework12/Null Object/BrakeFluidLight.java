public class BrakeFluidLight implements WarningLight {
    
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Brake fluid light ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Brake fluid light OFF");
    }
    
    public boolean isOn() {
        return on;
    }
    
}