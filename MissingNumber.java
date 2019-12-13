import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length < 1 ) {
            return 0;
        }
        Arrays.sort(nums);
        int ans;
        for (ans = 0; ans < nums.length; ans++) {
            if (ans != nums[ans]) {
                return ans;
            }
        }
        return ans;
    }
}
