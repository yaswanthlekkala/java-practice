import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int deleteIndex = scanner.nextInt();
        int[] result = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != deleteIndex) {
                result[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
