public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums[0] > nums[nums.length - 1]) {
            return nums.length;
        }
        int start = 0;
        int end = nums.length;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    start = Math.max(start, j);
                    end = Math.min(end, i);
                }
            }
        }
        if (start - end > 0) {
            return start - end +1;
        }else {
            return 0;
        }

    }
}
