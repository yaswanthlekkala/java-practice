import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int[] subArray = Arrays.copyOfRange(arr, start, end);
        System.out.println(Arrays.toString(subArray));
    }
}
