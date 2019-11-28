import java.util.Scanner;
public class Contains_Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = s.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] == nums[i+1]) {
                int a = i++;
                System.out.println("True");
                System.out.println(a);
            }else {
                int b = ++i;                   // 1 //
                System.out.println("False");
                System.out.println(b);
            }

        }
    }
}
