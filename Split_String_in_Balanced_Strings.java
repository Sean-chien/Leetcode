import java.util.Scanner;

public class Split_String_in_Balanced_Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        System.out.println("The String is: " + s);
        int a = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                a++;
            } else {
                a--;
            }
            if (a == 0) {
                result ++;
            }
            System.out.println(result);
        }

    }
}
