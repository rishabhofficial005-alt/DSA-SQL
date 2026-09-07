class Solution {
    public int singleNonDuplicate(int[] nums) {

        int st = 0;
        int end = nums.length - 1;

        while (st < end) {

            int mid = st + (end - st) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Correct pair: single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2;
            }
            // Pair is broken: single element is on the left
            else {
                end = mid;
            }
        }

        return nums[st];
    }
}