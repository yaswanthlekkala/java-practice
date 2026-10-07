import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();
        List<Integer> filter = new ArrayList<>();
        for (int x : arr) {
            if (x > t) {
                filter.add(x);
            }
        }
        System.out.println(filter);
    }
}
