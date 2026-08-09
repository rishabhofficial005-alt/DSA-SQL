class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxsum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            // Keep window size <= k
            while (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                sum -= nums[left];
                left++;
            }

            // Exactly k elements AND all are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}