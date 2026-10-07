import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        }
    }
}
