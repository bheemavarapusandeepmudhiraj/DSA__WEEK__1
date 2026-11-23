import java.util.Scanner;

public class Sqrtx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int result = 0;

        while ((long) result * result <= x) {
            result++;
        }

        System.out.println(result - 1);

        sc.close();
    }
}