import java.util.Scanner;
import java.util.HashMap;

public class BadPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        long totalPairs = (long) n * (n - 1) / 2;
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int key = i - nums[i];

            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        long badPairs = totalPairs - goodPairs;

        System.out.println(badPairs);

        sc.close();
    }
}