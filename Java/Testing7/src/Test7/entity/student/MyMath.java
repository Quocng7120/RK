package Test7.entity.student;

public class MyMath {

    public static int min(int[] mang)
    {
        int kt = mang[0];
        for (int so : mang)
        {
            if (so < kt)
                kt = so;
        }

        return kt;
    }

    public static int sum(int a, int b)
    {
        return a+b;
    }
}
