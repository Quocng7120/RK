package Ex5.News;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        float AverageRate;
        Scanner scanner = new Scanner(System.in);
        int[] Rates = new int[3];
        for(int rate : Rates)
        {
            System.out.println("Nhập điểm đánh giá: ");
            rate = scanner.nextInt();
        }

        AverageRate = (float) (Rates[0] + Rates[1] + Rates[2]) / 3;
        scanner.close();

        System.out.println(AverageRate);
    }
}
