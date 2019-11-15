import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // "-1 0 3 5 9 12"
        // 3
        int[] nums = {-1,0,3,5,9,12};

        int target = input.nextInt();
        for (int i = 0; i < nums.length/2; i++) {
            if (nums[i] == target) {
                System.out.println(target + " exists in nums and its index is " + i);

            }else {
                System.out.println(target + " does not exist in nums so return -1");
            }
        }
    }
}
