import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int s = scanner.nextInt();

        for (int i = 0; i < s; i++) {
            int r = random.nextInt(100);
            try {
                if (r < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                continue;
            }
            double q = Math.sqrt(r);
            if ((((int) q) * ((int) q)) == r) {
                System.out.println(r);
            }
        }
    }
}