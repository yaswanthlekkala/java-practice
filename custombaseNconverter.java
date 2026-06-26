import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int b = sc.nextInt();

        String digits = "0123456789ABCDEF";

        if (num == 0) {
            System.out.println("0");
            return;
        }

        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }

        String result = "";

        while (num > 0) {
            int rem = num % b;
            result = digits.charAt(rem) + result;
            num = num / b;
        }

        if (negative)
            result = "-" + result;

        System.out.println(result);
    }
}