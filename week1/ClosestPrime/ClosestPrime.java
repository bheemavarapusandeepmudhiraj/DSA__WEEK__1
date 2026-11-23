import java.util.Scanner;

public class ClosestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        boolean[] prime = new boolean[right + 1];

        for (int i = 2; i <= right; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= right; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    prime[j] = false;
                }
            }
        }

        int num1 = -1;
        int num2 = -1;
        int previous = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                if (previous != -1 && i - previous < minDiff) {
                    minDiff = i - previous;
                    num1 = previous;
                    num2 = i;
                }

                previous = i;
            }
        }

        System.out.println("[" + num1 + ", " + num2 + "]");

        sc.close();
    }
}