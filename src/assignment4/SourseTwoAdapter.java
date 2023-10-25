package assignment4;

public class SourseTwoAdapter extends Model{
    public SourseTwoAdapter(SourseTwo sourseTwo) {
        super(sourseTwo.getLocation(), sourseTwo.getTemperature(), sourseTwo.getWindMark(), sourseTwo.getPressureMark(), sourseTwo.getVisibilityMark());
    }
}
