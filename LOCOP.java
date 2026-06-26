import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String digits = sc.next();

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        ArrayList<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return;
        }

        list.add("");

        for (int i = 0; i < digits.length(); i++) {
            String letters = map[digits.charAt(i) - '0'];
            ArrayList<String> temp = new ArrayList<>();

            for (String str : list) {
                for (int j = 0; j < letters.length(); j++) {
                    temp.add(str + letters.charAt(j));
                }
            }

            list = temp;
        }

        for (String str : list)
            System.out.println(str);
    }
}