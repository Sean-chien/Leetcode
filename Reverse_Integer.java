import java.util.Scanner;
public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        int x = res.nextInt();
        int result = 0;

        while (x != 0) {
            int reminder = x % 10;
            int newResult = result * 10 + reminder;
            if ((newResult - reminder)/10 != 10 ) {
                result = newResult;
                x = x/10;
                System.out.println(result);
            }

        }
    }
}
