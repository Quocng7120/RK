import java.time.LocalDate;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {

        //Câu 1
        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a);

        //Câu 2
        float y = random.nextFloat();
        System.out.println(y);

        //Câu 3
        String[] names = { "Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C", "Nguyễn Văn D" };
        int i = random.nextInt(names.length);
        System.out.println(names[i]);

        //Câu 4
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDay);

        //Câu 5

    }
}
