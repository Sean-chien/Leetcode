import java.util.Scanner;

public class To_LowerCase {
    public static void main(String[] args) {
        String strLower, strUpper;
        Scanner str = new Scanner(System.in);
        System.out.print("Enter one words in Uppercase : ");
        strUpper = str.nextLine();

        strLower = strUpper.toLowerCase();
        System.out.println("Equivalent Word/Name in Lowercase : " + strLower);
    }
}
