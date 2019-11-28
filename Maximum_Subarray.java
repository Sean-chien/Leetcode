public class Maximum_Subarray {
    public static void main(String[] args) {
        int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = nums[0];
        int sum = nums[0];

        for (int i = 0;i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }
        System.out.println(result);

    }
}
