package assignment4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        View view = new View();
        SourseTwo sourseTwo = new SourseTwo(
                new Location("Kazakhstan", "Almaty"),
                27,
                12,
                12,
                1200);
        SourseOne sourseOne = new SourseOne(
                new Location("Kazakhstan", "Almaty"),
                27,
                12,
                12,
                1200);
        Model modelOne = new SourseOneAdapter(sourseOne);
        Model modelTwo = new SourseTwoAdapter(sourseTwo);
        view.show(modelOne);
        view.show(modelTwo);
    }
}
