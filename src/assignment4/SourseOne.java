package assignment4;

public class SourseOne {
    private final Location location;
    private final int temperature;
    private final int windMark;
    private final int pressureMark;
    private final int visibilityMark;

    public SourseOne(Location location, int temperature, int windMark, int pressureMark, int visibilityMark) {
        this.location = location;
        this.temperature = temperature;
        this.windMark = windMark;
        this.pressureMark = pressureMark;
        this.visibilityMark = visibilityMark;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getWindMark() {
        return this.windMark;
    }

    public int getPressureMark() {
        return this.pressureMark;
    }

    public int getVisibilityMark() {
        return this.visibilityMark;
    }
}
