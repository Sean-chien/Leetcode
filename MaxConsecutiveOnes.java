public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i< nums.length; i++) {
            int num = nums[i];
            sum = (sum + num)*num;
            result = Math.max(sum, result);
        }
        return result;
    }
}
