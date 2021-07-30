package Test7.entity.student;

public class SecondaryStudent extends Student{

    private static int secondaryCount;
    public SecondaryStudent(String name) {
        super(name);
        secondaryCount++;
    }

    public static int getSecondaryCount() {
        return secondaryCount;
    }
}
