package Test7.entity.finalEx2;

public class Student {
    private final int id;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + getId() + '\'' + "name='" + name + '\'' + '}';
    }

    public static final void study()
    {
        System.out.println("Đang học bài…");
    }
}
