import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            count ++;
            if (i + 1 == length || nums[i] != nums[i+1]) {
                if (count == 1) {
                    return nums[i];
                }
                count = 0;
            }
        }
        return -1;
    }
}
