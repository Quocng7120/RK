package Test7.entity.student;

public class PrimaryStudent extends Student{

    private static int primaryCount;

    public PrimaryStudent(String name) {
        super(name);
        primaryCount++;
    }

    public static int getPrimaryCount() {
        return primaryCount;
    }
}
