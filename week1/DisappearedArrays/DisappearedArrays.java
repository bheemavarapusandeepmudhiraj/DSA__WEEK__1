import java.util.Scanner;
import java.util.ArrayList;

public class DisappearedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            present[nums[i]] = true;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        System.out.println(result);

        sc.close();
    }
}