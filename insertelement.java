import java.util.*;
public class  Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        int value = scanner.nextInt();
        int[] result = new int[n + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == index) {
                result[i] = value;
            } else {
                result[i] = arr[j++];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
