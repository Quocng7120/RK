import java.util.Locale;

public class Ex2 {
    public static void main(String[] args) {

        //câu 1
        int a = 5;
        System.out.println(a);

        //câu 2
        int b = 10000000;
        System.out.printf(Locale.US, "%,d%n", b);

        //câu 3
        float c = 5.567098f;
        System.out.printf("%5.4f%n", c);

        //câu 4
        String name = new String("Nguyễn Duy Quốc");
        System.out.println("Tên tôi là" + name + " và tôi độc thân \n");

        //Câu 5
    }
}
