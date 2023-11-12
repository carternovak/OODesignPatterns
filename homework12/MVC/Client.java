public class Client {
    
    public static void main(String[] args) {
        // Create the MVC classes
        SatNavModel model = new SatNavModel();
        SatNavView view = new SatNavView(model);
        SatNavController controller = new SatNavController(model, view);
        
        // Show the view
        view.show();
    }
    
}