import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // "-1 0 3 5 9 12"
        // 3
        int[] nums = {-1,0,3,5,9,12};
        int target = input.nextInt();
        int left = 0;
        int right = nums.length -1;
        int mid = left + (left + right)/2;

        for (int i = 0; i < mid; i++) {
            if (nums[mid] == target) {
                System.out.println(target + "exists in nums and its index is " + i);
            }
            else if (nums[mid] < target) {
                left = mid +1;
            }
        }
    }
}
