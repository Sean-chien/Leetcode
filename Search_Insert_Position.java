public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length ; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                break;
            }
        }

        return i;
    }
}
