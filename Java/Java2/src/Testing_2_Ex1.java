import java.util.Random;

public class Testing_2_Ex1 {
    public static void main(String[] args) {

        //Câu 1
        float l1, l2;
        l1 = 5240.5F;
        l2 = 10970.055f;

        int lint1 = (int) l1;
        int lint2 = (int) l2;

        System.out.println("Lương của Accout1 là: " + lint1);
        System.out.println("Lương của Accout2 là: " + lint2);

        //Câu 2
        Random random = new Random();
        int a = random.nextInt(100000);
        String s = String.valueOf(a);



        String st = new String("Nguyễn Duy Quốc");
        int i = st.length();
        System.out.println(s);

        System.out.println("Câu 4: " + Thuong(3.0f, 5.2f));




    }

    private static float Thuong(float a, float b)
    {
        return a/b;
    }
}
