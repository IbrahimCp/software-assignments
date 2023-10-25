package assignment4;

public class SourseOneAdapter extends Model {
    public SourseOneAdapter(SourseOne sourseOne) {
        super(sourseOne.getLocation(), sourseOne.getTemperature(), sourseOne.getWindMark(), sourseOne.getPressureMark(), sourseOne.getVisibilityMark());
    }
}
