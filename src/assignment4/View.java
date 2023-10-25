package assignment4;

public class View {

    public void show(Model model) {
        System.out.println(model.getLocation().city());
        System.out.println("Temperature: " + model.getTemperature());
        System.out.println("Visibility: " + model.getVisibilityMark());
        System.out.println("Pressure: " + model.getPressureMark());
        System.out.println("wind: " + model.getWindMark());
    }
}
